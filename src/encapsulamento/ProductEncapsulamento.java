package encapsulamento;

public class ProductEncapsulamento {

	private String name;
	private double price;
	private int quantity;

	/* Construtores */
	public ProductEncapsulamento() {
	}

	public ProductEncapsulamento(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public ProductEncapsulamento(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/* Get e Set */

	public String getName() { /* metodo que retorna o atributo no programa principal */
		return name;
	}

	public void setName(String name) { /* alteracao do atributo name */
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() { /*
								 * por regra de negócio, o 'quantity' terá apenas o retorno do valor, para
								 * proteção do produto, evitando alterações inconsistentes. então ele não recebe
								 * o metodo 'set'
								 */
		return quantity;
	}

	/*
	 * para fazer a alteção da quantidade de produtos, cria-se metodos especificos
	 * pra isso, como entrada e saida do estoque
	 */

	public void addProducts(int quantity) {
		this.quantity = quantity + quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity = quantity - quantity;

	}

}
