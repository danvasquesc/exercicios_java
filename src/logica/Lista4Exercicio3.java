package logica;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5. */

import java.util.Locale;
import java.util.Scanner;

public class Lista4Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int N, i;
		double valor1, valor2, valor3, mediaPonderada;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite um valor inteiro de N: ");
			N = sc.nextInt();

			for (i = 0; i < N; i++) {

				valor1 = sc.nextDouble();
				valor2 = sc.nextDouble();
				valor3 = sc.nextDouble();

				mediaPonderada = (((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5));
				/*
				 * da pra trabalhar com os pesos usando variaveis, para facilitar a alteracao
				 * dos valores dos pesos
				 */

				System.out.printf("%.1f\n", mediaPonderada);

			}

		}

	}

}
