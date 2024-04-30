package org.example.app;

import java.util.Date;

public class Payment {
    private int paymentId;
    private Date date;
    private double amount;

    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
