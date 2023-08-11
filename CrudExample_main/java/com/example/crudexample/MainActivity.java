package com.example.crudexample;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,cname,fee;
    Button binsert,bdisplay,bupdate,bdelete;
    TextView t1;
    DatabaseConnection dbc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextText);
        cname=findViewById(R.id.editTextText2);
        fee=findViewById(R.id.editTextText3);
        binsert=findViewById(R.id.button);
        bdisplay=findViewById(R.id.button2);
        bupdate=findViewById(R.id.button3);
        bdelete=findViewById(R.id.button4);
        t1=findViewById(R.id.textView);
        dbc=new DatabaseConnection(this);
        binsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean res=dbc.insert(name.getText().toString(),cname.getText().toString(),fee.getText().toString());
                if(res==true){
                    Toast.makeText(getApplicationContext(),"Data is inserted", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Data is not inserted", Toast.LENGTH_LONG).show();
                }
            }
        });
        bdisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor=dbc.display();
                if(cursor.getCount()==0){
                    Toast.makeText(getApplicationContext(),"Data is not retrieved", Toast.LENGTH_LONG).show();
                }
                else{
                    StringBuilder stringBuilder=new StringBuilder();
                    while(cursor.moveToNext()){
                        stringBuilder.append("name"+cursor.getString(0)).append("\n");
                        stringBuilder.append("course name"+cursor.getString(1)).append("\n");
                        stringBuilder.append("fee"+cursor.getString(2)).append("\n");

                    }
                    t1.setText(stringBuilder.toString());
                }
            }
        });
        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean res=dbc.delete(name.getText().toString());
                if(res==true){
                    Toast.makeText(getApplicationContext(),"Data is deleted", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Data is not deleted", Toast.LENGTH_LONG).show();
                }
            }
        });
        bupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean res=dbc.update(name.getText().toString());
                if(res==true){
                    Toast.makeText(getApplicationContext(),"Data is updated", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Data is not updated", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}