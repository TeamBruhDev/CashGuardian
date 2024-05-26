package ru.teambruh.cashguardian.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ru.teambruh.cashguardian.R;
import ru.teambruh.cashguardian.core.key.Key;
import ru.teambruh.cashguardian.databinding.MiscellaneousFragmentBinding;

public class MiscellaneousFragment extends Fragment {
    private MiscellaneousFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = MiscellaneousFragmentBinding.inflate(inflater, container, false);

        updateAuth();
        binding.checkKey.setOnClickListener(view -> {
            Key.setKey(binding.authKeyInput.getText().toString());
            updateAuth();
        });
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void updateAuth() {
        if (Key.isNull()) {
            binding.keyStateText.setText(this.getResources().getString(R.string.you_are_not_authorized));
            binding.keyStateText.setTextColor(getResources().getColor(R.color.soft_red));
        } else if (Key.isAuthorized()) {
            binding.keyStateText.setText(this.getResources().getString(R.string.you_are_authorized));
            binding.keyStateText.setTextColor(getResources().getColor(R.color.soft_green));
        } else {
            binding.keyStateText.setText(this.getResources().getString(R.string.wrong_key));
            binding.keyStateText.setTextColor(getResources().getColor(R.color.soft_red));
        }
    }
}
