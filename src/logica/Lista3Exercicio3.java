package logica;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */
import java.util.Scanner;

public class Lista3Exercicio3 {

	public static void main(String[] args) {

		int tipoCombustivel;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o tipo de combustível: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			tipoCombustivel = sc.nextInt();

			while (tipoCombustivel != 4) {
				if (tipoCombustivel == 1) {
					alcool += 1;
				} else if (tipoCombustivel == 2) {
					gasolina += 1;
				} else if (tipoCombustivel == 3) {
					diesel += 1;
				}

				System.out.println("Digite o tipo de combustível: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
				tipoCombustivel = sc.nextInt();
			}

			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
		}
	}
}
