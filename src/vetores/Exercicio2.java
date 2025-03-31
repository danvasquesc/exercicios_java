/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			Product2[] vect = new Product2[n]; /*
												 * 1- nome da classe que vai ser o tipo do vetor. 2- a variavel vect. 3-
												 * instanciacao do objeto Product2. 3- definir o tamanho do vetor
												 */

			/*
			 * por padrao do Java, todas as posicoes do vetor estao 'null', ai dentro de
			 * cada posicao sera referenciado (ponteiro) para os objetos da posicao
			 */

			for (int i = 0; i < vect.length; i++) { /* vect.length no lugar de 'n' */
				sc.nextLine(); /* consumir o espaço dado anteriormente */
				String name = sc.nextLine();
				double price = sc.nextDouble();
				vect[i] = new Product2(name,
						price); /* aqui o vetor aponta pros objetos instanciados aqui - construtor ja criado */

			}

			double sum = 0.0;
			for (int i = 0; i < vect.length; i++) {
				sum = sum + vect[i].getPrice(); /*
												 * o getPrice() é chamado para eu acessar somente o preço do produto, eu
												 * nao quero acessar o nome, só o preço, pra calcular a media
												 */

			}

			double media = sum / vect.length;

			System.out.printf("AVERAGE PRICE = %.2f%n", media);

		}

	}

}
