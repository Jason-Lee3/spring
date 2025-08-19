package org.example;

import java.awt.color.ICC_ColorSpace;

public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            return;
        }
        accountBalance = accountBalance + amount;
        System.out.println("$" + accountBalance);
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            return;
        }

        if (accountBalance < amount) {
            return;
        }

        accountBalance = accountBalance - amount;
        System.out.println("$" + accountBalance);
    }
}
