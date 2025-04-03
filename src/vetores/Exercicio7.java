/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 
*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos numeros voce vai digitar? ");
			int n = sc.nextInt();

			double[] numero = new double[n];

			int i = 0;
			for (i = 0; i < numero.length; i++) {
				System.out.print("Digite um numero: ");
				numero[i] = sc.nextDouble();
			}

			double maior = 0.0;
			int indiceMaior = 0;
			for (i = 0; i < numero.length; i++) {
				if (numero[i] > maior) {
					maior = numero[i];
					indiceMaior = i;
				}
			}

			System.out.println(" ");
			System.out.println("MAIOR VALOR = " + maior);

			System.out.println("POSICAO DO MAIOR VALOR = " + indiceMaior);

		}

	}

}
