package date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ObterDadosConverterDataHora {

	public static void main(String[] args) {

		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		/*
		 * Imprime os nomes das zonas que podemos usar for (String s :
		 * ZoneId.getAvailableZoneIds()) { System.out.println(s); }
		 */

		// CONVERTER DATA-HORA GLOBAL PARA LOCAL
		// Convertendo o Instant (que é global) pra um LocalDate, considerando o fuso da
		// minha maquina
		LocalDate resultado1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println(resultado1);

		// Convertendo usando um nome
		LocalDate resultado2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(resultado2);

		// Convertendo o Instant (que é global) pra um LocalDateTime, considerando o
		// fuso da minha maquina
		LocalDateTime resultado3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		System.out.println(resultado3);

		// Convertendo usando um nome
		LocalDateTime resultado4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(resultado4);

		// OBTER DADOS DE UMA DATA-HORA LOCAL

		LocalDate d01 = LocalDate.parse("2022-07-20");
		System.out.println(d01.getDayOfMonth()); // imprime o dia do mês
		System.out.println(d01.getMonthValue()); // imprime o mês
		System.out.println(d01.getYear()); // imprime o ano

		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d02.getHour()); // imprime a hora
		System.out.println(d02.getMinute()); // imprime os minutos
		System.out.println(d02.getSecond()); // imprime os segundos

	}

}
