package com.example.temperatureconverter;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText input,output;
    Button CF,FC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.e1);
        output=findViewById(R.id.e2);
        CF=findViewById(R.id.cf);
        FC=findViewById(R.id.fc);
        FC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int f=Integer.parseInt(input.getText().toString());
                float c=(f-32f)*(5f/9f);
                output.setText(String.valueOf(c));
            }
        });
        CF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c=Integer.parseInt(input.getText().toString());
                float f=(c*9f/5f)+32f;
                output.setText(String.valueOf(f));
            }
        });

    }
}

