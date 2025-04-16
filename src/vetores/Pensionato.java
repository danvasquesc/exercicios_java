package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {

			PensionatoRent[] vect = new PensionatoRent[10]; /*
															 * 10 posicoes pois é a quantidade de quartos - de 0 a 9/
															 * aqui o vetor vai ser do tipo PensionatoRent
															 */

			System.out.print("How many rooms will be rented? ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) { /*
											 * iniciar o i com 1 pois ele nao vai ser usado pras posicoes do vetor, e
											 * sim a variavel 'room'
											 */
				System.out.println();
				System.out.println("Rent #" + i + ":"); /* nao precisa de formatação pois o i já começa com 1 */
				System.out.print("Name: ");
				sc.nextLine(); /* limpar buffer */
				String name = sc.nextLine();

				System.out.print("Email: ");
				String email = sc.next();

				System.out.print("Room: ");
				int room = sc.nextInt();

				vect[room] = new PensionatoRent(name, email); /* os dados serao armazenados no indice que é citado no 'room' */

			}
			System.out.println();
			System.out.println("Busy rooms:");

			for (int i = 0; i < 10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]); /* esse vect vai imprimir nosso toString */
				}
			}

		}

	}

}
