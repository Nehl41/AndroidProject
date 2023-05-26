package com.example.checkable;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    CheckBox f1,f2,f3,f4,f5,f6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this,total.class);
        Button bill=findViewById(R.id.total);
        Button clear=findViewById(R.id.clr);
        f1 = findViewById(R.id.f1);TextView c1=findViewById(R.id.c1);
        f2 = findViewById(R.id.f2);TextView c2=findViewById(R.id.c2);
        f3 = findViewById(R.id.f3);TextView c3=findViewById(R.id.c3);
        f4 = findViewById(R.id.f4);TextView c4=findViewById(R.id.c4);
        f5 = findViewById(R.id.f5);TextView c5=findViewById(R.id.c5);
        f6 = findViewById(R.id.f6);TextView c6=findViewById(R.id.c6);
        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int total=0,j=0;
                TextView tw[] = {c1,c2,c3,c4,c5,c6};
                for (CheckBox cb: Arrays.asList(f1,f2,f3,f4,f5,f6)) {
                    if (cb.isChecked()) {
                        total += Integer.parseInt(tw[j].getText().toString());
                    }
                    j++;

                }
                i.putExtra("sum",total);
//                Toast.makeText(MainActivity.this, "Your Total is: "+total, Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1.setChecked(false);
                f2.setChecked(false);
                f3.setChecked(false);
                f4.setChecked(false);
                f5.setChecked(false);
                f6.setChecked(false);
            }
        });
    }
}