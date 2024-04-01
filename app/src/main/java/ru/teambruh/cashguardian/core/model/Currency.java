package ru.teambruh.cashguardian.core.model;

import ru.teambruh.cashguardian.core.UUIDNameOwner;

public class Currency extends UUIDNameOwner {
    protected double cost;

    protected Currency(String uuid, String name, double cost) {
        super(uuid, name);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
