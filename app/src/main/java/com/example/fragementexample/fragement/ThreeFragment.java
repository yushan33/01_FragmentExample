package com.example.fragementexample.fragement;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.fragementexample.R;

public class ThreeFragment extends Fragment {
    private TextView mTextTitle;

    public ThreeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_threefragment, container, false);
        mTextTitle = (TextView) root.findViewById(R.id.textView);
        return root;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextTitle.setText("Three Fragment");
    }
}
