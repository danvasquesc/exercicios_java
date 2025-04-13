/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantas pessoas serao digitadas? ");
			int n = sc.nextInt();

			double[] altura = new double[n];
			char[] genero = new char[n];

			int i = 0;
			for (i = 0; i < n; i++) {
				System.out.printf("Altura da %da pessoa: ", i + 1);
				altura[i] = sc.nextDouble();
				System.out.printf("Genero da %da pessoa: ", i + 1);
				genero[i] = sc.next().charAt(0);
			}

			double menorAltura = altura[0];
			for (i = 0; i < n; i++) {
				if (altura[i] < menorAltura) {
					menorAltura = altura[i];
				}
			}
			
			double maiorAltura = 0.0;
			for (i = 0; i < n; i++) {
				if (altura[i] > maiorAltura) {
					maiorAltura = altura[i];
				}
			}

			double soma = 0.0;
			double media = 0.0;
			int quantidadeMulheres = 0;
			int quantidadeHomens = 0;
			for (i = 0; i < n; i++) {
				if (genero[i] == 'F') {
					soma = soma + altura[i];
					quantidadeMulheres = quantidadeMulheres + 1;
				} else {
					quantidadeHomens = quantidadeHomens + 1;
				}
			}

			media = soma / quantidadeMulheres;

			System.out.printf("Menor altura = %.2f%n", menorAltura);
			System.out.printf("Menor altura = %.2f%n", maiorAltura);
			System.out.printf("Media das alturas das mulheres = %.2f%n", media);
			System.out.println("Numero de homens = " + quantidadeHomens);
		}

	}

}
