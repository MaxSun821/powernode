package com.max.oop4;

public class Card {
    private String name;
    private String id;
    private double balance;

    public Card() {
    }

    public Card(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * get the account's balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount < 0) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
    }
}
