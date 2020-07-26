package com.example.fragementexample.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragementexample.R;

public class HomeFragment extends Fragment {
    private TextView mTextTile;

    public HomeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //  設定布局文件
        //  inflate(int resource, ViewGroup root, boolean attachToRoot)
        //  resource :加載的layout
        //  root    :接fragment的container view
        //  attachToRoot  :view 加載後是否加進去root view
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextTile = (TextView)view.findViewById(R.id.textView);
        mTextTile.setText("This is home page!");
    }
}
