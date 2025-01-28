/*
 * Classe Servico - Representa um serviço prestado em um sistema de oficina, 
 * incluindo informações como cliente, veículo, funcionário responsável, valor, 
 * estado de pagamento e conserto.
 */
package app.model;

import app.utils.IDGenerator;
import java.util.ArrayList;

/**
 * Classe que encapsula os detalhes de um serviço realizado na oficina.
 * Inclui métodos para cálculo de valores, gerenciamento de status e associações com outros objetos do sistema.
 * 
 * @author henri
 */
public class Servico {
    // Identificador único do serviço
    private final int id;
    // Valor total do serviço
    private double valor;
    // Indica se o serviço foi pago
    private boolean pago;
    // Indica se o serviço foi consertado
    private boolean consertado;
    // Método de pagamento utilizado
    private String metodoPagamento;
    // Cliente associado ao serviço
    private Cliente cliente;
    // Veículo relacionado ao serviço
    private Veiculo veiculo;
    // Funcionário responsável pelo serviço
    private Funcionario funcionario;

    /**
     * Construtor principal para criar um novo serviço.
     * 
     * @param cliente Cliente associado ao serviço.
     * @param veiculo Veículo relacionado ao serviço.
     * @param funcionario Funcionário responsável pelo serviço.
     */
    public Servico(Cliente cliente, Veiculo veiculo, Funcionario funcionario) {
        this.id = IDGenerator.generateServicoID(); // Gera um ID único para o serviço
        this.pago = false; // Serviço inicial não está pago
        this.consertado = false; // Serviço inicial não está consertado
        this.cliente = cliente;
        this.veiculo = veiculo;
        funcionario.setServicosAtivos(this); // Adiciona o serviço à lista de serviços ativos do funcionário
        this.funcionario = funcionario;
    }

    /**
     * Construtor para criar serviços de exemplo com todos os atributos.
     * 
     * @param id Identificador único do serviço.
     * @param valor Valor total do serviço.
     * @param pago Indica se o serviço foi pago.
     * @param consertado Indica se o serviço foi consertado.
     * @param metodoPagamento Método de pagamento utilizado.
     * @param cliente Cliente associado ao serviço.
     * @param veiculo Veículo relacionado ao serviço.
     * @param funcionario Funcionário responsável pelo serviço.
     */
    public Servico(int id, double valor, boolean pago, boolean consertado, String metodoPagamento, Cliente cliente, Veiculo veiculo, Funcionario funcionario) {
        this.id = id;
        this.valor = valor;
        this.pago = pago;
        this.consertado = consertado;
        this.metodoPagamento = metodoPagamento;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
    }
    
    // Métodos especiais (getters e setters)
    /**
     * Comentário geral para os getters
     * 
     * @return o atributo do getter
     */
    public int getId() {
        return id;
    }
    public double getValor() {
        return valor;
    }
    public boolean isPago() {
        return pago;
    }
    public boolean isConsertado() {
        return consertado;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Comentário geral para os setters
     * 
     * @param atributo o atributo do setter
     */
    public void setValor(String metodo) {
        valor = calculaValor(metodo);
    }
    public void setValor(Double valor) { // Sobrecarga do método setValor
        this.valor = valor;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
        if (pago) {
            funcionario.completaSevico(this);
        }
    }
    public void setConsertado(boolean consertado) {
        this.consertado = consertado;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    /**
     * Calcula o valor do serviço com base nas peças e no método de pagamento.
     * 
     * @param metodo Método de pagamento utilizado.
     * @return Valor total do serviço.
     */
    public double calculaValor(String metodo) {
        double total = 0.0;
        for (Peca par : veiculo.getPecasComProblema())
            total += par.getQtd() * par.getTipoPeca().getPreco();
        if (metodo.equals("Dinheiro") || metodo.equals("PIX"))
            return total * 0.95; // Aplicação de desconto
        return total;
    }

    /**
     * Adiciona peças com problema ao veículo e recalcula o valor do serviço.
     * 
     * @param pecasComProblema Lista de peças com problema.
     * @param metodo Método de pagamento utilizado.
     */
    public void adicionaPecasComProblema(ArrayList<Peca> pecasComProblema, String metodo) {
        this.veiculo.setPecasComProblema(pecasComProblema);
        this.setValor(metodo);
    }
}
