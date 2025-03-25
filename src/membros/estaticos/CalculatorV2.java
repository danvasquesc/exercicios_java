/*Essa classe pertence a classe 'Versao2', e poderia ser criada no pacote 'util' pois é uma classe utilitária*/

package membros.estaticos;

public class CalculatorV2 {
	
	/*retirou o 'static' pois agora pode*/
	public final double PI = 3.14159;
		
	public double circumference(double radius) {
		return 2.0 * PI * radius; 
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
