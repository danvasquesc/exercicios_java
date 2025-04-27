package logica;

/*Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o usuario deseja repetir (s/n). Caso o usuario digite "s", repetir o programa. 
 */

import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double celsius, fahren;
		char resposta;

		try (Scanner sc = new Scanner(System.in)) {

			do {
				System.out.print("Digite a temperatura em Celsius: ");
				celsius = sc.nextDouble();

				fahren = 9.0 * celsius / 5.0 + 32.0;

				System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahren);

				System.out.print("Deseja repetir (s/n)? ");
				resposta = sc.next().charAt(0);
				/* ler a variavel char */

			} while (resposta != 'n');

		}

	}

}
