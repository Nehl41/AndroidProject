package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch sw=findViewById(R.id.switch1);
        int color1 = this.getResources().getColor(R.color.color1);
        int color2 = this.getResources().getColor(R.color.color2);
        ConstraintLayout c=findViewById(R.id.c);
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw.isChecked())
                    c.setBackgroundColor(color1);
                else if(!sw.isChecked()){
                    c.setBackgroundColor(color2);
                }
            }
        });
    }
}