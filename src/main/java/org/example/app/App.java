package org.example.app;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@Component
public class App {

    private List<Order> orders = new ArrayList<>();
    private List<Invoice> invoices = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();
    private List<Waybill> waybills = new ArrayList<>();

    public void addOrder(Order order) { orders.add(order); }
    public void addInvoice(Invoice invoice) { invoices.add(invoice); }
    public void addPayment(Payment payment) { payments.add(payment); }
    public void addWaybill(Waybill waybill) { waybills.add(waybill); }

    public Order createOrderFromConsole() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.print("Введите ID заказа: ");
        order.setOrderId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Введите имя клиента: ");
        order.setCustomerName(scanner.nextLine());

        return order;
    }

    public Invoice createInvoiceFromConsole() {
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice();

        System.out.print("Введите ID счета: ");
        invoice.setInvoiceId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Введите дату счета (формат yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
            invoice.setDate(date);
        } catch (ParseException e) {
            System.err.println("Неверный формат даты.");
        }

        System.out.print("Введите сумму счета: ");
        invoice.setAmount(scanner.nextDouble());
        scanner.nextLine();

        return invoice;
    }

    public Payment createPaymentFromConsole() {
        Scanner scanner = new Scanner(System.in);
        Payment payment = new Payment();

        System.out.print("Введите ID оплаты: ");
        payment.setPaymentId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Введите дату оплаты (формат yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
            payment.setDate(date);
        } catch (ParseException e) {
            System.err.println("Неверный формат даты.");
        }

        System.out.print("Введите сумму оплаты: ");
        payment.setAmount(scanner.nextDouble());
        scanner.nextLine();

        return payment;
    }

    public Waybill createWaybillFromConsole() {
        Scanner scanner = new Scanner(System.in);
        Waybill waybill = new Waybill();

        System.out.print("Введите ID накладной: ");
        waybill.setWaybillId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Введите дату накладной (формат yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
            waybill.setDate(date);
        } catch (ParseException e) {
            System.err.println("Неверный формат даты.");
        }

        return waybill;
    }

}

