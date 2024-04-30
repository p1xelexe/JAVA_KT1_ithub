package org.example.app;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        App app = ctx.getBean(App.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию о заказе:");
        Order order = app.createOrderFromConsole();

        System.out.println("Введите информацию о счете:");
        Invoice invoice = app.createInvoiceFromConsole();

        System.out.println("Введите информацию об оплате:");
        Payment payment = app.createPaymentFromConsole();

        System.out.println("Введите информацию о накладной:");
        Waybill waybill = app.createWaybillFromConsole();

        app.addOrder(order);
        app.addInvoice(invoice);
        app.addPayment(payment);
        app.addWaybill(waybill);

        // Вывод информации
        System.out.println("\nID заказа: " + order.getOrderId());
        System.out.println("Имя клиента: " + order.getCustomerName());

        System.out.println("\nID счета: " + invoice.getInvoiceId());
        System.out.println("Дата счета: " + invoice.getDate());
        System.out.println("Сумма счета: " + invoice.getAmount());

        System.out.println("\nID оплаты: " + payment.getPaymentId());
        System.out.println("Дата оплаты: " + payment.getDate());
        System.out.println("Сумма оплаты: " + payment.getAmount());

        System.out.println("\nID накладной: " + waybill.getWaybillId());
        System.out.println("Дата накладной: " + waybill.getDate());

        ctx.close();
    }
}
