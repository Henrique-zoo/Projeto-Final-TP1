/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author derickandrade
 */
public final class Cliente extends Pessoa {
    private double debito;
    private ArrayList<Veiculo> veiculos;
    private double totalPago;
    private static PriorityQueue<Integer> idsLivres = new PriorityQueue();
    private static int idGenarator = 1;

    public Cliente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        if (!idsLivres.isEmpty()){
            this.setId(idsLivres.poll());
        }
        else {
            this.setId(idGenarator++);
        }
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
    
    public void excluirVeiculo(Veiculo veiculo){
        this.veiculos.remove(veiculo);
    }
    
    public void excluirVeiculos() {
        this.veiculos.clear();
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public static void addIdLivre(int id){
        idsLivres.add(id);
    }
}
