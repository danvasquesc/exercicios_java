package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			Product product = new Product(); /* declaracao de uma variavel do tipo Product */

			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			product.name = sc.nextLine(); /*
											 * o 'name' ja foi declarado dentro da classe Product, e agora o que o
											 * usuario digitar pro 'name' vai ser alocado dentro do objeto 'product' em
											 * especifico no 'name'
											 */

			System.out.print("Price: ");
			product.price = sc.nextDouble();

			System.out.print("Quantity in stock: ");
			product.quantity = sc.nextInt();

			System.out.println(); /* pular uma linha */
			System.out.println("Product data: " + product);

			System.out.println();
			System.out.print("Enter the number of products to be added in stock: ");
			int quantity = sc.nextInt();
			product.addProducts(quantity); /*
											 * é criado a variavel 'quantity' e o usuario irá digitar a quantidade de
											 * produto no estoque. essa variavel vai ser usada no método 'addProducts'.
											 * (lembrando que essa variavel criada agora não é a mesma que o atributo,
											 * pois isso lá na função usa-se 'this' pra nao ter ambiguidade
											 */

			
			
			
			System.out.println();
			System.out.println("Update data: " + product);

			System.out.println();
			System.out.print("Enter the number of products to be removed from stock: ");
			quantity = sc.nextInt();
			product.removeProducts(quantity);

			System.out.println();
			System.out.println("Update data: " + product);
		}
	}
}
