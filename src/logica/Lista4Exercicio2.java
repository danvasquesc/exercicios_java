package logica;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */

import java.util.Scanner;

public class Lista4Exercicio2 {

	public static void main(String[] args) {

		int N, X, in, out, i;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite um valor inteiro para N: ");
			N = sc.nextInt();

			in = 0;
			out = 0;

			for (i = 0; i < N; i++) {
				System.out.print("Digite um valor inteiro para X: ");
				X = sc.nextInt();

				if (X >= 10 && X <= 20) {
					in = in + 1;
				} else {
					out = out + 1;
				}
			}

			System.out.println(in + " in");
			System.out.println(out + " out");

		}

	}

}
