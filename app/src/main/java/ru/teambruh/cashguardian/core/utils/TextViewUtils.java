package ru.teambruh.cashguardian.core.utils;

import android.content.Context;
import android.widget.TextView;

import ru.teambruh.cashguardian.core.text.TextStyle;

public final class TextViewUtils {
    public static TextView create(Context context, String text, TextStyle textStyle) {
        TextView textView = new TextView(context);
        textView.setText(text);
        return textStyle.apply(textView);
    }

    public static TextView create(Context context, String text) {
        TextView textView = new TextView(context);
        textView.setText(text);
        return textView;
    }
}
