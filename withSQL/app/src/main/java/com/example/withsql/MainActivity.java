package com.example.withsql;

import androidx.appcompat.app.AlertDialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText erp,mark,name,scode;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        erp=findViewById(R.id.erpin);
        name=findViewById(R.id.namein);
        mark=findViewById(R.id.markin);
        scode=findViewById(R.id.subcodein);
        Button insert=findViewById(R.id.Insert);
        Button view=findViewById(R.id.vieww);
         Button del=findViewById(R.id.del);
        SQLiteDatabase db=openOrCreateDatabase("student", Context.MODE_PRIVATE,null);
        db.execSQL("Create table IF NOT EXISTS stud(eid int ,name varchar(15),mark int,subjectcode varchar(15));");

        insert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("Range")
            @Override
            public void onClick(View view) {
                if(erp.getText().toString().isEmpty() || name.getText().toString().isEmpty() || scode.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Field's can not be empty", Toast.LENGTH_SHORT).show();
                    ClearText();
                }

                String eid=erp.getText().toString();
                String nameS=name.getText().toString();
                String scodeS=scode.getText().toString();
               int numerp=Integer.parseInt(eid);
               int marks=Integer.parseInt(mark.getText().toString());
                db.execSQL("INSERT INTO stud values("+numerp+",'"+nameS+"',"+marks+",'"+scodeS+"');");

                Toast.makeText(MainActivity.this,"Data added", Toast.LENGTH_SHORT).show();
                ClearText();

            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.execSQL("Drop Table stud;");
                Toast.makeText(MainActivity.this, "Table Droped", Toast.LENGTH_SHORT).show();
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c = db.rawQuery("select * from stud;", null);

                StringBuffer buffer = new StringBuffer();
                while (c.moveToNext()) {
                    buffer.append("Enrollment: " + c.getString(0) + "\n");
                    buffer.append("Name: " + c.getString(1) + "\n");
                    buffer.append("scored mark: " + c.getString(2) + "\n");
                    buffer.append("Subject: " + c.getString(3) + "\n\n");
                }
                msgdisplay("Student 2022 Details", buffer.toString());
                c.close();
            }
        });

    }
    public void ClearText(){
        erp.setText("");
        name.setText("");
        mark.setText("");
        scode.setText("");
    }
    public void msgdisplay(String title,String message){
        Builder build=new Builder(this);
        build.setCancelable(true);
        build.setTitle(title);
        build.setMessage(message);
        build.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        build.show();
    }

}