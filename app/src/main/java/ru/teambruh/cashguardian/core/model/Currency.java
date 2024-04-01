package ru.teambruh.cashguardian.core.model;

import ru.teambruh.cashguardian.core.UUIDOwner;

public class Currency extends UUIDOwner {
    protected String name;
    protected double cost;

    protected Currency(String uuid, String name, double cost) {
        super(uuid);
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
