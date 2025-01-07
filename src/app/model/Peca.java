/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author nirva
 */
public class Peca {
	
	// static
	// Array of registered parts
	private static ArrayList<Peca> pecasCadastradas = new ArrayList<>();
	
	// id management
	private static int id_generator = 0;
	// this is a simple queue wherein new parts use the oldest free id and new free ids get added to its end.
	private static ArrayList<Integer> free_ids = new ArrayList<>();
	
	// attributes
	private final int id;
	private String tipo;
	private String marca;
	private Double preco;
	
	// constructor
	public Peca(String tipo, String marca, Double preco) {
		if (!(free_ids.isEmpty())) {
			this.id = free_ids.get(0);
			free_ids.remove(0);
		} else {
			this.id = id_generator++;
		}
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
		
		// no leak, appending a reference to the list will be fine once object is done constructing
		pecasCadastradas.add(this);
		pecasCadastradas.sort(Comparator.comparing(a -> a.getId()));
	}
	
	// static methods
	
	// removerCadastro: remove a peca cadastrada de acordo com o id
	public static void removerCadastro(Peca pecaCadastrada)
	{
		free_ids.add(pecaCadastrada.getId());
		pecasCadastradas.remove(pecaCadastrada);
	}
	
	/**
	 * Searches for an already existing part according to the given Type and Brand
	 * @param tipo 
	 * @param marca
	 * @return Reference to an existing Peca object
	 */
	public static Peca searchPeca(String tipo, String marca) {
		for (Peca pecaCadastrada : pecasCadastradas) {
			if (pecaCadastrada.getMarca().equals(marca) && pecaCadastrada.getTipo().equals(tipo)) {
				return pecaCadastrada;
			}
		}
		return null;
	}
	
	/**
	 * Searches for an already existing part according to the given Id
	 * @param id
	 * @return Reference to an existing Peca object
	 */
	public static Peca searchPeca(int id) {
		for (Peca pecaCadastrada : pecasCadastradas) {
			if (pecaCadastrada.getId() == id) {
				return pecaCadastrada;
			}
		}
		return null;
	}
	
	public static int getPecaQuantity()
	{
		return pecasCadastradas.size();
	}
	
	/**
	 * Returns a reference to Part according to position in the static object array.
	 * Useful for iterating through every existing part.
	 * Use in conjunction with getPecaQuantity().
	 * @param i
	 * @return reference to Part according to position in the static object array.
	 */
	public static Peca searchPecaPosition(int i)
	{
		return pecasCadastradas.get(i);
	}
	
	// getters

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
	
	// setters (id is always set by constructor and should never be changed)

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
