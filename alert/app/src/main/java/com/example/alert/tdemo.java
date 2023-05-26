package com.example.alert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class tdemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdemo);
            ImageButton ibtn=findViewById(R.id.ibtn);
            ibtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            Toast.makeText(tdemo.this, "Hello Buddy !!", Toast.LENGTH_SHORT).show();
                    }
            });
    }
}