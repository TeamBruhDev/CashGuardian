package ru.teambruh.cashguardian.core.model;

import ru.teambruh.cashguardian.core.UUIDOwner;

public class Transaction extends UUIDOwner {
    protected Balance balance;
    protected Category category;
    protected double value;

    protected Transaction(String uuid, Balance balance, Category category, double value) {
        super(uuid);
        this.balance = balance;
        this.category = category;
        this.value = value;
    }

    public Balance getBalance() {
        return balance;
    }

    public Category getCategory() {
        return category;
    }

    public double getValue() {
        return value;
    }
}
