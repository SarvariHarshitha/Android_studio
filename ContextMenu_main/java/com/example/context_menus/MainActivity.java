package com.example.context_menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx1;

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.red)
        {
            tx1.setTextColor(Color.RED);
        }
        if(item.getItemId()==R.id.blue)
        {
            tx1.setTextColor(Color.BLUE);
        }
        if(item.getItemId()==R.id.green)
        {
            tx1.setTextColor(Color.GREEN);
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.mymenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1=findViewById(R.id.t1);
        registerForContextMenu(tx1);



    }
}