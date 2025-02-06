/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

/**
 * Classe que representa uma peça no sistema.
 * Cada peça possui um tipo e uma quantidade associada.
 * 
 * @author nirva
 */
public class Peca {
    private TipoDePeca tipoPeca; // Tipo da peça
    private int qtd; // Quantidade da peça

    /**
     * Construtor da classe Peca.
     * 
     * @param qtd Quantidade inicial da peça.
     * @param peca Tipo da peça.
     */
    public Peca(int qtd, TipoDePeca peca) {
        this.qtd = qtd;
        this.tipoPeca = peca;
    }

    // Métodos

    /**
     * Retorna o tipo da peça.
     * 
     * @return Tipo da peça.
     */
    public TipoDePeca getTipoPeca() {
        return tipoPeca;
    }

    /**
     * Define o tipo da peça.
     * 
     * @param tipoPeca Tipo da peça a ser definido.
     */
    public void setTipoPeca(TipoDePeca tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    /**
     * Retorna a quantidade da peça.
     * 
     * @return Quantidade da peça.
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * Adiciona uma quantidade à peça.
     * 
     * @param qtd Quantidade a ser adicionada.
     */
    public void addQtd(int qtd) {
        this.qtd += qtd;
    }

    /**
     * Remove uma quantidade da peça, se possível.
     * 
     * @param qtd Quantidade a ser removida.
     * @return Retorna 0 se a remoção foi bem-sucedida, ou -1 se a quantidade a ser removida for maior que a disponível.
     */
    public int remQtd(int qtd) {
        if (qtd <= this.qtd) {
            this.qtd -= qtd;
            return 0;
        }
        return -1;
    }

    /**
     * Define a quantidade da peça.
     * 
     * @param qtd Nova quantidade da peça.
     * @return Retorna 0 se a quantidade foi definida com sucesso, ou -1 se a quantidade for negativa.
     */
    public int setQtd(int qtd) {
        if (qtd >= 0) {
            this.qtd = qtd;
            return 0;
        }
        return -1;
    }
}