/*Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.*/

package matriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // vai ler o tamanho das colunas da matriz

			// criacao da matriz
			int[][] mat = new int[n][n]; /*
											 * int é o tipo da matriz. colocar dois conjuntos de colchetes que
											 * representa a matriz, ou seja, um array bidimensional. dentro dos
											 * colchetes atribuidos esta o valor de n, que informa quantas posicoes
											 * terão cada linha e coluna
											 */

			// primeiro for pra linha que é o contador i
			// mat[i].length = a quantidade do j vai ser a mesma que a do i, usando a
			// propriedade length
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) { // segundo for (o de dentro) é pra coluna que é o contador j
					mat[i][j] = sc.nextInt(); // vai ler as entradas dos dados e alocar no i e depois no j
				}
			}

			System.out.println("Main diagonal:");

			// vai imprimir os numeros que estao na diagonal
			// na diagonal, o i e o j tem a mesma posicao, por isso usamos somente o i
			for (int i = 0; i < mat.length; i++) {
				System.out.print(mat[i][i] + " ");

			}
			System.out.println();

			// calcular quantidade de negativos da matriz
			int quantidade = 0;
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] < 0) { /*
											 * se a matriz (linha i e coluna j) tiver algum numero menor que zero, a
											 * quantidade que é 0 vai receber quantas vezes tem negativo na matriz
											 */
						quantidade++;
					}
				}
			}

			System.out.println("Negative numbers: " + quantidade);

		}

	}

}
