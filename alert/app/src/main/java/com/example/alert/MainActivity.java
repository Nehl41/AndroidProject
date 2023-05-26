package com.example.alert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this,tdemo.class);
        Button cm=findViewById(R.id.cm);
        ConstraintLayout cn = findViewById(R.id.bg);
        int color1 = this.getResources().getColor(R.color.color1);
        AlertDialog.Builder ald=new AlertDialog.Builder(MainActivity.this);
        ald.setTitle("Alert");
        ald.setMessage("Do you really want to Quit");
        ald.setCancelable(false);
        ald.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        ald.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "let's Replay", Toast.LENGTH_SHORT).show();
                cn.setBackgroundColor(color1);
            }
        });
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ald.show();
            startActivity(i);
            }

        });
    }
}