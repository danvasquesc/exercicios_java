/*Essa classe pertence a classe 'Versao3'
 * Aqui vamos transformar os metodos em estaticos, pois eles nao precisam de objeto para serem chamados*/

package exercicios.poo;

public class CalculatorV3 {
	
	/*coloca-se 'static' pois independente de qualquer objeto do tipo 'Calculator'*/
	public static final double PI = 3.14159;
		
	public static double circumference(double radius) {
		return 2.0 * PI * radius; 
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
