/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

package logica;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int codPeca1, codPeca2, numPeca1, numPeca2;
		double valorPeca1, valorPeca2, valorTotal;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Código da peça 1: ");
			codPeca1 = sc.nextInt();

			System.out.print("Números de peças 1: ");
			numPeca1 = sc.nextInt();

			System.out.print("Valor unitário da peça 1: ");
			valorPeca1 = sc.nextDouble();

			System.out.print("Código da peça 2: ");
			codPeca2 = sc.nextInt();

			System.out.print("Números de peças 2: ");
			numPeca2 = sc.nextInt();

			System.out.print("Valor unitário da peça 2: ");
			valorPeca2 = sc.nextDouble();

			valorTotal = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

			System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		}

	}

}