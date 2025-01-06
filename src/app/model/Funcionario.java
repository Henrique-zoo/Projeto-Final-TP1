/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.HashMap;

/**
 *
 * @author derickandrade
 */
public class Funcionario extends Pessoa {
    
    private double salario;
    private int servicosFeitos;
    private boolean admin;
    private String senha;
    private final HashMap<Integer, Servico> servicosAtivos;

    public Funcionario(double salario, String senha, int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
        this.salario = salario;
        this.senha = senha;
        this.servicosAtivos = new HashMap<>();
    }

    public Funcionario(String senha, int id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
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
    
    public void completaSevico(Servico servico) {
        if (servico.isPago()) {
            servicosAtivos.remove(servico.getId());
            servicosFeitos++;
        }
    }
}
