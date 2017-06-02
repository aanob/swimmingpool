package com.ekiert.dziamdziara.swimmingpool;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Dziamdziara on 2017-05-15.
 */
public class Search2 extends Activity implements View.OnClickListener {
    Button search;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
    }

    protected void initialize() {
        search = (Button) findViewById(R.id.bSearch);
        search.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.bSearch:
                Intent i = new Intent(Search2.this, Window.class);
                startActivity(i);
                break;
        }
    }
}

