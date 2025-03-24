/*Essa classe pertence a classe ExercicioSobrecarga*/

package exercicios.poo;

public class ProductSobrecarga {

	public String name;
	public double price;
	public int quantity;

	public ProductSobrecarga(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public ProductSobrecarga() { /* aqui é um construtor padrão */
	}

	/*
	 * novo metodo pra explicar Sobrecarga. Como a proposta do exercicio é nao ter
	 * um valor de quantidade em estoque, pode retirar o parametro 'quantity', que
	 * automaticamente terá valor 0
	 */

	/*
	 * sobrecarga é disponibilizar mais de uma versao da mesma operação. a diferença
	 * entre elas sao os parametros
	 */
	public ProductSobrecarga(String name, double price) {
		this.name = name;
		this.price = price;
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
