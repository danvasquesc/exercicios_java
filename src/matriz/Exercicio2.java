/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.*/

package matriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int m = sc.nextInt(); // linhas
			int n = sc.nextInt(); // colunas

			int[][] mat = new int[m][n]; // matriz instanciada

			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					mat[i][j] = sc.nextInt();

				}
			}

			int x = sc.nextInt(); // numero que vamos localizar dentro da matriz

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] == x) {
						System.out.println("Position " + i + "," + j + ":");

						if (j > 0) { // ou seja, tem alguem a esquerda dele...
							System.out.println("Left: " + mat[i][j - 1]); // imprime o numero que esta na posicao a
																			// esquerda
						}
						if (i > 0) { // ou seja, tem alguem acima dele...
							System.out.println("Up: " + mat[i - 1][j]); // imprime o numero que esta na posicao acima
						}
						if (j < mat[i].length - 1) { // ou seja, tem alguem a direita dele
							System.out.println("Rigth: " + mat[i][j + 1]); // imprime o numero que esta na posicao a
																			// direita

						}
						if (i < mat.length - 1) { // ou seja, tem alguem abaixo dele
							System.out.println("Down: " + mat[i + 1][j]); // imprime o numero que esta na posicao abaixo
																			// dele

						}

					}

				}

			}

		}

	}

}
