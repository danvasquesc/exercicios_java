/*Classe TODO*/

package composicao1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	/* Composição de Objetos */
	private Department departmen; // associando o Worker ao Department
	private List<HourContract> contracts = new ArrayList<>(); /*
																 * associando o Worker a varios contracts do tipo
																 * HourContract. Como vao ser varios, colocamos o
																 * HourContract dentro de uma List e chamamos essa lista
																 * de contracts
																 */
	/*
	 * Quando se tem uma parte com varios, nao adiciona ela no construtor, e sim
	 * instancia ela aqui vazia, pois ao longo do tempo vamos usando metodos para
	 * adicionar os contratos, por isso ela nao vai no construtor
	 */

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department departmen) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departmen = departmen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartmen() {
		return departmen;
	}

	public void setDepartmen(Department departmen) {
		this.departmen = departmen;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*
	 * Quando eu quiser adicionar um contrato novo para esse trabalhador, uso esse
	 * método e ele guarda esse contrato na lista
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract); /* Pega esse contrato e coloqua ele dentro da lista chamada contracts */
	}

	/* Se esse contrato já estiver na lista do trabalhador, tira ele de lá */
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	/*
	 * método que percorre a lista de contratos, encontra a data solicitada e gera a
	 * renda total do trabalhador com o salario base + os contratos
	 */
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar
				.getInstance(); /* cria e te entrega um calendário configurado com a data atual do sistema */

		for (HourContract c : contracts) {
			cal.setTime(c.getDate()); /*
										 * muda a data do calendário", que inicialmente está com a data atual do
										 * sistema, para a data do contrato que a gente quer analisar
										 */
			int c_year = cal.get(Calendar.YEAR); /* Permite pegar partes da data (ano, mês, dia, etc.) */
			int c_month = 1 + cal.get(Calendar.MONTH);

			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
