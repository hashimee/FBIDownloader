package com.example.hashimee.fbloginsample;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment frag = new MainFragment();
        android.app.FragmentManager manager = this.getFragmentManager();
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment,frag,"vivz");
        transaction.commit();
    }
}
