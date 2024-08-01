package org.example;

public class CreditCard {
    private String customerName;
    private String bankName;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customerName, String bankName, String account, int limit, double balance) {
        this.customerName = customerName;
        this.bankName = bankName;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String customerName, String bankName, String account, int limit) {
        this(customerName, bankName, account, limit, 0);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(int price) {
        if (price + balance > limit)
            return false;

        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    public static void printSummary(CreditCard card) {
        System.out.println("Customer Name: " + card.customerName);
        System.out.println("Bank Name: " + card.bankName);
        System.out.println("Account: " + card.account);
        System.out.println("Balance: " + card.balance);
        System.out.println("Limit: " + card.limit);
    }
}
