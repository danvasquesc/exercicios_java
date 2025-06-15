package date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHora {

	public static void main(String[] args) {

		// Formatar Data-hora > Texto formato customizado

		// Data
		LocalDate d01 = LocalDate.parse("2022-07-20");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // ofPattern é um método que cria um
																			// formatador de data e hora e transforma em
																			// strings

		System.out.println(d01.format(fmt1)); // usando o metodo format e o objeto 'fmt1' como argumento, formata a
												// string pro padrao que eu criei
		System.out.println(fmt1.format(d01)); // tambem posso chamar desse modo
		System.out.println(d01.format(DateTimeFormatter
				.ofPattern("dd/MM/yyyy"))); /*
											 * assim tambem da pra chamar, mas vou estar instanciando o objeto na hora
											 * que roda, e depois é apagado (nao pode ser reaproveitado)
											 */

		// Data e hora
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println(d02.format(fmt1)); // aqui imprime so a data por conta do 'fmt1'
		System.out.println(d02.format(fmt2)); // imprime a data e a hora formatada no objeto 'fmt2'

		// Instant
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(
				ZoneId.systemDefault()); /*
											 * withZone especifica qual é o fuso horario que vou usar.
											 * ZoneId.systemDefault() pega o fuso horario do computador do usuario
											 */

		System.out.println(fmt3.format(d03)); // Instant nao tem o metodo 'format' entao tem que usar o objeto 'fmt3'

		// Usando um padrao da classe da documentacao da Oracle
		LocalDateTime d04 = LocalDateTime.parse("2022-07-20T01:30:26");

		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

		System.out.println(fmt4.format(d04)); /*
												 * vai imprimir 2022-07-20T01:30:26 sem precisar o metodo ofPattern,
												 * pois o metodo ISO_DATE_TIME ja faz isso
												 */

		// usando o padrao ISO_DATE_TIME pro Instant
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		System.out.println(fmt5.format(d03)); // aqui imprime 2022-07-20T01:30:26Z informando o fuso que é o Z

	}

}
