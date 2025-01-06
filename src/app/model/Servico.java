/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import app.utils.IDGenerator;

/**
 *
 * @author henri
 */
public class Servico {
    private final int id;
    private double valor;
    private boolean pago, consertado;
    private String metodoPagamento;
    private Cliente cliente;
    private Veiculo veiculo;
    private Funcionario funcionario;

    public Servico(Cliente cliente, Veiculo veiculo, Funcionario funcionario) {
        this.id = IDGenerator.generateID();
        this.pago = false;
        this.consertado = false;
        this.cliente = cliente;
        this.veiculo = veiculo;
        funcionario.setServicosAtivos(this);
        this.funcionario = funcionario;
    }
    
    // Métodos especiais (getters e setters)
    public int getId() {
        return id;
    }
    public double getValor() {
        return valor;
    }
    public void setValor() {
        valor = calculaValor();
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
        if (pago)
            funcionario.completaSevico(this);
    }
    public boolean isConsertado() {
        return consertado;
    }
    public void setConsertado(boolean consertado) {
        this.consertado = consertado;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    // Outros métodos da classe
    public double calculaValor() {
        double total = 0.0;
        for (Par par : veiculo.getPecasComProblema())
            total += par.qtd * par.peca.getPreco();
        return total;
    }
}
