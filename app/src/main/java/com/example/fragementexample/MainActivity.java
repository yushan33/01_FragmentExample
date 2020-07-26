package com.example.fragementexample;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.example.fragementexample.fragement.FourFragment;
import com.example.fragementexample.fragement.HomeFragment;
import com.example.fragementexample.fragement.ThreeFragment;
import com.example.fragementexample.fragement.TwoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {
    private FragmentManager mFragmentManager;
    private HomeFragment mHomeFragment;
    private TwoFragment mTwoFragment;
    private ThreeFragment mthreeFragment;
    private FourFragment mfourthFragment;

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = (BottomNavigationView)findViewById(R.id.navigation);

        //實例化Fragment
        mFragmentManager = getSupportFragmentManager();
        mHomeFragment = new HomeFragment();
        mTwoFragment  = new TwoFragment();
        mthreeFragment = new ThreeFragment();
        mfourthFragment = new FourFragment();

        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fl_container,mHomeFragment).commit();//一開始先放哪一個頁面，一定要下commit

        navigationView.getMenu().setGroupCheckable(0, false, false);//取消預設動畫
        navigationView.setOnNavigationItemSelectedListener(this);//設定監聽事件

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                fragmentTransaction.replace(R.id.fl_container,mHomeFragment).commit();//一開始先放哪一個頁面，一定要下commit
                break;
            case R.id.navigation_page_two:
                fragmentTransaction.replace(R.id.fl_container,mTwoFragment).commit();
                break;
            case R.id.navigation_page_three:
                fragmentTransaction.replace(R.id.fl_container,mthreeFragment).commit();
                break;
            case R.id.navigation_page_fourth:
                fragmentTransaction.replace(R.id.fl_container,mfourthFragment).commit();
                break;

        }
        return true;
    }
}