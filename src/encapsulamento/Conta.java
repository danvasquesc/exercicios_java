/*essa classe pertence a 'ExercicioContaBancaria'*/

package encapsulamento;

public class Conta {

	private int numero;
	private String nome;
	double saldo;

	/*
	 * como o exercicio o usuario pode informar tres argumentos ou dois (pode nao
	 * ter o deposito inicial, criamos dois construtores, um com os tres atributos e
	 * outro sem o atributo saldo
	 */

	/*
	 * Sem o parametro 'saldo', pois ele pode iniciar em 0, se nao tiver deposito/
	 * aqui o usuario nao digitou o deposito inicial
	 */
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	/*
	 * Sobrecarga - no parametro trocamos o nome de 'saldo' para 'depositoInicial'
	 * pra ficar mais facil de entender que esse construtor serve pro deposito
	 * inicial, não o saldo, pois saldo vai ter em todas as situações. O valor que o
	 * usuario digita no inicio é o deposito inicial
	 */
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial); /*
									 * aqui é chamado o metodo 'deposito' que recebe como parametro o
									 * 'depositoInicial'. Esta operacao facilita caso a regra de negocio mude, por
									 * exemplo: caso o banco queira adicionar uma taxa no desposito, nao é
									 * necessario alterar o construtor, somente o metodo de deposito
									 */
	}

	/*
	 * GET e SET o numero da conta nao recebe SET pois nao pode ser alterado o saldo
	 * só pode ser alterado com metodos especificos, entao não é criado o metodo SET
	 */
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

	/*
	 * metodos para deposito e saque cria-se o parametro 'quantia' para nao
	 * confundir com o saldo esse parametro pertence a esses metodos
	 */

	public void deposito(double quantia) {
		saldo = saldo + quantia; /*
									 * aqui retirei o 'tihs' pq temos o parametro 'quantia', entao nao precisa
									 * referenciar o 'saldo'
									 */

	}

	public void saque(double quantia) {
		saldo = saldo - (quantia + 5.0); /*
											 * o saldo era 700, ai adicionei a taxa ao valor que quero sacar que é a
											 * 'quantia' e o resultado subtraio do saldo
											 */
	}

	public String toString() {
		return "Account " + numero + ", Holder: " + nome + String.format(", Balance: $ %.2f", saldo);
	}

}
