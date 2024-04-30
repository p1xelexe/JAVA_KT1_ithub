package org.example.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Invoice {
    private int invoiceId;
    private Date date;
    private double amount;
    private List<Payment> payments = new ArrayList<>();

    public int getInvoiceId() { return invoiceId; }
    public void setInvoiceId(int invoiceId) { this.invoiceId = invoiceId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public List<Payment> getPayments() { return payments; }
    public void addPayment(Payment payment) { this.payments.add(payment); }
}
