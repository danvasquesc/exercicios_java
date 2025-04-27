package logica;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 

1. ler o N
2. O N vai definir a qntd de contagem, e tem que ser em par (criar duas variaveis)
3. divisao da variavel 1 pela variavel 2 (criada acima)

- se a variavel 2 for = 0, divisao impossivel
 */

import java.util.Scanner;

public class Lista4Exercicio4 {

	public static void main(String[] args) {

		int N, i, numerador, denominador;
		double resultadoDivisao;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o número inteiro de N");
			N = sc.nextInt();

			for (i = 0; i < N; i++) {

				System.out.println("Digite o valor do numerador e do denominador");
				numerador = sc.nextInt();
				denominador = sc.nextInt();

				if (denominador == 0) {
					System.out.println("Divisão impossível");
				} else {
					resultadoDivisao = (double) numerador / denominador;
					/*
					 * casting // aqui alterei o momento que ocorre a divisão, eu tinha colocado
					 * antes do { if, mas para processar somente se for para o else e poupar
					 * processamento, troquei de lugar
					 */
					System.out.println("Resultado da divisão: " + resultadoDivisao);
				}

			}

		}

	}

}
