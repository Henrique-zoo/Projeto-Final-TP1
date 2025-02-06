/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Classe que representa um tipo de peça no sistema.
 * Cada tipo de peça possui um ID único, tipo, marca e preço.
 * A classe também gerencia uma lista estática de todos os tipos de peças cadastrados.
 * 
 * @author nirva
 */
public class TipoDePeca {
	
	// Atributos estáticos
	
	/**
	 * Lista estática de todos os tipos de peças cadastrados.
	 */
	private static final ArrayList<TipoDePeca> tPecasCadastradas = new ArrayList<>();
	
	/**
	 * Gerador de IDs para novos tipos de peças.
	 */
	private static int id_generator = 0;
	
	/**
	 * Lista de IDs livres que podem ser reutilizados.
	 */
	private static final ArrayList<Integer> free_ids = new ArrayList<>();
	
	// Atributos de instância
	
	/**
	 * ID único do tipo de peça.
	 */
	private final int id;
	
	/**
	 * Tipo da peça.
	 */
	private String tipo;
	
	/**
	 * Marca da peça.
	 */
	private String marca;
	
	/**
	 * Preço da peça.
	 */
	private Double preco;
	
	// Construtores
	
	/**
	 * Construtor principal da classe TipoDePeca.
	 * 
	 * @param tipo Tipo da peça.
	 * @param marca Marca da peça.
	 * @param preco Preço da peça.
	 */
	public TipoDePeca(String tipo, String marca, Double preco) {
		// Verifica se há IDs livres para reutilização
		if (!(free_ids.isEmpty())) {
			this.id = free_ids.get(0);
			free_ids.remove(0);
		} else {
			// Caso não haja IDs livres, gera um novo ID
			this.id = id_generator++;
		}
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
		
		// Adiciona a peça à lista de peças cadastradas e ordena a lista por ID
		tPecasCadastradas.add(this);
		tPecasCadastradas.sort(Comparator.comparing(a -> a.getId()));
	}

	/**
	 * Construtor padrão da classe TipoDePeca.
	 * Inicializa um tipo de peça com valores padrão.
	 */
	public TipoDePeca() {
		this.id = -1;
		this.tipo = "Selecione uma";
		this.marca = "peça";
	}
	
	// Métodos estáticos
	
	/**
	 * Remove um tipo de peça da lista de peças cadastradas.
	 * 
	 * @param pecaCadastrada Tipo de peça a ser removido.
	 */
	public static void removerCadastro(TipoDePeca pecaCadastrada) {
		free_ids.add(pecaCadastrada.getId());
		tPecasCadastradas.remove(pecaCadastrada);
	}
	
	/**
	 * Busca um tipo de peça cadastrado com base no tipo e marca.
	 * 
	 * @param tipo Tipo da peça.
	 * @param marca Marca da peça.
	 * @return Referência ao tipo de peça encontrado, ou null se não encontrado.
	 */
	public static TipoDePeca searchTPeca(String tipo, String marca) {
		for (TipoDePeca pecaCadastrada : tPecasCadastradas) {
			if (pecaCadastrada.getMarca().equals(marca) && pecaCadastrada.getTipo().equals(tipo)) {
				return pecaCadastrada;
			}
		}
		return null;
	}
	
	/**
	 * Busca um tipo de peça cadastrado com base no ID.
	 * 
	 * @param id ID da peça.
	 * @return Referência ao tipo de peça encontrado, ou null se não encontrado.
	 */
	public static TipoDePeca searchTPeca(int id) {
		for (TipoDePeca pecaCadastrada : tPecasCadastradas) {
			if (pecaCadastrada.getId() == id) {
				return pecaCadastrada;
			}
		}
		return null;
	}
	
	/**
	 * Retorna a quantidade de tipos de peças cadastrados.
	 * 
	 * @return Quantidade de tipos de peças cadastrados.
	 */
	public static int getTPecaQuantity() {
		return tPecasCadastradas.size();
	}
	
	/**
	 * Retorna um tipo de peça com base na posição na lista de peças cadastradas.
	 * Útil para iterar sobre todos os tipos de peças cadastrados.
	 * 
	 * @param i Posição na lista.
	 * @return Referência ao tipo de peça na posição especificada.
	 */
	public static TipoDePeca searchTPecaPosition(int i) {
		return tPecasCadastradas.get(i);
	}
	
	// Getters
	
	/**
	 * Retorna o ID do tipo de peça.
	 * 
	 * @return ID do tipo de peça.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retorna o tipo da peça.
	 * 
	 * @return Tipo da peça.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Retorna a marca da peça.
	 * 
	 * @return Marca da peça.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Retorna o preço da peça.
	 * 
	 * @return Preço da peça.
	 */
	public Double getPreco() {
		return preco;
	}
	
	// Setters (o ID é definido apenas no construtor e não deve ser alterado)
	
	/**
	 * Define o tipo da peça.
	 * 
	 * @param tipo Novo tipo da peça.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Define a marca da peça.
	 * 
	 * @param marca Nova marca da peça.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Define o preço da peça.
	 * 
	 * @param preco Novo preço da peça.
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	/**
	 * Retorna uma representação em String do tipo de peça.
	 * 
	 * @return String no formato "tipo marca".
	 */
	@Override
	public String toString() {
		return tipo + ' ' + marca;
	}
}