package construtores_sobrecarga;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1Construtores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine(); /* criada variaveis temporarias pra receber a leitura dos valores */

			System.out.print("Price: ");
			double price = sc.nextDouble();

			System.out.print("Quantity in stock: ");
			int quantity = sc.nextInt();

			ProductConstrutores product = new ProductConstrutores(name, price,
					quantity); /*
								 * depois da entrada dos dados, instanciamos o objeto com o construtor.
								 * lembrando que os parametros precisam ser os mesmos das entradas de dados. O
								 * construtor serve para impedir que o programador faça um erro de instanciar
								 * valores vazios
								 */

			System.out.println();
			System.out.println("Product data: " + product);

			System.out.println();
			System.out.print("Enter the number of products to be added in stock: ");
			quantity = sc.nextInt();
			product.addProducts(quantity);

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
