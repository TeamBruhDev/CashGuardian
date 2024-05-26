package ru.teambruh.cashguardian.core.key;

public final class Key {
    static String key = null;

    public static void setKey(String key) {
        Key.key = key;
    }

    public static boolean isNull() {
        return key == null || key.length() == 0;
    }

    public static boolean isAuthorized() {
        return key != null && check(key);
    }

    public static boolean check(String key) {
        return key.contains("123");
    }
}
