package org.example.app;


import java.util.ArrayList;
import java.util.List;


public class Order {
    private int orderId;
    private String customerName;
    private List<Invoice> invoices = new ArrayList<>();

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public List<Invoice> getInvoices() { return invoices; }
    public void addInvoice(Invoice invoice) { this.invoices.add(invoice); }
}

