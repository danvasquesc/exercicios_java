/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar */

package logica;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int codigo, quantidade;
		double valorTotal;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o código do item e depois a quantidade deste item:");
			codigo = sc.nextInt();
			quantidade = sc.nextInt();

			if (codigo == 1) {
				valorTotal = 4 * quantidade;
			} else if (codigo == 2) {
				valorTotal = 4.5 * quantidade;
			} else if (codigo == 3) {
				valorTotal = 5 * quantidade;
			} else if (codigo == 4) {
				valorTotal = 2 * quantidade;
			} else {
				valorTotal = 1.5 * quantidade;
			}

			System.out.println("Total: R$ " + valorTotal + "0");

		}

	}

}