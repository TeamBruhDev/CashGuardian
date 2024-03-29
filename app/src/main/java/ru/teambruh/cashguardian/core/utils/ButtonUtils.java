package ru.teambruh.cashguardian.core.utils;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import ru.teambruh.cashguardian.R;

public final class ButtonUtils {
    public static Button create(Context context, String text) {
        Button button = new Button(context);
        button.setText(text);
        return button;
    }

    public static ImageButton createImage(Context context, int drawableId){
        ImageButton imageButton = new ImageButton(context);
        imageButton.setImageDrawable(context.getResources().getDrawable(drawableId));
        return imageButton;
    }
}
