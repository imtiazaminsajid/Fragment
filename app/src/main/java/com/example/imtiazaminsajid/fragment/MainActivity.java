package com.example.imtiazaminsajid.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int a=10,b=20,c=30;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bundle = new Bundle();
        bundle.putInt("a", a);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne fragmentOne = new FragmentOne();
        fragmentOne.setArguments(bundle);
        fragmentTransaction.add(R.id.framelayout, fragmentOne);
        fragmentTransaction.commit();
    }

    public void changeFragment(View view) {
        switch (view.getId()){
            case R.id.fragmentOne:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentOne fragmentOne = new FragmentOne();
                bundle.putInt("a",a);
                fragmentOne.setArguments(bundle);
                fragmentTransaction.replace(R.id.framelayout, fragmentOne);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.fragmentTwo:
                FragmentManager fragmentManagerTwo = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionTwo = fragmentManagerTwo.beginTransaction();
                FragmentTwo fragmentTwo = new FragmentTwo();
                bundle.putInt("b",b);
                fragmentTwo.setArguments(bundle);
                fragmentTransactionTwo.replace(R.id.framelayout, fragmentTwo);
                fragmentTransactionTwo.addToBackStack(null);
                fragmentTransactionTwo.commit();
                break;

            case R.id.fragmentThree:
                FragmentManager fragmentManagerThree = getSupportFragmentManager();
                FragmentTransaction fragmentTransactionThree = fragmentManagerThree.beginTransaction();
                FragmentThree fragmentThree= new FragmentThree();
                bundle.putInt("c",c);
                fragmentThree.setArguments(bundle);
                fragmentTransactionThree.replace(R.id.framelayout, fragmentThree);
                fragmentTransactionThree.addToBackStack(null);
                fragmentTransactionThree.commit();
                break;
        }
    }
}
