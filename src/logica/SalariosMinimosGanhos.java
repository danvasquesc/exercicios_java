package logica;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00) */

import java.util.Scanner;

public class SalariosMinimosGanhos {

	public static void main(String[] args) {

		double salarioMinimo = 788.00;
		double salarioUsuario;
		int qntdSalario;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Digite o valor do seu salário: ");
			salarioUsuario = sc.nextDouble();

			qntdSalario = (int) Math.round(salarioUsuario / salarioMinimo);/* arredondamento pra mais */

			System.out.println("A quantidade de salários mínimos recebido é " + qntdSalario);

		}

	}

}
