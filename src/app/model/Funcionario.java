/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author derickandrade
 */
public final class Funcionario extends Pessoa {
    
    private double salario;
    private int servicosFeitos;
    private boolean admin;
    private String senha;
    private final HashMap<Integer, Servico> servicosAtivos;
    private static PriorityQueue<Integer> idsLivres = new PriorityQueue();
    private static int idGenerator = 8;

    // Construtor padrão para criar os funcionários exemplo em Objetos
    public Funcionario(double salario, String senha, int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
        this.salario = salario;
        this.senha = senha;
        this.servicosAtivos = new HashMap<>();
    }
    
    // Construtor a ser utilizado no cadastro informando o salário, com lógica para usar ID's que já foram excluídos e estão livres
    public Funcionario(double salario, String senha, String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        if (!idsLivres.isEmpty()){
            this.setId(idsLivres.poll());
        }
        else {
            this.setId(idGenerator++);
        }
        this.salario = salario;
        this.senha = senha;
        this.servicosAtivos = new HashMap<>();
    }

    // Mesmo que o anterior, mas sem inicializar o salário
    public Funcionario(String senha, String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        if (!idsLivres.isEmpty()){
            this.setId(idsLivres.poll());
        }
        else {
            this.setId(idGenerator++);
        }
        this.senha = senha;
        this.servicosAtivos = new HashMap<>();
    }
    
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
    
    // Outros métodos da classe
    // Recebe o objeto serviço específico. Se estiver pago, o retira da lista de serviços pendentes do funcionário enquanto aumenta a quantidade de serviços feitos
    public void completaSevico(Servico servico) {
        if (servico.isPago()) {
            servicosAtivos.remove(servico.getId());
            servicosFeitos++;
        }
    }
    
    // Retorna as peças necessárias que estão faltando no estoque enquanto retira as peças que estão sendo utilizadas
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
    
    // Calcula o valor do serviço considerando o desconto, esvazia a lista de peças com problema no véiculo e define o serviço como consertado
    public void consertarVeiculo(Servico servico, String metodo) {
        servico.calculaValor(metodo);
        servico.getVeiculo().esvaziarPecasComProblema();
        servico.setConsertado(true);
    }
    
    // Adiciona o ID infomado à lista de ID's livres
    public static void addIdLivre(int id){
        idsLivres.add(id);
    }
}
