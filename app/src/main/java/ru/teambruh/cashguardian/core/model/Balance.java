package ru.teambruh.cashguardian.core.model;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import ru.teambruh.cashguardian.R;
import ru.teambruh.cashguardian.core.Displayable;
import ru.teambruh.cashguardian.core.UUIDNameOwner;
import ru.teambruh.cashguardian.core.text.TextStyle;
import ru.teambruh.cashguardian.core.utils.ButtonUtils;
import ru.teambruh.cashguardian.core.utils.LinearLayoutUtils;
import ru.teambruh.cashguardian.core.utils.TextViewUtils;

public class Balance extends UUIDNameOwner implements Displayable {
    protected Currency currency;

    public Balance(String uuid, String name, Currency currency) {
        super(uuid, name);
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public View display(Context context) {
        LinearLayout balanceLayout = LinearLayoutUtils.createHorizontal(context, LinearLayoutUtils.PARENT, LinearLayoutUtils.CONTENT);
        LinearLayout infoLayout = LinearLayoutUtils.createVertical(context, LinearLayoutUtils.CONTENT, LinearLayoutUtils.PARENT);
        LinearLayout controlLayout = LinearLayoutUtils.createHorizontal(context, LinearLayoutUtils.CONTENT, LinearLayoutUtils.PARENT);

        infoLayout.addView(TextViewUtils.create(context, name, TextStyle.defaultStyle));
        infoLayout.addView(TextViewUtils.create(context, context.getResources().getString(R.string.balance_currency, currency.getName()), TextStyle.defaultStyle));

//        controlLayout.addView(ButtonUtils.create(context, context.getResources().getString(R.string.select)));
//        controlLayout.addView(ButtonUtils.create(context, context.getResources().getString(R.string.edit)));
        controlLayout.addView(ButtonUtils.createImage(context, R.drawable.icon_done));
        controlLayout.addView(ButtonUtils.createImage(context, R.drawable.icon_edit));

        balanceLayout.addView(infoLayout);
        balanceLayout.addView(controlLayout);
        return balanceLayout;
    }
}
