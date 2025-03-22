package exercicios.poo;

public class Employee {

	public String name;
	public double grossSalary; /* salario bruto */
	public double tax; /* imposto */

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary = grossSalary + (grossSalary * 10.0
				/ 100.0); /*
							 * dentro do parenteses a gente descobre a porcentagem, ou seja, quanto é 10% de
							 * 6000 (grossSalary). depois adicionamos o resultado (600) ao salario bruto
							 * antigo. e por fim atribuimos o resultado ao novo salario bruto
							 */
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
