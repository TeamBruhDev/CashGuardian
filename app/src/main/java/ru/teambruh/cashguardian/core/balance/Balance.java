package ru.teambruh.cashguardian.core.balance;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintSet;

import java.util.ArrayList;

import ru.teambruh.cashguardian.R;
import ru.teambruh.cashguardian.core.Displayable;
import ru.teambruh.cashguardian.core.text.TextStyle;
import ru.teambruh.cashguardian.core.utils.ButtonUtils;
import ru.teambruh.cashguardian.core.utils.LinearLayoutUtils;
import ru.teambruh.cashguardian.core.utils.TextViewUtils;

public class Balance implements Displayable {
    public String uuid;
    public String name;
    public String currency;

    public Balance(String uuid, String name, String currency) {
        this.uuid = uuid;
        this.name = name;
        this.currency = currency;
    }

    @Override
    public View display(Context context) {
        LinearLayout balanceLayout = LinearLayoutUtils.createHorizontal(context, LinearLayoutUtils.PARENT, LinearLayoutUtils.CONTENT);
        LinearLayout infoLayout = LinearLayoutUtils.createVertical(context, LinearLayoutUtils.CONTENT, LinearLayoutUtils.PARENT);
        LinearLayout controlLayout = LinearLayoutUtils.createHorizontal(context, LinearLayoutUtils.CONTENT, LinearLayoutUtils.PARENT);

        infoLayout.addView(TextViewUtils.create(context, name, TextStyle.defaultStyle));
        infoLayout.addView(TextViewUtils.create(context, context.getResources().getString(R.string.balance_currency, currency), TextStyle.defaultStyle));

//        controlLayout.addView(ButtonUtils.create(context, context.getResources().getString(R.string.select)));
//        controlLayout.addView(ButtonUtils.create(context, context.getResources().getString(R.string.edit)));
        controlLayout.addView(ButtonUtils.createImage(context, R.drawable.icon_done));
        controlLayout.addView(ButtonUtils.createImage(context, R.drawable.icon_edit));

        balanceLayout.addView(infoLayout);
        balanceLayout.addView(controlLayout);
        return balanceLayout;
    }
}
