package ru.teambruh.cashguardian.core.model;

import ru.teambruh.cashguardian.core.UUIDOwner;

public class Category extends UUIDOwner {
    protected String name;

    protected Category(String uuid, String name) {
        super(uuid);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
