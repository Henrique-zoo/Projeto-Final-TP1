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
public class Veiculo {
    private int id, ano;
    private String tipo, modelo, cor;
    private final ArrayList<Peca> pecasComProblema;

    public Veiculo(int id, int ano, String tipo, String modelo, String cor) {
        this.id = id;
        this.ano = ano;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.pecasComProblema = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public ArrayList<Peca> getPecasComProblema() {
        return pecasComProblema;
    }
    public void setPecasComProblema(ArrayList<Peca> pecasComProblema) {
        for (Peca par : pecasComProblema)
            this.pecasComProblema.add(par);
    }
    
    public void esvaziarPecasComProblema() {
        pecasComProblema.clear();
    }
}
