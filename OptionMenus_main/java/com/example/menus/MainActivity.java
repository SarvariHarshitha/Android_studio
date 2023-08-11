package com.example.menus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.mymenu,menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.call){
            Toast.makeText(getApplicationContext(),"call is clicked",Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.status){
            Toast.makeText(getApplicationContext(),"status is clicked",Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==R.id.chat){
            Toast.makeText(getApplicationContext(),"chat is clicked",Toast.LENGTH_LONG).show();
        }




        return super.onOptionsItemSelected(item);
    }





}