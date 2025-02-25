package ru.teambruh.cashguardian.ui.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.teambruh.cashguardian.MainActivity;
import ru.teambruh.cashguardian.R;
import ru.teambruh.cashguardian.databinding.EditCategoryActivityBinding;

public class EditCategoryActivity extends AppCompatActivity {
    public EditCategoryActivityBinding binding;
    public static MainActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = EditCategoryActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
