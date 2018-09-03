package com.ivanp;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phone;


    public BankAccount(String number, double balance, String customerName, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount() {
        this("Default Number", 0.00, "Default Name", "Default Email", "Default Phone");
    }

    public BankAccount(String customerName, String email, String phone) {
        this("99999", 50.0, customerName, email, phone);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    public void withdrawFunds(int amount) {
        if (balance - amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Withdraw failed. Tried to withdraw " + amount + ", while balance is " + balance);
        }
    }
}
