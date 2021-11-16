package com.revature.scottbank.models;

public class Account extends Object {

    private String id;
    private double balance;
    private AppUser holder;

    public Account(String id, AppUser holder) {
        this.id = id;
        this.balance = 0.00d;
        this.holder = holder;
    }

    public Account() { super(); }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public AppUser getHolder() { return holder; }
    public void setHolder(AppUser holder) { this.holder = holder; }

}
