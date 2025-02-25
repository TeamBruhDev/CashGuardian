package ru.teambruh.cashguardian.ui.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import ru.teambruh.cashguardian.MainActivity;
import ru.teambruh.cashguardian.R;
import ru.teambruh.cashguardian.databinding.CategoriesFragmentBinding;
import ru.teambruh.cashguardian.databinding.TransactionsFragmentBinding;
import ru.teambruh.cashguardian.ui.activities.EditCategoryActivity;

public class CategoriesFragment extends Fragment {
    private CategoriesFragmentBinding binding;

    @SuppressLint("ResourceType")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = CategoriesFragmentBinding.inflate(inflater, container, false);

        binding.addCategory.setOnClickListener(v -> {
            Intent myIntent = new Intent(getActivity(), EditCategoryActivity.class);
            getActivity().startActivity(myIntent);
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
