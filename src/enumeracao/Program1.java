package enumeracao;

import java.util.Date;

public class Program1 {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(),
				OrderStatus.PENDING_PAYMENT); /*
												 * instanciacao do construtor de sobrecarga passando como parametro um
												 * Id, a data e a etapa da enumeracao que solicitei
												 */

		System.out.println(order);

		// Convertendo String para Enum
		OrderStatus os1 = OrderStatus.DELIVERED;

		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);

	}

}
