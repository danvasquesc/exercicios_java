/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos valores vai ter cada vetor? ");
			int n = sc.nextInt();

			int[] A = new int[n];
			int[] B = new int[n];

			System.out.println("Digite os valores do vetor A: ");
			int i = 0;
			for (i = 0; i < n; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println("Digite os valores do vetor B: ");
			for (i = 0; i < n; i++) {
				B[i] = sc.nextInt();
			}

			int[] C = new int[n];

			for (i = 0; i < n; i++) {
				C[i] = A[i] + B[i];
			}

			System.out.println("VETOR RESULTANTE: ");
			for (i = 0; i < n; i++) {
				System.out.println(C[i]);
			}

		}

	}

}
