package ru.teambruh.cashguardian.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ru.teambruh.cashguardian.core.model.Balance;
import ru.teambruh.cashguardian.core.model.Currency;
import ru.teambruh.cashguardian.databinding.BalancesFragmentBinding;

public class BalancesFragment extends Fragment {
    private BalancesFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = BalancesFragmentBinding.inflate(inflater, container, false);
        for (int i = 10; i < 20; i++) {
            binding.balancesContainer.addView(new Balance("", "Тестовый баланс #" + i, new Currency("", "₽", 0)).display(getContext()));
        }
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
