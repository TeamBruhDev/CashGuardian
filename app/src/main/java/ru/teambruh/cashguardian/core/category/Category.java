package ru.teambruh.cashguardian.core.category;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import ru.teambruh.cashguardian.MainActivity;
import ru.teambruh.cashguardian.R;
import ru.teambruh.cashguardian.core.id.IDObjectDefault;
import ru.teambruh.cashguardian.core.id.IDObjectsRegistry;

public class Category extends IDObjectDefault {
    public static final IDObjectsRegistry<Category> all = new IDObjectsRegistry<>();
    protected String displayName;
    protected Color color;

    public Category(String id, String displayName, Color color) {
        super(id);
        all.add(this);
        this.displayName = displayName;
        this.color = color;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static void showEditDialog(Context context) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(context);
//        LayoutInflater inflater = context.getLayoutInflater();
//        View dialogView = inflater.inflate(R.layout.edit_category, null);
//        builder.setView(dialogView);
//
//        final EditText editTextName = dialogView.findViewById(R.id.editTextName);
//        final Spinner spinnerColor = dialogView.findViewById(R.id.spinnerColor);
//
////        builder.setTitle("Создать запись")
////                .setPositiveButton("Сохранить", new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////                        String name = editTextName.getText().toString();
////                        String color = spinnerColor.getSelectedItem().toString();
////
////                        // Сохранение или обработка введенных данных
////                        Toast.makeText(MainActivity.this, "Название: " + name + ", Цвет: " + color, Toast.LENGTH_SHORT).show();
////                    }
////                })
////                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
////                    public void onClick(DialogInterface dialog, int which) {
////                        dialog.dismiss();
////                    }
////                });
//
//        AlertDialog dialog = builder.create();
//        dialog.show();
    }
}
