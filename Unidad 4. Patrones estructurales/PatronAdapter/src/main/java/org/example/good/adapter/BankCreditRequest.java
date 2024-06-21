package org.example.good.adapter;

public class BankCreditRequest {

    private String customer;
    private double amount;

    public BankCreditRequest() {
    }

    public BankCreditRequest(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
