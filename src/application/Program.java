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
			
			System.out.println(product);

		}

	}

}
