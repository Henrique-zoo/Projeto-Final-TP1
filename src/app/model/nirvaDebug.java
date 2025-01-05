/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.Scanner;
/**
 *
 * @author nirva
 */
public class nirvaDebug {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String aux;
		String tipoget;
		String marcaget;
		String precoget;
		double precogetfix;
		Peca pecinha;
		while (true) {
			aux = input.nextLine();
			int a = Integer.parseInt(aux);
			if (a == 1) {
				tipoget = input.nextLine();
				marcaget = input.nextLine();
				precoget = input.nextLine();
				precogetfix = Double.parseDouble(precoget);
				
				boolean already_exists = false;
				for (Peca pecaCadastrada : Peca.pecasCadastradas) {
					if (pecaCadastrada.getMarca().equals(marcaget) && pecaCadastrada.getTipo().equals(tipoget))
						already_exists = true;
				}
				if (!already_exists)
					pecinha = new Peca(tipoget, marcaget, precogetfix);
			} else if (a == 2) {
				tipoget = input.nextLine();
				marcaget = input.nextLine();
				Peca.removerCadastro(tipoget, marcaget);
			} else if (a == 3) {
				tipoget = input.nextLine();
				a = Integer.parseInt(tipoget);
				Peca.removerCadastro(a);
			} else break;
			
			for (Peca pecaCadastrada : Peca.pecasCadastradas) {
				System.out.printf("%d %s %s %f\n", pecaCadastrada.getId(), pecaCadastrada.getTipo(), pecaCadastrada.getMarca(), pecaCadastrada.getPreco());
			}	
		}
	}
}
