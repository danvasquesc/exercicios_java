package date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {

		// Calculos com LocalDate
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDate pastWeekLocalDate = d01.minusDays(7); /*
														 * semana anterior, ou seja, o metodo minusDays vai diminuir 7
														 * dias da data que está no d01
														 */
		LocalDate nextWeekLocalDate = d01.plusDays(7); // acrescenta mais 7 dias do d01

		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);

		// Calculos com LocalDateTime
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);

		// Calculos com Instant
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		Instant pastWeekInstant = d03.minus(7,
				ChronoUnit.DAYS); /*
									 * ChronoUnit realiza operações como adicionar ou subtrair unidades de tempo.
									 * Aqui estou pedindo para diminuir 7 dias da data do d03
									 */
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);

		// Calculos de duração entre duas data-hora

		// LocalDateTime
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02); // between verifica o intervalo entre esses dois
																	// parametros informados
		System.out.println(t1.toDays()); // toDays pra mostrar o intervalo em dias

		/*
		 * Nao tem como ver a duracao de um LocalDate pois nao tem horas e minutos,
		 * entao podemos converter para LocalDateTime usando o 'atTime' (PODE SER
		 * CONSIDERADO UMA GAMBIARRA - MODO CORRETO ABAIXO Duration t2 =
		 * Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
		 * System.out.println(t2.toDays());
		 */

		// LocalDate
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(),
				d01.atStartOfDay()); /*
										 * em vez de escrever 0, 0 eu coloco 'atStartOfDay' que é usado para obter o
										 * instante inicial de um dia (meia-noite)
										 */
		System.out.println(t2.toDays());

		// Instant
		Duration t3 = Duration.between(pastWeekInstant, d03);
		System.out.println(t3.toDays());

		// Invertido (primeiro a data mais a frente e segundo a data mais antiga)
		Duration t4 = Duration.between(d03, pastWeekInstant);
		System.out.println(t4.toDays());

	}

}
