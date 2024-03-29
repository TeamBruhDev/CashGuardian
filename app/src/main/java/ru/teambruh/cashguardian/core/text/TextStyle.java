package ru.teambruh.cashguardian.core.text;

import android.graphics.Color;
import android.widget.TextView;

public class TextStyle {
    public static final TextStyle defaultStyle = new TextStyle();

    protected double size = 16;
    protected int color = Color.BLACK;

    public TextStyle(double size, double red, double green, double blue) {
        this.size = size;
        this.color = Color.rgb((int) red * 255, (int) green * 255, (int) blue * 255);
    }

    public TextStyle(double size) {
        this.size = size;
    }

    public TextStyle(double red, double green, double blue) {
        this.color = Color.rgb((int) red * 255, (int) green * 255, (int) blue * 255);
    }

    public TextStyle() {
    }

    public TextView apply(TextView textView) {
        textView.setTextSize((float) size);
        textView.setTextColor(color);
        return textView;
    }
}
