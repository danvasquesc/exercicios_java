/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

package logica;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {

		int A, B, C, D, diferenca;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite o valor de A: ");
			A = sc.nextInt();

			System.out.print("Digite o valor de B: ");
			B = sc.nextInt();

			System.out.print("Digite o valor de C: ");
			C = sc.nextInt();

			System.out.print("Digite o valor de D: ");
			D = sc.nextInt();

			diferenca = (A * B - C * D);

			System.out.print("A diferença é: " + diferenca);

		}

	}

}