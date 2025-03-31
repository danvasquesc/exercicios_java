/*Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			double[] vect = new double[n]; /*
											 * o colchetes [] indica que estou declarando um vetor e é do tipo double. o
											 * n é para informar o tamanho do vetor
											 */

			for (int i = 0; i < n; i++) {
				vect[i] = sc.nextDouble(); /*
											 * o i inicia com 0 e o numero que o usuario digitar vai ser alocado nessa
											 * posição, ai volta, verifica se o i é menor que n e adiciona mais um, até
											 * ser contemplado
											 */

			}

			double soma = 0.0;
			for (int i = 0; i < n; i++) {
				soma = soma + vect[i]; /* aqui vai percorrer todo o vetor e somar seus valores */
			}

			double media = soma / n; /*
										 * aqui vai pegar o resultado da soma dos vetores e dividir por 3, que é nosso
										 * n, dando a media
										 */

			System.out.printf("AVERAGE HEIGH: %.2f%n", media);

		}

	}

}
