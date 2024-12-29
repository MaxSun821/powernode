package com.max.oop2;

/**
 * ClassName: Account
 * Package: com.max.oop2
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/12/29 13:30
 * @Version 1.0
 */
public class Account {
    private String accountName;
    private double balance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance can't lower than zero");
            return;
        }
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("That's illegal");
            return;
        }
        balance -= amount;
    }
}
