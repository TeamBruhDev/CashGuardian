package ru.teambruh.cashguardian.core.id;

import java.util.ArrayList;
import java.util.HashMap;

public class IDObjectsRegistry<T extends IDObject> {
    protected HashMap<String, T> registry = new HashMap<>();
    protected ArrayList<T> items = new ArrayList<>();
    protected ArrayList<String> ids = new ArrayList<>();

    public void add(T item) {
        registry.put(item.getId(), item);
        items.add(item);
        ids.add(item.getId());
    }

    public void remove(String id) {
        T removed = registry.remove(id);
        if (removed == null) return;
        items.remove(removed);
        ids.remove(id);
    }

    public T get(String id) {
        return registry.get(id);
    }

    public ArrayList<T> getAll() {
        return items;
    }

    public ArrayList<String> getIds() {
        return ids;
    }
}
