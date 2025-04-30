package listas;

public class Employee {

	private Integer id; // Identificador único do funcionário
	private String name; // Nome do funcionário
	private Double salary; // Salário atual do funcionário

	// Construtor padrão (sem argumentos)
	public Employee() {
	}

	// Construtor com argumentos para inicializar o objeto
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Métodos GET e SET (acessores e modificadores)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	// Método que aumenta o salário com base em uma porcentagem fornecida
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;

	}

	@Override /*
				 * anotacao pro compilador informar caso tenha erro de digitacao. Basicamente
				 * diz: estou reescrevendo um método que já existe na classe pai (classe Obj do
				 * java)
				 */
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);

	}

}
