/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;

/**
 *
 * @author derickandrade
 */
public class Cliente extends Pessoa {
    private double debito;
    private ArrayList<Veiculo> veiculos;
    private double totalPago;

    public Cliente(int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
        this.veiculos = new ArrayList<>();
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    public void setVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
    public Veiculo getVeiculoByID(int i){
        return this.veiculos.get(i);
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    
}
