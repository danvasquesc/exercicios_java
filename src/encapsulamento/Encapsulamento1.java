package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Encapsulamento1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			ProductEncapsulamento product = new ProductEncapsulamento(name, price);

			product.setName("Computer"); /* chama-se o metodo set passando como argumento o novo valor que eu quiser */

			System.out.println(
					"Update name: " + product.getName()); /* chama-se o metodo para aparecer o valor do atributo */

			product.setPrice(1200.00); /* altera valor do price */
			System.out.println("Update price: " + product.getPrice()); /* acessa o novo valor do price */

		}

	}

}
