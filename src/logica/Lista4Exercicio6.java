package logica;

/*Ler um número inteiro N e calcular todos os seus divisores. */

import java.util.Scanner;

public class Lista4Exercicio6 {

	public static void main(String[] args) {

		int N, i;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite um número inteiro");
			N = sc.nextInt();

			for (i = 1; i <= N; i++) {

				if (N % i == 0) {
					/* verifica se N é divisível por i */
					System.out.println(i);
				}
			}
		}

	}
}
