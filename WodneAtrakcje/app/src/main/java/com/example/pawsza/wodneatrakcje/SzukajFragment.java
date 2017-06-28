package com.example.pawsza.wodneatrakcje;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.R.attr.fragment;

//import android.support.v4.app.Fragment;

/**
 * Created by pawsza on 26.06.17.
 */

public class SzukajFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.szukaj, container, false);
        }

public class Szukaj extends Activity implements View.OnClickListener{

       Button szukaj;
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.szukaj);
        szukaj.setOnClickListener(this);
        initialize();

    }

    private void initialize() {
        szukaj = (Button) findViewById(R.id.bSearch);
    }

    @Override
    public void onClick(View arq0) {

    //     if (id == R.id.nav_mapa) {
     //       fragment = new MapFragment();
        switch (arq0.getId()) {
            case R.id.bSearch:
                Fragment fragment = new ListaPlywalniFragment();
                getFragmentManager().beginTransaction().replace(R.id.my_content_frame, fragment).commit();
              //  Intent i = new Intent("com.example.pawsza.wodneatrakcje.ListaPlywalniFragment");
              //  startActivity(i);
                break;
        }


    }
}
}