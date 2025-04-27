package logica;

/*Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor */

import java.util.Scanner;

public class NumeroAntecessor {

	public static void main(String[] args) {

		int valorInicial, valorAntecessor;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite um valor: ");
			valorInicial = sc.nextInt();

			valorAntecessor = valorInicial - 1;

			System.out.println("O antecessor de " + valorInicial + " é " + valorAntecessor);

		}

	}

}
