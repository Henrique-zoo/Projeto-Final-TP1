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
 * 
 * A classe Cliente representa um cliente que herda da classe Pessoa.
 * Ela contém informações sobre o débito, veículos associados, total pago e gerenciamento de IDs.
 */
public final class Cliente extends Pessoa {
    private double debito;
    private ArrayList<Veiculo> veiculos;
    private double totalPago;
    private static PriorityQueue<Integer> idsLivres = new PriorityQueue<>();
    private static int idGenarator = 1;

    /**
    * Construtor default da classe Cliente
    */
    public Cliente(){}

    /**
     * Construtor que inclui lógica para usar IDs que já foram excluídos e estão livres.
     *
     * @param nome      O nome do cliente.
     * @param cpf       O CPF do cliente.
     * @param email     O email do cliente.
     * @param telefone  O telefone do cliente.
     */
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

    // Métodos getters e setters para os atributos da classe

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

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    /**
     * Torna disponível o ID excluído.
     *
     * @param id O ID a ser adicionado à lista de IDs livres.
     */
    public static void addIdLivre(int id){
        idsLivres.add(id);
    }
    
    /**
     * Retorna um veículo específico da lista de veículos a partir do índice fornecido.
     *
     * @param i O índice do veículo na lista.
     * @return O veículo correspondente ao índice fornecido.
     */
    public Veiculo getVeiculoByID(int i){
        return this.veiculos.get(i);
    }
    
    /**
     * Exclui um veículo específico da lista de veículos a partir do objeto fornecido.
     *
     * @param veiculo O veículo a ser excluído.
     */
    public void excluirVeiculo(Veiculo veiculo){
        this.veiculos.remove(veiculo);
    }
    
    /**
     * Exclui todos os veículos do cliente.
     */
    public void excluirVeiculos() {
        this.veiculos.clear();
    }
}