 package com.ekiert.dziamdziara.swimmingpool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;




public class Splash extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openStartingPoint = new Intent("com.ekiert.dziamdziara.swimmingpool.ACTIVITY");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
