package logica;

/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso. */

import java.util.Scanner;

public class Lista4Exercicio1 {

	public static void main(String[] args) {

		int x, i;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite um valor inteiro de X");
			x = sc.nextInt();

			for (i = 1; i <= x; i++) {
				if (i % 2 != 0) {
					/* aqui aprova somente números impares. se for par, nao acontece nada */
					System.out.println(i);
				}
			}
		}
	}
}
