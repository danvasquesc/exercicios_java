package logica;

/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
nas variáveis. */

public class AtribuicoesVariaveis {

	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		int variavelTemporaria;

		System.out.println("Antes da troca:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);

		/* alocar o valor temporariamente pro A não ficar perdido */
		variavelTemporaria = A;
		A = B;
		B = variavelTemporaria;

		System.out.println("Depois da troca:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);

	}

}
