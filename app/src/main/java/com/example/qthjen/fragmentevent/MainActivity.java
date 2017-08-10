package com.example.qthjen.fragmentevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMA;
    Button btMA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMA = (TextView) findViewById(R.id.tvMA);
        btMA = (Button) findViewById(R.id.btMA);

        btMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /** Cách 1: code sẽ dồn hết về MainActivity.class **/
             //   FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fmA);
             //   fragmentA.tvFmA.setText("Change by Activity");

                /** Cách 2: **/
                FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fmA);
                fragmentA.GanNoiDung("Change by Activity");
            }
        });

    }
}
