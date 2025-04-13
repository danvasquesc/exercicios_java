/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos numeros voce vai digitar? ");
			int n = sc.nextInt();

			double[] vect = new double[n];

			int i = 0;
			for (i = 0; i < vect.length; i++) {
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextDouble();
			}
			System.out.println(" ");

			System.out.print("VALORES = ");
			for (i = 0; i < vect.length; i++) {
				System.out.print(" " + vect[i]);
			}

			double soma = 0.0;
			for (i = 0; i < vect.length; i++) {
				soma = soma + vect[i];
			}

			System.out.println();
			System.out.printf("SOMA = %.2f%n", soma);

			double media = 0.0;
			for (i = 0; i < vect.length; i++) {
				media = soma / vect.length;
			}

			System.out.printf("MEDIA = %.2f%n", media);

		}

	}

}
