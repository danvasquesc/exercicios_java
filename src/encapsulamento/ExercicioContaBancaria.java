package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter account number: ");
			int numero = sc.nextInt();

			System.out.print("Enter account holder: ");
			String nome = sc.next();

			System.out.print("Is there na initial deposit (y/n)? ");
			char confirmacaoDeposito = sc.next().charAt(0);

			double saldo = 0;

			if (confirmacaoDeposito == 'y') {
				System.out.print("Enter initial deposit value: ");
				saldo = sc.nextDouble();
			}

			Conta conta = new Conta(numero, nome, saldo);

			System.out.println();
			System.out.println("Account data: \n" + conta);

			System.out.println();
			System.out.print("Enter a deposit value: ");
			saldo = sc.nextDouble();
			conta.deposito(saldo);

			System.out.println("Update account data: \n" + conta);

			System.out.println();
			System.out.print("Enter a withdraw value: ");
			saldo = sc.nextDouble();
			conta.saque(saldo);
			
			System.out.println("Update account data: \n" + conta);

		}

	}

}
