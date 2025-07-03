/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo (UML)
*/

package composicao1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			SimpleDateFormat sdf = new SimpleDateFormat(
					"dd/MM/yyyy"); /* informa o formato que a data terá de entrada */

			System.out.print("Enter department's name: ");
			String departmentName = sc.nextLine();

			System.out.println("Enter worker data:");
			System.out.print("Name: ");
			String workerName = sc.nextLine();
			System.out.print("Level: ");
			String workerLevel = sc.nextLine();
			System.out.print("Base salary: ");
			double baseSalary = sc.nextDouble();

			Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(
					departmentName)); /*
										 * WorkerLevel.valueOf(workerLevel) - converte a String que o usuario digitou em
										 * uma das enumeracoes / new Department(departmentName)) - instacia o obj
										 * Department e aloca o departmentName dentro do atributo do obj. É nessa parte
										 * que a gente associa o Worker ao obj Department
										 */

			System.out.print("How many contracts to this worker? ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.println("Enter contract #" + i + " data:");

				System.out.print("Date (DD/MM/YYYY): ");
				Date contractDate = sdf.parse(
						sc.next()); /*
									 * faz a leitura da data de acordo com o formato que informei no sdf la em cima
									 */

				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();

				System.out.print("Duration (hours): ");
				int hours = sc.nextInt();

				HourContract contract = new HourContract(contractDate, valuePerHour,
						hours); /* instanciado o obj contract */
				worker.addContract(contract); /*
												 * aqui associa o contrato ao trabalhador, atraves do metodo que criamos
												 * na classe Worker para adicionar addContract
												 */
			}

			System.out.println();
			System.out.print("Enter month and year to calculate income (MM/YYYY): ");
			String monthAndYear = sc.next();
			int mouth = Integer.parseInt(monthAndYear.substring(0,
					2)); /*
							 * recorta o String acima e gera um subtring com dois primeiros digitos que
							 * informei/ o Integer.parseInt converte o String em inteiro
							 */
			int year = Integer.parseInt(monthAndYear.substring(3)); /* aqui recorta do 3 em diante */

			System.out.println("Name: " + worker.getName()); /* pega o name da classe Worker */
			System.out.println("Department: "
					+ worker.getDepartmen().getName()); /*
														 * pega o department que está associado a classe worker e depois
														 * o name dentro da classe department
														 */
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",
					worker.income(year, mouth))); /* chamamos o metodo income passando o ano e mes */

		}

	}

}
