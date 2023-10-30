package cursoProgramacao;

import java.util.Date;

import entities.enums.OrderStatus;
import entities.OrderEnums;

public class Enumeracoes {

	public static void main(String[] args) {
		
		OrderEnums order = new OrderEnums(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
