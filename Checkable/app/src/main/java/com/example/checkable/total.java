package com.example.checkable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class total extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        Button back=findViewById(R.id.back);
        Button done=findViewById(R.id.done);
        Intent ii=getIntent();
        int sum=ii.getExtras().getInt("sum");
        TextView display=findViewById(R.id.display);
        display.setText("Your Total is: "+sum);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t1=Toast.makeText(getApplicationContext(),"Order Submitted",Toast.LENGTH_SHORT);
                t1.show();
            }
        });
    }
}