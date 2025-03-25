/*Classe criada para estudar Membros Estáticos - Parte 1*/

package membros.estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Versao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			
			CalculatorV2 calc = new CalculatorV2(); /*instanciar objeto*/

			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();

			double c = calc.circumference(radius);

			double v = calc.volume(radius);

			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("volume: %.2f%n", v);
			System.out.printf("PI value: %.2f%n", calc.PI);

		}

	}

}
