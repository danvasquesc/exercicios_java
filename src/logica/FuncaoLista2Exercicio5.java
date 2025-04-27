package logica;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar */

import java.util.Locale;
import java.util.Scanner;

public class FuncaoLista2Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int codigo, quantidade;
		double resultado;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o código do item e depois a quantidade deste item:");
			codigo = sc.nextInt();
			quantidade = sc.nextInt();

			resultado = (double) valorTotal(codigo, quantidade);

			mostrarResultado(resultado);

		}

	}

	public static double valorTotal(int x, int y) {
		double valor;

		if (x == 1) {
			valor = 4 * y;
		} else if (x == 2) {
			valor = 4.5 * y;
		} else if (x == 3) {
			valor = 5 * y;
		} else if (x == 4) {
			valor = 2 * y;
		} else {
			valor = 1.5 * y;
		}
		return valor;
	}

	public static void mostrarResultado(double value) {
		System.out.printf("Total: R$ %.2f%n", value);
	}

}
