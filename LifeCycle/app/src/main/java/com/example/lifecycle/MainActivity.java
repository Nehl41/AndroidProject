package com.example.lifecycle;
import static android.R.color.black;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        ToggleButton tb=(ToggleButton) findViewById(R.id.tb1);
        TextView tv =(TextView) findViewById(R.id.seekheading);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(tb.isChecked()){
                    tv.setText("Toggle button is ON");
                }
                else if(!tb.isChecked()){
                    tv.setText("Toggle button is off");
                }
                else{
                    tv.setText("Seek_Bar");
                }
            }
        });
 }
}
