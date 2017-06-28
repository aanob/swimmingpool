package com.example.pawsza.wodneatrakcje;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by pawsza on 28.06.17.
 */
public class ListaPlywalniFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lista_plywalni, container, false);
    }

    public class ListaPlywalni extends Activity implements View.OnClickListener {

        Button plywalnia1, plywalnia2, plywalnia3;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.lista_plywalni);
            initialize();
        }

        private void initialize() {
            plywalnia1 = (Button) findViewById(R.id.bPlywalnia1);
            plywalnia2 = (Button) findViewById(R.id.bPlywalnia2);
            plywalnia3 = (Button) findViewById(R.id.bPlywalnia3);
        }

        @Override
        public void onClick(View arq0) {
            switch (arq0.getId()) {
                case R.id.bPlywalnia1:
                    break;
                case R.id.bPlywalnia2:
                    break;
                case R.id.bPlywalnia3:
                    break;
            }

        }
    }
}
