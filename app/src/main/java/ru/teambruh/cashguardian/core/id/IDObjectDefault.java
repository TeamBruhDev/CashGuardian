package ru.teambruh.cashguardian.core.id;

public class IDObjectDefault implements IDObject {
    protected String id;

    public IDObjectDefault(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
