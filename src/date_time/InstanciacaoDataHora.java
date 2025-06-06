package date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciacaoDataHora {

	public static void main(String[] args) {

		// Instanciando (agora) > Data-hora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // aqui gera a hora padrão GMT

		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);

		// Instanciando Texto ISO 8601 > Data-hora
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);

		// Instanciando Texto formato customizado > Data-hora

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // instanciar a partir de um padrão
																				// 'of.Pattern'
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d08 = LocalDate.parse("06/06/2025", formato1);
		LocalDateTime d09 = LocalDateTime.parse("06/06/2025 01:30", formato2);

		System.out.println(d08); // sai no formato ISO
		System.out.println(d09);

		// Instanciando dia, mês, ano, [horário] > Data-hora local

		LocalDate d10 = LocalDate.of(2022, 7, 20); // metodo of aceita dia, mes e ano
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30); // 1 e 30 é hora e minuto

		System.out.println(d10);
		System.out.println(d11);

	}

}
