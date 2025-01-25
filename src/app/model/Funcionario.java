/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.HashMap;

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
    public void completaSevico(Servico servico) {
        if (servico.isPago()) {
            servicosAtivos.remove(servico.getId());
            servicosFeitos++;
        }
    }
    
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
    
    public void consertarVeiculo(Servico servico, String metodo) {
        servico.calculaValor(metodo);
        servico.getVeiculo().esvaziarPecasComProblema();
        servico.setConsertado(true);
    }
}
