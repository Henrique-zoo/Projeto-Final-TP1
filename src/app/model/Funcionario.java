/*
 * Classe Funcionario que representa um funcionário no sistema. 
 * Essa classe herda os atributos e métodos da classe Pessoa.
 */
package app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Classe que representa um funcionário, incluindo informações como salário,
 * serviços ativos, e se o funcionário é administrador.
 * 
 * Também gerencia IDs disponíveis para reutilização e realiza operações
 * relacionadas a serviços e peças do estoque.
 * @author derickandrade
 */
public final class Funcionario extends Pessoa {
    
    // Salário do funcionário
    private double salario;
    
    // Quantidade de serviços concluídos pelo funcionário
    private int servicosFeitos;
    
    // Define se o funcionário possui privilégios de administrador
    private boolean admin;
    
    // Senha do funcionário
    private String senha;
    
    // Lista de serviços ativos atribuídos ao funcionário
    private final HashMap<Integer, Servico> servicosAtivos;
    
    // Fila de IDs livres disponíveis para reutilização
    private static PriorityQueue<Integer> idsLivres = new PriorityQueue<>();
    
    // Gerador de novos IDs caso não haja IDs livres
    private static int idGenerator = 8;

    /**
    * Construtor default da classe Funcionario
    */
    public Funcionario() {
        this.servicosAtivos = null;
    }

    /**
     * Construtor padrão utilizado para criar um funcionário com todos os atributos informados.
     * 
     * @param salario Salário do funcionário.
     * @param senha Senha do funcionário.
     * @param id ID do funcionário.
     * @param nome Nome do funcionário.
     * @param cpf CPF do funcionário.
     * @param email E-mail do funcionário.
     * @param telefone Telefone do funcionário.
     */
    public Funcionario(double salario, String senha, int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
        this.salario = salario;
        this.senha = senha;
        this.servicosAtivos = new HashMap<>();
    }
    
    /**
     * Construtor utilizado para cadastrar novos funcionários, reaproveitando IDs livres se disponíveis.
     * 
     * @param salario Salário do funcionário.
     * @param senha Senha do funcionário.
     * @param nome Nome do funcionário.
     * @param cpf CPF do funcionário.
     * @param email E-mail do funcionário.
     * @param telefone Telefone do funcionário.
     */
    public Funcionario(double salario, String senha, String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        if (!idsLivres.isEmpty()) {
            this.setId(idsLivres.poll());
        } else {
            this.setId(idGenerator++);
        }
        this.salario = salario;
        this.senha = senha;
        this.servicosAtivos = new HashMap<>();
    }

    /**
     * Construtor semelhante ao anterior, mas sem inicializar o salário.
     * 
     * @param senha Senha do funcionário.
     * @param nome Nome do funcionário.
     * @param cpf CPF do funcionário.
     * @param email E-mail do funcionário.
     * @param telefone Telefone do funcionário.
     */
    public Funcionario(String senha, String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        if (!idsLivres.isEmpty()) {
            this.setId(idsLivres.poll());
        } else {
            this.setId(idGenerator++);
        }
        this.senha = senha;
        this.servicosAtivos = new HashMap<>();
    }
    
    // Métodos getters e setters para os atributos da classe

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getServicosFeitos() {
        return servicosFeitos;
    }

    public void setServicosFeitos(int servicosFeitos) {
        this.servicosFeitos = servicosFeitos;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public HashMap<Integer, Servico> getServicosAtivos() {
        return servicosAtivos;
    }
    
    public void setServicosAtivos(Servico servico) {
        servicosAtivos.put(servico.getId(), servico);
    }
    
    /**
     * Completa um serviço atribuído ao funcionário, verificando se está pago.
     * Se o serviço estiver pago, ele é removido da lista de serviços ativos
     * e a quantidade de serviços feitos é incrementada.
     * 
     * @param servico Serviço a ser concluído.
     */
    public void completaSevico(Servico servico) {
        if (servico.isPago()) {
            servicosAtivos.remove(servico.getId());
            servicosFeitos++;
        }
    }
    
    /**
     * Gerencia as peças necessárias para um serviço, identificando as peças faltantes
     * no estoque e removendo as peças disponíveis.
     * 
     * @param servico Serviço que requer peças do estoque.
     * @return Lista de peças que estão faltando no estoque.
     */
    public ArrayList<Peca> pegarPecasNoEstoque(Servico servico) {
        ArrayList<Peca> pecasFaltantes = new ArrayList<>();
        for (Peca peca : servico.getVeiculo().getPecasComProblema()) {
            for (int i = 0; i < peca.getQtd(); i++) {
                if (Estoque.findPeca(peca.getTipoPeca()) == null) {
                    pecasFaltantes.add(peca);
                    Estoque.adicionarPeca(peca.getTipoPeca(), 0);
                } else if (Estoque.findPeca(peca.getTipoPeca()).getQtd() < 1) {
                    pecasFaltantes.add(peca);
                } else {
                    Estoque.removerPeca(peca.getTipoPeca(), 1);
                }
            }
        }
        return pecasFaltantes;
    }
    
    /**
     * Calcula o valor de um serviço, esvazia a lista de peças com problema do veículo
     * associado e define o serviço como consertado.
     * 
     * @param servico Serviço a ser consertado.
     * @param metodo Método de pagamento utilizado para o cálculo do valor.
     */
    public void consertarVeiculo(Servico servico, String metodo) {
        servico.calculaValor(metodo);
        servico.getVeiculo().esvaziarPecasComProblema();
        servico.setConsertado(true);
    }
    
    /**
     * Adiciona um ID à lista de IDs livres, permitindo sua reutilização futura.
     * 
     * @param id ID a ser adicionado.
     */
    public static void addIdLivre(int id) {
        idsLivres.add(id);
    }
}
