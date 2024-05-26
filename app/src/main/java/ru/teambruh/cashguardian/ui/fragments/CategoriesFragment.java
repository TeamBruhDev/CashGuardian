package ru.teambruh.cashguardian.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ru.teambruh.cashguardian.databinding.CategoriesFragmentBinding;
import ru.teambruh.cashguardian.databinding.TransactionsFragmentBinding;

public class CategoriesFragment extends Fragment {
    private CategoriesFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = CategoriesFragmentBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
