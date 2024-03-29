package ru.teambruh.cashguardian.core.utils;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.Collection;

public final class LinearLayoutUtils {
    public static final int CONTENT = LinearLayout.LayoutParams.WRAP_CONTENT;
    public static final int PARENT = LinearLayout.LayoutParams.MATCH_PARENT;

    public static LinearLayout createVertical(Context context, int width, int height) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        return linearLayout;
    }

    public static LinearLayout createVertical(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        return linearLayout;
    }

    public static LinearLayout createHorizontal(Context context, int width, int height) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        return linearLayout;
    }

    public static LinearLayout createHorizontal(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        return linearLayout;
    }

    public static LinearLayout addElements(LinearLayout linearLayout, Collection<View> elements) {
        elements.forEach(linearLayout::addView);
        return linearLayout;
    }
}
