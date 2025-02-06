/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;

/**
 * Classe que representa o estoque de peças no sistema.
 * O estoque é gerenciado por meio de uma lista estática de peças.
 * 
 * @author nirva
 */
public class Estoque {
	
	// Atributo estático
	
	/**
	 * Lista estática que armazena todas as peças no estoque.
	 */
	private final static ArrayList<Peca> estoque = new ArrayList<>();
	
	// Métodos estáticos
	
	/**
	 * Retorna a lista de peças no estoque.
	 * 
	 * @return Lista de peças no estoque.
	 */
	public static ArrayList<Peca> getEstoque() {
		return estoque;
	}
	
	/**
	 * Adiciona uma quantidade de peças ao estoque.
	 * Se a peça já existir no estoque, a quantidade é incrementada.
	 * Caso contrário, uma nova entrada é criada.
	 * 
	 * @param tPeca Tipo de peça a ser adicionada.
	 * @param qty Quantidade de peças a ser adicionada.
	 */
	public static void adicionarPeca(TipoDePeca tPeca, int qty) {
		Peca storageParts;
		// Verifica se a peça já existe no estoque
		if ((storageParts = findPeca(tPeca)) != null) {
			// Incrementa a quantidade da peça existente
			storageParts.addQtd(qty);
		} else {
			// Cria uma nova entrada no estoque
			storageParts = new Peca(qty, tPeca);
			estoque.add(storageParts);
		}
	}
	
	/**
	 * Remove uma quantidade de peças do estoque com base no tipo de peça.
	 * 
	 * @param tPeca Tipo de peça a ser removida.
	 * @param qtyToRemove Quantidade de peças a ser removida.
	 * @return Retorna 0 se a remoção foi bem-sucedida, ou -1 se a quantidade for insuficiente.
	 */
	public static int removerPeca(TipoDePeca tPeca, int qtyToRemove) {
		// Verifica se a quantidade a ser removida é válida
		if (qtyToRemove <= 0) {
			return 0;
		}
		Peca storagePecas;
		// Verifica se a peça existe no estoque
		if ((storagePecas = findPeca(tPeca)) != null && qtyToRemove < storagePecas.getQtd()) {
			// Remove a quantidade especificada
			storagePecas.remQtd(qtyToRemove);
			return 0;
		} else if (storagePecas != null && qtyToRemove == storagePecas.getQtd()) {
			// Remove a peça do estoque se a quantidade a ser removida for igual à quantidade disponível
			estoque.remove(storagePecas);
			return 0;
		} else {
			// Retorna -1 se a quantidade for insuficiente
			return -1;
		}
	}
	
	/**
	 * Remove uma peça do estoque com base em uma instância de peça já existente.
	 * 
	 * @param peca Instância da peça a ser removida.
	 * @return Retorna 0 se a remoção foi bem-sucedida, ou -1 se a quantidade for insuficiente.
	 */
	public static int removerPeca(Peca peca) {
		return removerPeca(peca.getTipoPeca(), peca.getQtd());
	}
	
	/**
	 * Busca uma peça no estoque com base no tipo de peça.
	 * 
	 * @param tPeca Tipo de peça a ser buscada.
	 * @return Retorna a referência à peça encontrada, ou null se não encontrada.
	 */
	public static Peca findPeca(TipoDePeca tPeca) {
		for (Peca peca : estoque) {
			if (peca.getTipoPeca() == tPeca)
				return peca;
		}
		return null;
	}
	
	/**
	 * Retorna a quantidade de peças no estoque.
	 * 
	 * @return Quantidade de peças no estoque.
	 */
	public static int getSize() {
		return estoque.size();
	}
	
	/**
	 * Retorna uma peça do estoque com base na posição na lista.
	 * 
	 * @param i Posição da peça na lista.
	 * @return Referência à peça na posição especificada.
	 */
	public static Peca getPeca(int i) {
		return estoque.get(i);
	}
}