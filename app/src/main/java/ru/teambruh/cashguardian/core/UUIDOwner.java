package ru.teambruh.cashguardian.core;

public abstract class UUIDOwner {
    protected final String uuid;

    public UUIDOwner(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
