/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

package logica;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		int numero;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite um  número inteiro: ");
			numero = sc.nextInt();

			if (numero < 0) {
				System.out.println("NEGATIVO");
			} else {
				System.out.println("NÃO NEGATIVO");
			}

		}

	}

}