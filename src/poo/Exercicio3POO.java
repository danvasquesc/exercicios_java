/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.*/

package poo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3POO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			Student aluno = new Student();

			aluno.name = sc.nextLine();
			aluno.grade1 = sc.nextDouble();
			aluno.grade2 = sc.nextDouble();
			aluno.grade3 = sc.nextDouble();

			System.out.printf("FINAL GRADE = %.2f%n", aluno.finalGrade());

			if (aluno.finalGrade() < 60) {
				System.out.println("FAILED");
				System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
			} else {
				System.out.println("PASS");
			}

		}

	}

}
