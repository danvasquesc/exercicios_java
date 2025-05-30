package logica;

/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double salario, valorImposto;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite seu salário: R$ ");
			salario = sc.nextDouble();

			valorImposto = 0.0;

			if (salario <= 2000.00) {
				valorImposto = 0.0;
			} else if (salario <= 3000.00) {
				valorImposto = (salario - 2000.00) * 0.08;
				/* 2000 tira o valor da faixa anterior */
			} else if (salario <= 4500.00) {
				valorImposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			} else {
				valorImposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			}

			/* criada condicao para mostrar o resultado */
			if (valorImposto == 0.0) {
				System.out.println("Isento");
			} else {
				System.out.printf("R$ %.2f", valorImposto);
			}
		}
	}
}