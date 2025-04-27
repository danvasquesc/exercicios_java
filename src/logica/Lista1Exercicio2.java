/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159 */

package logica;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		final double PI = 3.14159;
		double raio, area;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o valor do raio do círculo: ");
			raio = sc.nextDouble();

			area = PI * (raio * raio);

			System.out.printf("A area do círculo é: %.4f", area);

		}

	}

}
