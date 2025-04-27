/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

package logica;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {

		int valor1, valor2, soma;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o primeiro valor inteiro: ");
			valor1 = sc.nextInt();

			System.out.print("Digite o segundo valor inteiro: ");
			valor2 = sc.nextInt();

			soma = valor1 + valor2;

			System.out.print("A soma é = " + soma);

		}

	}

}