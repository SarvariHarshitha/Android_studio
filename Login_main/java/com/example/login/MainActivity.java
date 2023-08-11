package com.example.login;
import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.view.View; import android.widget.Button; import android.widget.EditText; import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity { @Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    final EditText e1 =(EditText)findViewById(R.id.et1); final EditText e2 =(EditText)findViewById(R.id.et2); Button b1=(Button)findViewById(R.id.b1);
    b1.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            String regex1="^[a-zA-Z0-9._-]{3,}$";
            Pattern p1 = Pattern.compile(regex1);
            Matcher m1 = p1.matcher(e1.getText().toString());
            boolean res1=m1.matches();
            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(e2.getText().toString());
            boolean res=m.matches();
            if(res && res1){
                Toast.makeText(getApplicationContext(),"Login Successful"
                    ,Toast.LENGTH_SHORT).show();}
            else if(!res && res1)
            { Toast.makeText(getApplicationContext(),"Password should be of valid format",Toast.LENGTH_SHORT).show();
            }
            else if(!res){
            Toast.makeText(getApplicationContext(),"Username Should contain only numbers and Alphabets",Toast.LENGTH_SHORT).show();
             }
        }
    });
}
}
