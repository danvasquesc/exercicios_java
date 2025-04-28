package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("How many employees will be registered? ");
			int n = sc.nextInt();

			/*
			 * instanciacao da List, mas como ela nao pode ser instanciada por ser uma
			 * interface, é necessário instanciar nela uma classe, no caso o ArrayList. Por
			 * ser java7 pra cima, nao precisa repetir o Tipo do ArrayList
			 */
			List<Employee> list = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				System.out.println();
				System.out.printf("Employee #%d: \n", i + 1);
				System.out.print("Id: ");
				Integer id = sc.nextInt();

				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.print("Salary: ");
				Double salario = sc.nextDouble();

				/*
				 * instanciacao de um novo funcionario dentro do objeto, ai uso o construtor de
				 * sobrecarga
				 */
				Employee emp = new Employee(id, nome, salario);

				/* adicionar o objeto emp na lista */
				list.add(emp);

			}

			/* leitura do id que vai ser incrementado o salario */
			System.out.print("Enter the employee id that will have salary increase: ");
			Integer idSalary = sc.nextInt();

			/* verificacao que ve se o id existe */

		}

		/* funcao auxiliar pra procurar um elemento na lista (30:52) */

	}

}
