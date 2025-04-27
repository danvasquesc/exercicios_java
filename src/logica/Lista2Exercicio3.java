/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

package logica;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {

		int A, B;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o valor de A e depois o de B:");
			A = sc.nextInt();
			B = sc.nextInt();

			if (A % B == 0 || B % A == 0) {
				System.out.println("São Multiplos");
			} else {
				System.out.println("Não sao Multiplos");
			}

		}

	}

}