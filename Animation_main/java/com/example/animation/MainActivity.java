package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {
    Animation anim1,anim2,anim3,anim4;
    FloatingActionButton fab1,fab2,fab3,fab4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=findViewById(R.id.imageView);
        anim1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
        anim2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        anim3= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        anim4= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        fab1 =findViewById(R.id.fba1);
        fab2 =findViewById(R.id.fba2);
        fab3 =findViewById(R.id.fba3);
        fab4 =findViewById(R.id.fba4);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(anim1);
                Toast.makeText(getApplicationContext(), "fab1", Toast.LENGTH_SHORT).show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(anim2);
                Toast.makeText(getApplicationContext(), "fab2", Toast.LENGTH_SHORT).show();
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(anim3);
                Toast.makeText(getApplicationContext(), "fab3", Toast.LENGTH_SHORT).show();
            }
        });
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.startAnimation(anim4);
                Toast.makeText(getApplicationContext(), "fab4", Toast.LENGTH_SHORT).show();
            }
        });





    }
}