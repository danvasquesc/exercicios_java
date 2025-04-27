package logica;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação */

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double valorX, valorY;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite a coordenada do 'x' e depois a do 'y'");
			valorX = sc.nextDouble();
			valorY = sc.nextDouble();

			if (valorX == 0.0 && valorY == 0.0) {
				System.out.println("Origem");
			} else if (valorX == 0.0) {
				/*
				 * Condição para mostrar que o ponto não está em nenhum quadrante, pois
				 * necessita de dois eixos para se formar um quadrante
				 */
				System.out.println("Eixo Y");
			} else if (valorY == 0.0) {
				/* Aqui a mesma coisa */
				System.out.println("Eixo X");
			} else if (valorX > 0.0 && valorY > 0.0) {
				System.out.println("Q1");
			} else if (valorX < 0.0 && valorY > 0.0) {
				System.out.println("Q2");
			} else if (valorX < 0.0 && valorY < 0.0) {
				System.out.println("Q3");
			} else {
				System.out.println("Q4");
			}
		}
	}
}
