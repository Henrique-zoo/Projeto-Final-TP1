/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;

/**
 *
 * @author nirva
 */
public class Estoque {
	private final static ArrayList<Peca> estoque = new ArrayList<>();
	
        public static ArrayList<Peca> getEstoque() {
            return estoque;
        }
	// methods
	public static void adicionarPeca(TipoDePeca tPeca, int qty)
	{
		Peca storageParts;
		if ((storageParts = findPeca(tPeca)) != null) {
			storageParts.addQtd(qty);
		} else {
			storageParts = new Peca(qty, tPeca);
			estoque.add(storageParts);
		}
	}
	
	/**
	 * remove part from storage using part type and quantity
	 * @param tPeca Part type
	 * @param qtyToRemove Amount to remove
	 * @return Returns 0 if successful, -1 if insufficient parts
	 */
	public static int removerPeca(TipoDePeca tPeca, int qtyToRemove)
	{
		if (qtyToRemove <= 0) {
			return 0;
		}
		Peca storagePecas;
		if ((storagePecas = findPeca(tPeca)) != null && qtyToRemove < storagePecas.getQtd()) {
			storagePecas.remQtd(qtyToRemove);
			return 0;
		} else if (storagePecas != null && qtyToRemove == storagePecas.getQtd()) {
			estoque.remove(storagePecas);
			return 0;
		} else {
			return -1;
		}
	}
	
	/**
	 * remove part from storage using already existing Part instance
	 * @param peca Part instance
	 * @return Returns 0 if successful, -1 if insufficient parts
	 */
	public static int removerPeca(Peca peca)
	{
		return removerPeca(peca.getTipoPeca(), peca.getQtd());
	}
	
	/**
	 * 
	 * @param tPeca Part type
	 * @return Returns reference to storage object if part found, else null
	 */
	public static Peca findPeca(TipoDePeca tPeca)
	{
		for (Peca peca : estoque) {
			if (peca.getTipoPeca() == tPeca)
				return peca;
		}
		return null;
	}
	
	public static int getSize()
	{
		return estoque.size();
	}
	
	public static Peca getPeca(int i)
	{
		return estoque.get(i);
	}
}
