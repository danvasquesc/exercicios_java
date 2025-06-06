/*Classe criada para estudar Membros Estáticos - Parte 2
 * 
 * Aqui não é necessário instanciar o objeto, pois os metodos sao estaticos e é só chamar a classe 'Calculator'*/

package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Versao3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();

			double c = CalculatorV3.circumference(radius);

			double v = CalculatorV3.volume(radius);

			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("volume: %.2f%n", v);
			System.out.printf("PI value: %.2f%n", CalculatorV3.PI);

		}

	}

}
