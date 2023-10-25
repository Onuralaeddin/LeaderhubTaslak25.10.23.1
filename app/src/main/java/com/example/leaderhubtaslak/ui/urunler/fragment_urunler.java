package com.example.leaderhubtaslak.ui.urunler;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.leaderhubtaslak.databinding.FragmentReflowBinding;
import com.example.leaderhubtaslak.databinding.FragmentUrunlerBinding;
import com.example.leaderhubtaslak.ui.reflow.ReflowViewModel;

public class fragment_urunler extends Fragment {
    private FragmentUrunlerBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        urunlerViewModel  urunlerViewModel =
                new ViewModelProvider(this).get(urunlerViewModel.class);

        binding = FragmentUrunlerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}