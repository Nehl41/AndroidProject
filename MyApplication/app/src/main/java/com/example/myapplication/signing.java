package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing);
        Button b2=findViewById(R.id.button2);
        Button b=findViewById(R.id.button);
        EditText fn=findViewById(R.id.fullname);
        EditText email=findViewById(R.id.signupmail);
        EditText cn=findViewById(R.id.contact);
        EditText pc=findViewById(R.id.passcode);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int flag=0;
                if(email.getText().toString().isEmpty())
                    flag++;
                if ( pc.getText().toString().isEmpty())
                    flag++;
                if(fn.getText().toString().isEmpty())
                    flag++;
                if(flag>0){
                    Toast.makeText(signing.this, "Field can't be empty", Toast.LENGTH_SHORT).show();
                }
                else{
                Toast t=Toast.makeText(getApplicationContext(),"Happy to have you",Toast.LENGTH_SHORT);
                t.show();}
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}