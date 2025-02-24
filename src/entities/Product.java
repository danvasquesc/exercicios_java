package entities; /*o produto é uma entidade*/

public class Product {

	public String name; /* atributo com letra minuscula */
	public double price;
	public int quantity;

	/* metodo calcula o preço baseado na quantidade, para ter o valor final */
	public double totalValueInStock() {
		return price * quantity;
	}

	/*
	 * metodo vai pegar o valor alocado no atributo 'quantity' e somar com o valor
	 * que o usuario vai passar atraves do parametro 'quantity'. esse 'quantity'
	 * dentro do parametro é um argumento que o usuario vai digitar
	 */
	public void addProducts(int quantity) {
		this.quantity += quantity; /*
									 * this para referenciar o atributo 'quantity' e somar com o parametro
									 * 'quantity'
									 */
	}

	/* metodo remove a quantidade de produtos */
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	/* metodo para sobrepor o metodo padrao 'toString' */
	/*
	 * public String toString() { 
	 * return name; /* no Program eu posso imprimir
	 * product.toString, chamando esse metodo, e ai vai aparecer na tela o dado
	 * alocado na variavel 'name'. também nao precisa colocar o metodo toString, se
	 * colocar apenas pra imprimir 'product', depois de ter criado esse metodo, vai
	 * aparecer o 'name', pois o java reconhece automaticamente
	 */

	/*metodo oficial pra saida de dados do Program*/
	public String toString() {
		return name + ", $ " 
					+ String.format("%.2f", price) /*formatar a saida para ter dois zeros decimais, do que um*/
					+ ", " 
					+ quantity 
					+ " units, Total: $ " 
					+ String.format("%.2f", totalValueInStock());
	}
	
}
