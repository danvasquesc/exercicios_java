/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */

package logica;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {

		int horaInicial, horaFinal, duracao;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println(
					"Digite a hora inicial do jogo e depois a hora final (sem os minutos e utilizando o sistema de sistema de 24 horas):");
			horaInicial = sc.nextInt();
			horaFinal = sc.nextInt();

			if (horaInicial < horaFinal) {
				duracao = horaFinal - horaInicial;
				/* calcula a diferenca pois e o mesmo dia */
			} else {
				duracao = (24 - horaInicial) + horaFinal;/*
															 * calcula quanto falta da hora inicial pra meia noite
															 * (24hrs). o resultado e somado com a hora final, pq ai
															 * pega o valor do dia anterior com o dia seguinte
															 */
			}

			System.out.println("O jogo durou " + duracao + " horas(s)");

		}

	}

}