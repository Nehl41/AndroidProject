package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this,submitted.class);
        Intent ii=new Intent(this,signing.class);
        Button submit=findViewById(R.id.next);
        Button signup=findViewById(R.id.signUp);
        EditText em=findViewById(R.id.em);
        EditText pass=findViewById(R.id.pass);
        submit.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
              int flag=0;
              if(em.getText().toString().isEmpty())
                  flag++;
              if ( pass.getText().toString().isEmpty())
                  flag++;

             if(flag==2){
                 Toast.makeText(MainActivity.this, "Text_Field's are empty", Toast.LENGTH_SHORT).show();
              }
             else if(flag==1){
                 Toast.makeText(MainActivity.this, "one Text_Field are empty", Toast.LENGTH_SHORT).show();
              }
              else {
                 startActivity(i);
             }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ii);
            }
        });
    }
}