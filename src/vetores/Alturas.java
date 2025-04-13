/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantas pessoas serao digitadas? ");
			int n = sc.nextInt();

			String[] vectNome = new String[n];
			int[] vectIdade = new int[n];
			double[] vectAltura = new double[n];

			int i = 0;
			for (i = 0; i < n; i++) {
				System.out.printf("Dados da %da pessoa: \n", i + 1); /* pra nao aparecer 'dados da 0ª pessoa, e sim 1ª */
				System.out.print("Nome: ");
				vectNome[i] = sc.next();

				System.out.print("Idade: ");
				vectIdade[i] = sc.nextInt();

				System.out.print("Altura: ");
				vectAltura[i] = sc.nextDouble();
			}

			double soma = 0.0;
			double mediaAltura = 0.0;
			for (i = 0; i < n; i++) {
				soma = soma + vectAltura[i];
				mediaAltura = soma / n;
			}

			System.out.println(" ");
			System.out.printf("Altura media: %.2f%n", mediaAltura);

			double menorIdade = 0;
			for (i = 0; i < n; i++) {
				if (vectIdade[i] < 16) {
					menorIdade = (double) (vectIdade[i] / n) * 100;
				}
			}

			System.out.println();
			System.out.print("Pessoas com menos de 16 anos: " + menorIdade + "%");

			for (i = 0; i < n; i++) {
				if (vectIdade[i] < 16) {
					System.out.println(vectNome[i]);
				}
			}

		}

	}

}
