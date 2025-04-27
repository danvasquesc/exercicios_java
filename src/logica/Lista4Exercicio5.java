package logica;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

import java.util.Scanner;

public class Lista4Exercicio5 {

	public static void main(String[] args) {

		int N, fatorial, i;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o valor de N");
			N = sc.nextInt();

			if (N == 0) {
				System.out.println("1");
			} else {

				fatorial = 1;

				for (i = 1; i <= N; i++) {
					fatorial = fatorial * i;
				}

				System.out.println(fatorial);

			}

		}

	}

}
