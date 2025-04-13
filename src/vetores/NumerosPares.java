/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos numeros voce vai digitar? ");
			int n = sc.nextInt();

			int[] numero = new int[n];

			int i = 0;
			for (i = 0; i < numero.length; i++) {
				System.out.print("Digite um numero: ");
				numero[i] = sc.nextInt();
			}

			System.out.println();
			System.out.println("NUMEROS PARES:");
			int par = 0;
			for (i = 0; i < numero.length; i++) {
				if (numero[i] % 2 == 0) {
					System.out.print(numero[i] + " ");
					par = par + 1;
				}
			}

			System.out.println(" ");
			System.out.println("QUANTIDADE DE PARES = " + par);

		}
	}

}
