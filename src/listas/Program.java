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
			int n = sc.nextInt(); // Quantidade de funcionários a serem cadastrados

			/*
			 * instanciacao da List, mas como ela nao pode ser instanciada por ser uma
			 * interface, é necessário instanciar nela uma classe, no caso o ArrayList. Por
			 * ser java7 pra cima, nao precisa repetir o Tipo do ArrayList
			 */
			List<Employee> list = new ArrayList<>(); /*
														 * Crie uma nova lista de funcionários vazia, onde eu vou
														 * guardar vários objetos do tipo Employee
														 */

			// Loop para cadastrar os funcionários
			for (int i = 0; i < n; i++) {
				System.out.println();
				System.out.printf("Employee #%d: \n", i + 1);
				System.out.print("Id: ");
				Integer id = sc.nextInt();

				while (hasId(list, id)) { /*
											 * enquanto tiver um ID que ja digitei na lista, ou seja, nao pode ter um ID
											 * repetido
											 */
					System.out.println("Id already taken! Try again: "); /* esse ID ja existe, tente novamente */
					id = sc.nextInt(); /*
										 * le novamente o ID diferente. Se for diferente do que ja tem na lista, encerra
										 * o while e continua a linha abaixo
										 */
				}

				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.print("Salary: ");
				Double salario = sc.nextDouble();

				/*
				 * Criação de um novo funcionário com os dados fornecidos. Instanciacao de um
				 * novo funcionario dentro do objeto, ai uso o construtor de sobrecarga
				 */
				Employee emp = new Employee(id, nome, salario);

				/* Adiciona o funcionário à lista */
				list.add(emp);

			}

			/*
			 * leitura do id que vai ser incrementado o salario. Solicita o ID de um
			 * funcionário para aumento de salário
			 */
			System.out.println();
			System.out.print("Enter the employee id that will have salary increase: ");
			Integer idSalary = sc.nextInt(); // Leitura desse ID

			Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst()
					.orElse(null); /*
									 * o filter vai filtrar na lista só o predicado que eu coloquei dentro do (), ou
									 * seja, filtra a lista somente os funcionarios (x) que quando identificado o
									 * ID, seja igual o ID que informei (idSalary). o 'findFirst()' pede pra pegar o
									 * primeiro funcionario que aparecer nesse filtro. o 'orElse(null)' diz que se
									 * nao aparecer nenhum funcionario no primeiro, retorne nulo
									 */

			if (emp == null) {
				System.out.println("This id does not exist!"); // ID não encontrado
			} else {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				// Aumenta o salário do funcionário usando o método da classe Employee
				emp.increaseSalary(percent); /*
												 * Aqui é só chamar pro emp o método que criei pra calcular a
												 * porcentagem do salario
												 */

			}

			/*
			 * ALTERNATIVA ANTERIOR - Integer pos = position(list, idSalary); aqui está
			 * usando a funcao que criei abaixo. Se encontrar o id que estou procurando, a
			 * variavel pos nao vai ser null, vai ser o indice/posicao do Id. Esse list é a
			 * lista la em cima que instanciei
			 */
			/*
			 * if (pos == null) { System.out.println("This id does not exist!"); // ID não
			 * encontrado } else { System.out.print("Enter the percentage: "); double
			 * percent = sc.nextDouble(); // Aumenta o salário do funcionário usando o
			 * método da classe Employee list.get(pos).increaseSalary( percent); /* get(pos)
			 * vai acessar o funcionario que está na posicao pos, que vai receber o aumento
			 * de salario. Ai eu chamo o metodo que criei no Employee que vai receber o
			 * valor da porcentagem pra calcular o aumento
			 * 
			 * }
			 */

			System.out.println();
			System.out.println("List of employees:");
			for (Employee e : list) { /* pra cada e do tipo Employee da minha list, faça */
				System.out.println(e);
			}

		}

	}

	/*
	 * Método auxiliar para encontrar a posição (índice) de um funcionário com base
	 * no ID
	 */
	/*
	 * esse metodo vai receber como argumento uma lista de funcionarios que dei o
	 * nome de list (nao é a mesma do main, está fora do main) e um id. Esse metodo
	 * vai retornar o INDICE, POSICAO do id na lista que estou procurando. Ela tem
	 * que ser static pois está dentro da classe Main, que é static tambme
	 */
	public static Integer position(List<Employee> list, int id) { /* metodo que vai retornar a posicao/indice do Id */
		for (int i = 0; i < list.size(); i++) { /*
												 * o size() é toda a lista, ou seja, vai encerrar o for quando o i for
												 * menor do que o tamanho da lista
												 */
			if (list.get(i).getId() == id) { /*
												 * get é uma funcao que pega o elemento na posicao i, se esse id for
												 * igual ao que estou procurando, vai retornar a posicao (i)
												 */
				return i;
			}
		}
		return null; /*
						 * se o for percorrer toda a lista e nao encontrar o Id que estou procurando,
						 * vai encerrar e retornar null
						 */
	}

	// funcao pra verificar se o ID ja existe ou nao

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	/*
	 * EXPLICACAO DA FUNCAO ACIMA: list.stream() - converte a lista (List<Employee>)
	 * em um Stream (fluxo de dados), isso permite usar operações funcionais como
	 * filter, map, findFirst. .filter(x -> x.getId() == id) - Filtra o stream, x
	 * representa cada objeto da lista, x.getId() == id: compara o id do funcionário
	 * com o id fornecido, Resultado: um novo stream contendo apenas os elementos
	 * que têm o ID desejado. .findFirst() - Pega o primeiro elemento do stream que
	 * passou pelo filtro. return emp != null - Retorna true se um funcionário com o
	 * ID foi encontrado (ou seja, emp não é nulo), retorna false caso contrário.
	 */

}
