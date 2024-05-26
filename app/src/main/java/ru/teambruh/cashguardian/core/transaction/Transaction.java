package ru.teambruh.cashguardian.core.transaction;

import java.util.Date;

import ru.teambruh.cashguardian.core.category.Category;
import ru.teambruh.cashguardian.core.id.IDObjectDefault;
import ru.teambruh.cashguardian.core.id.IDObjectsRegistry;

public class Transaction extends IDObjectDefault {
    public static final IDObjectsRegistry<Transaction> all = new IDObjectsRegistry<>();
    protected Date date;
    protected String categoryId;
    protected double value;

    public Transaction(String id, Date date, String categoryId, double value) {
        super(id);
        all.add(this);
        this.date = date;
        this.categoryId = categoryId;
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
