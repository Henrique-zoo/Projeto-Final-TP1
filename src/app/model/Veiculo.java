/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import app.utils.IDGenerator;
import java.util.ArrayList;

/**
 *
 * @author derickandrade
 */
public class Veiculo {
    private int id, ano;
    private String tipo, modelo, cor, placa;
    private final ArrayList<Peca> pecasComProblema;

    public Veiculo () {
        this.tipo = "Selecione";
        this.modelo = "um veículo";
        this.pecasComProblema = new ArrayList<>();
    }
    
    public Veiculo(int ano, String tipo, String placa, String modelo, String cor) {
        this.id = IDGenerator.generateVeiculoID();
        this.ano = ano;
        this.tipo = tipo;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.pecasComProblema = new ArrayList<>();
    }

    public int getId() {
        return id;
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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
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

    @Override
    public String toString() {
        return placa;
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
