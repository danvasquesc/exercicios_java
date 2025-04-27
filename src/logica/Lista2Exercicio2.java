/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar */

package logica;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {

		int numero;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite um número inteiro: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}

		}

	}

}