/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantos alunos serao digitados? ");
			int n = sc.nextInt();

			String[] nome = new String[n];
			double[] nota1 = new double[n];
			double[] nota2 = new double[n];

			double[] media = new double[n];

			int i = 0;
			for (i = 0; i < n; i++) {
				sc.nextLine(); // limpar o buffer do sc.nextInt()
				System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
				nome[i] = sc.nextLine();
				nota1[i] = sc.nextDouble();
				nota2[i] = sc.nextDouble();
			}

			System.out.println("Alunos aprovados:");
			for (i = 0; i < n; i++) {
				media[i] = (nota1[i] + nota2[i]) / 2.0;
			}

			for (i = 0; i < n; i++) {
				if (media[i] >= 6) {
					System.out.println(nome[i]);
				}
			}

		}
	}

}
