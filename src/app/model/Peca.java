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
	public static ArrayList<Peca> pecasCadastradas = new ArrayList<>();
	
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
	public static void removerCadastro(int id)
	{
		for (Peca pecaCadastrada : pecasCadastradas) {
			if (pecaCadastrada.id == id) {
				pecasCadastradas.remove(pecaCadastrada);
				free_ids.add(id);
			}
		}
	}
	
	// removerCadastro: remove a peca cadastrada de acordo com tipo e marca
	public static void removerCadastro(String tipo, String marca) {
		int id = -1;
		Peca aux = null;
		for (Peca pecaCadastrada : pecasCadastradas) {
			if (pecaCadastrada.getMarca().equals(marca) && pecaCadastrada.getTipo().equals(tipo)) {
				id = pecaCadastrada.id;
				aux = pecaCadastrada;
				break;
			}
		}
		
		if (id >= 0 && aux != null) {
			pecasCadastradas.remove(aux);
			free_ids.add(id);
		}
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
