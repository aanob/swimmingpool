package com.ekiert.dziamdziara.swimmingpool;

import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Dziamdziara on 2017-05-17.
 */
public class Window extends Activity {
    Button example;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.window);
        initialize();
    }

    private void initialize() {
        example = (Button) findViewById(R.id.bExample);
    }


}


