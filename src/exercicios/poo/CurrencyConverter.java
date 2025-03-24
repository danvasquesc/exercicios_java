/*esta classe pode ser criada no pacote 'util' - Pertence a classe 'ConversaoDolarParaReal'*/

package exercicios.poo;

public class CurrencyConverter {
	
	public static double IOF = 0.06; /*porcentagem de imposto*/

	public static double conversor(double dollar, double qntdDollar) {
		return qntdDollar * dollar * (1.0 + IOF); /*1.0 é a mesma coisa que 100% do valor original, ou seja, é o valor que resulta da conversão, que ai seja adicionado o imposto*/
	}

}
