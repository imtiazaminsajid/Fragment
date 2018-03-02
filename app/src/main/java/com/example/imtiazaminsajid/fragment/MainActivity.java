package com.example.imtiazaminsajid.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne fragmentOne = new FragmentOne();
        fragmentTransaction.add(R.id.framelayout, fragmentOne);
        fragmentTransaction.commit();
    }

    public void changeFragment(View view) {
        switch (view.getId()){
            case R.id.fragmentOne:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentOne fragmentOne = new FragmentOne();
                fragmentTransaction.replace(R.id.framelayout, fragmentOne);
                fragmentTransaction.commit();
                break;
            case R.id.fragmentTwo:
                FragmentManager fragmentManagerTwo = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionTwo = fragmentManagerTwo.beginTransaction();
                FragmentTwo fragmentTwo = new FragmentTwo();
                fragmentTransactionTwo.replace(R.id.framelayout, fragmentTwo);
                fragmentTransactionTwo.commit();
                break;

            case R.id.fragmentThree:
                FragmentManager fragmentManagerThree = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionThree = fragmentManagerThree.beginTransaction();
                FragmentThree fragmentThree= new FragmentThree();
                fragmentTransactionThree.replace(R.id.framelayout, fragmentThree);
                fragmentTransactionThree.commit();
                break;
        }
    }
}
