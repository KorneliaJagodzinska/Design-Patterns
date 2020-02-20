package Observer.notification;

import Observer.order.Order;

public class Email {
    public void update(Order order) {
        System.out.println("E-mail - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
