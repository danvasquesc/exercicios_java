/*Essa classe pertence a classe Exercicio1Construtores*/

package exercicios.poo;

public class ProductConstrutores {

	public String name;
	public double price;
	public int quantity;

	/* O construtor vem depois dos atributos e não recebe o tipo de saida */
	public ProductConstrutores(String name, double price,
			int quantity) { /*
							 * os nomes nos parametros serão os mesmos que os dos atributos, por convenção,
							 * mas não é a mesma coisa, poderia ser nomes diferentes
							 */
		this.name = name; /*
							 * se eu colocar só name, a prioridade será o name dentro do parametro, pois é
							 * uma variavel local do método, por isso usamos 'this' para REFERENCIAR a que
							 * está lá fora, no atributo
							 */
		this.price = price;
		this.quantity = quantity; /*
									 * o primeiro 'quantity' é o do atributo, o segundo que está sendo atribuido é o
									 * do parametro
									 */
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
