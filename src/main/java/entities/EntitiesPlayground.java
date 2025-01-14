package entities;

import entities.enums.OrderStatus;

import java.util.Date;

public class EntitiesPlayground {

    public static void main(String[] args) {
        Order iphoneOrder = new Order(1, new Date(), OrderStatus.PROCESSING);

        System.out.println(iphoneOrder.toString());

//        Convert String in enum
        iphoneOrder.setStatus(OrderStatus.valueOf("DELIVERED"));
        System.out.println("iphone" + iphoneOrder);
    }
}
