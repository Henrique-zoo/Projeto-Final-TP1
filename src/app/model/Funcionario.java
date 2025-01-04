/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

/**
 *
 * @author derickandrade
 */
public class Funcionario extends Pessoa {
    
    private double salario;
    private int servicosFeitos;
    private boolean admin;
    private String senha;
    
    public Funcionario(int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
    }

    public Funcionario(double salario, String senha, int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
        this.salario = salario;
        this.senha = senha;
    }

    public Funcionario(String senha, int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
