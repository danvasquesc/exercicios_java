package entities; /*o produto é uma entidade*/

public class Product {
	
	public String name; /*atributo com letra minuscula*/
	public double price;
	public int quantity;
	
	/*metodo calcula o preço baseado na quantidade, para ter o valor final*/
	public double totalValueInStock() { 
		return price * quantity;
	}
	
	/*metodo vai pegar o valor alocado no atributo 'quantity' e somar com o valor que o usuario vai passar atraves do parametro 'quantity'. esse 'quantity' dentro do parametro é um argumento que o usuario vai digitar*/
	public void addProducts(int quantity) {
		this.quantity += quantity; /*this para referenciar o atributo 'quantity' e somar com o parametro 'quantity'*/
	}
	
	/*metodo remove a quantidade de produtos*/
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
