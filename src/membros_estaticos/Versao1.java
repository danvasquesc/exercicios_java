/*Classe criada para estudar Membros Estáticos - Parte 1*/

package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Versao1 {

	public static final double PI = 3.14159; /*
												 * aqui é uma constante, pois o valor da variavel PI não muda. Aqui já é
												 * um membro estático. Usa-se 'final' para informar que esse valor não
												 * irá mudar. Toda constante tem que ser em letra maiuscula, se tiver
												 * duas palavras, usar underline, ex: NET_SALARY
												 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();

			double c = circumference(radius); /* 'circumference' é o método que calcula a circunferencia do raio */

			double v = volume(radius); /* 'volume' é o método que calcula o volume do raio */

			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("volume: %.2f%n", v);
			System.out.printf("PI value: %.2f%n", PI);

		}

	}
	
	
	/*os metodos sao estáticos 'static' pois não pode chamar um metodo não estático em outro metodo estático, no caso o metodo 'main' (acima)*/
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius; 
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0; /*não precisa colocar parenteses pois multiplicação e divisão tem a mesma ordem de precedencia, logo, como a divisão está no final, será a ultima*/
	}

}
