package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			Conta conta; /*
							 * criado variavel do objeto para poder instanciar ela no if. Se eu instanciar
							 * no if, o processo fica limitado só dentro da estrutura, não fora
							 */

			System.out.print("Enter account number: ");
			int numero = sc.nextInt();

			System.out.print("Enter account holder: ");
			sc.nextLine(); /*
							 * serve para limpar o buffer e permitir ler o nome que possue espaço, por
							 * exemplo 'Alex Green'
							 */
			String nome = sc.nextLine();

			System.out.print("Is there na initial deposit (y/n)? ");
			char confirmacaoDeposito = sc.next().charAt(0);

			if (confirmacaoDeposito == 'y') {
				System.out.print("Enter initial deposit value: ");
				double depositoInicial = sc.nextDouble();
				conta = new Conta(numero, nome,
						depositoInicial); /*
											 * aqui instanciei o construtor com os tres parametros, pois vai ter
											 * deposito inicial - Aqui é o construtor de Sobrecarga
											 */
			} else {
				conta = new Conta(numero, nome); /* aqui cria a conta com o construtor de dois argumentos */
			}

			System.out.println();
			System.out.println("Account data: \n" + conta);

			System.out.println();
			System.out.print("Enter a deposit value: ");
			double valorDeposito = sc.nextDouble();
			conta.deposito(valorDeposito); /*
											 * o metodo 'deposito' vai receber essa variavel 'valorDeposito' para fazer
											 * sua acao
											 */
			System.out.println("Update account data: \n" + conta);

			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double valorSaque = sc.nextDouble();
			conta.saque(valorSaque);
			System.out.println("Update account data: \n" + conta);

		}

	}

}
