/*Problema "negativos". Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos numeros voce vai digitar? ");
			int n = sc.nextInt();

			int[] vect = new int[n];

			int i = 0;
			for (i = 0; i < vect.length; i++) { /* aqui armazena os numeros digitados no array */
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextInt(); /* cada numero sera armazenado na sua posicao no vetor */
			}

			System.out.println("NUMEROS NEGATIVOS:");

			for (i = 0; i < vect.length; i++) { /* aqui percorre o array. verifica qual é negativo e imprime */
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}

			}

		}

	}

}
