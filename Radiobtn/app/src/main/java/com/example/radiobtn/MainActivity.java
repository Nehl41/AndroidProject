package com.example.radiobtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next=findViewById(R.id.next);
        RadioGroup g1= (RadioGroup) findViewById(R.id.G1);
        RadioButton card=findViewById(R.id.card);
        RadioButton COD=findViewById(R.id.cod);
        RadioButton voucher=findViewById(R.id.voucher);
        RadioButton upi=findViewById(R.id.UPI);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tr=g1.getCheckedRadioButtonId();
                RadioButton rb = findViewById(tr);
                String str=rb.getText().toString();
                Toast.makeText(MainActivity.this, "option "+str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}