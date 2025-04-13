/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
*/
package vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos elementos vai ter o vetor? ");
			int n = sc.nextInt();

			double[] numero = new double[n];

			int i = 0;
			for (i = 0; i < numero.length; i++) {
				System.out.print("Digite um numero: ");
				numero[i] = sc.nextDouble();
			}

			double soma = 0.0;
			double media = 0.0;
			for (i = 0; i < n; i++) {
				soma = soma + numero[i];
				media = soma / numero.length;
			}

			System.out.println();
			System.out.printf("MEDIA DO VETOR = %.3f", media);

			System.out.println();
			System.out.printf("ELEMENTOS ABAIXO DA MEDIA: \n");
			for (i = 0; i < n; i++) {
				if (numero[i] < media) {
					System.out.println(numero[i]);
				}

			}

		}
	}

}
