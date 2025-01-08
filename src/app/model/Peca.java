/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

/**
 *
 * @author nirva
 */

public class Peca {
	private TipoDePeca tipoPeca;
	private int qtd;
	
	// constructor
	public Peca(int qtd, TipoDePeca peca) {
		this.qtd = qtd;
		this.tipoPeca = peca;
	}

	// methods
	
	
	
	// setters and getters
	public TipoDePeca getTipoPeca()
	{
		return tipoPeca;
	}

	public void setTipoPeca(TipoDePeca tipoPeca)
	{
		this.tipoPeca = tipoPeca;
	}

	public int getQtd()
	{
		return qtd;
	}

	public void addQtd(int qtd)
	{
		this.qtd += qtd;
	}
	
	/**
	 *
	 * @param qtd
	 * @return Returns 0 if it was possible to remove qtd amount of parts, -1 otherwise
	 */
	public int remQtd(int qtd)
	{
		if (qtd <= this.qtd) {
			this.qtd -= qtd;
			return 0;
		}
		return -1;
	}
	
	/**
	 * 
	 * @param qtd
	 * @return -1 if failure, 0 otherwise
	 */
	public int setQtd(int qtd)
	{
		if(qtd >= 0) {
			this.qtd = qtd;
			return 0;
		}
		return -1;
	}
}