/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

package poo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2POO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			Employee funcionario = new Employee();

			System.out.print("Name: ");
			funcionario.name = sc.nextLine();

			System.out.print("Gross salary: ");
			funcionario.grossSalary = sc.nextDouble();

			System.out.print("Tax: ");
			funcionario.tax = sc.nextDouble();

			System.out.println();
			System.out.println("Employee: " + funcionario);

			System.out.println();
			System.out.print("Which percentage to increase salary? ");
			double percentage = sc.nextDouble();
			funcionario.increaseSalary(
					percentage); /*
									 * a variavel 'percentage' pertencia somente ao metodo 'increaseSalary'. pra
									 * poder receber o valor pelo usuario, é necessario criar uma nova variavel do
									 * mesmo nome que está no metodo, assim o metodo reconhece a entrada do usuario
									 */

			System.out.println();
			System.out.println("Update data: " + funcionario);

		}

	}

}
