/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos elementos vai ter o vetor? ");
			int n = sc.nextInt();

			int[] numero = new int[n];

			int i = 0;
			for (i = 0; i < numero.length; i++) {
				System.out.print("Digite um numero: ");
				numero[i] = sc.nextInt();
			}

			int soma = 0;
			double media = 0.0;
			int quantidadePares = 0;
			for (i = 0; i < numero.length; i++) {
				if (numero[i] % 2 == 0) {
					soma = soma + numero[i];
					quantidadePares = quantidadePares + 1;
				}
			}
			
			if (quantidadePares == 0) {
				System.out.println("NENHUM NUMERO PAR");
			} else {
				media = soma / quantidadePares;
				System.out.printf("MEDIA DOS PARES = %.1f", media);
			}

		}

	}

}
