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
	// attributes
	private static int id_generator = 0;
	private int id;
	private String tipo;
	private String marca;
	private Double preco;
	
	// constructor
	public Peca(String tipo, String marca, Double preco) {
		this.id = id_generator++;
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
	}
	
	public int getId()
	{
		return id;
	}

	public String getTipo()
	{
		return tipo;
	}

	public String getMarca()
	{
		return marca;
	}

	public Double getPreco()
	{
		return preco;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public void setPreco(Double preco)
	{
		this.preco = preco;
	}
}
