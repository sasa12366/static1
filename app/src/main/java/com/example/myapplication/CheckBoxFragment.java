package com.example.myapplication;

/**
 * Created by Компьютер on 16.05.2017.
 */

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CheckBoxFragment extends Fragment {

    @Override
    // Переопределяем метод onCreateView
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.checkbox_fragment, container, false);
        return view;
    }
}