/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos

UTILIZACAO DE MEMBROS ESTATICOS*/


package poo;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoDolarParaReal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("What is the dollar price? ");
			double dollar = sc.nextDouble();
			
			System.out.print("How many dollars will be bought? ");
			double qntdDollar = sc.nextDouble();
			
			double valorReal = CurrencyConverter.conversor(dollar, qntdDollar);
			
			System.out.printf("Amount to be paid in reais = %.2f%n", valorReal);
			
		}

	}

}
