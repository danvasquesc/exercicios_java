package logica;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo. */

import java.util.Scanner;

public class Lista4Exercicio7 {

	public static void main(String[] args) {

		int N, i, quadrado, cubo;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite um número inteiro positivo");
			N = sc.nextInt();

			for (i = 1; i <= N; i++) {

				quadrado = i * i;
				cubo = i * i * i;

				System.out.println(i + " " + quadrado + " " + cubo);

			}

		}

	}

}
