package com.example.practice_hellowolrd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView num0, num1, num2, num3, num4, num5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);

    }

    public void lottery(View view) {
        HashSet<Integer> set = new HashSet<>();
        while(set.size() < 6){
            set.add((int)(Math.random()*49+1));
        }
        int cnt = 0 ;
        int[] lottery = new int[6];
        for(Integer num : set){
            lottery[cnt] = num;
            cnt++;
        }

        num0.setText("" + lottery[0]);
        num1.setText("" + lottery[1]);
        num2.setText("" + lottery[2]);
        num3.setText("" + lottery[3]);
        num4.setText("" + lottery[4]);
        num5.setText("" + lottery[5]);

    }
}