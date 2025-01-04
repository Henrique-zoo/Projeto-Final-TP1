/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

/**
 *
 * @author nirva
 */

public class Par {
	Peca peca;
	int qtd;
	
	// constructor
	public Par(int qtd, Peca peca) {
		this.qtd = qtd;
		this.peca = peca;
	}

	public Peca getPeca()
	{
		return peca;
	}

	public void setPeca(Peca peca)
	{
		this.peca = peca;
	}

	public int getQtd()
	{
		return qtd;
	}

	public void setQtd(int qtd)
	{
		this.qtd = qtd;
	}
	
}