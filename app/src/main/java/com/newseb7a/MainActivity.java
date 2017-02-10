package com.newseb7a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    TextView txt;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inc(View view) {
        txt = (TextView)findViewById(R.id.txt);
        count = count + 1;
        String countS = Integer.toString(count);
        txt.setText(countS);
        if(countS.equals("10")) {
            btn = (Button) findViewById(R.id.btn);
            btn.setBackgroundResource(R.drawable.nn);
        }

    }
}
