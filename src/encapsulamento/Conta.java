/*essa classe pertence a 'ExercicioContaBancaria'*/

package encapsulamento;

public class Conta {

	private int numero;
	private String nome;
	double saldo;

	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	/*
	 * Sobrecarga - sem o parametro 'valor', pois ele pode iniciar em 0, se nao
	 * tiver deposito
	 */
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	/* GET e SET - o numero da conta nao recebe set pois nao pode ser alterado */
	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/* metodos para deposito e saque */

	public void deposito(double saldo) {
		this.saldo += saldo;

	}

	public void saque(double saldo) {
		this.saldo = this.saldo - (saldo + 5.0); /*
													 * this.saque era 700, ai adicionei a taxa ao valor que quero sacar
													 * e o resultado subtraio do this.saque
													 */
	}

	public String toString() {
		return "Account " + numero + ", Holder: " + nome + String.format(", Balance: $ %.2f", saldo);
	}

	
}
