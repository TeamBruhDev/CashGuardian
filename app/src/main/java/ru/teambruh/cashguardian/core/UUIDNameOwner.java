package ru.teambruh.cashguardian.core;

public abstract class UUIDNameOwner extends UUIDOwner {
    protected String name;

    protected UUIDNameOwner(String uuid, String name) {
        super(uuid);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
