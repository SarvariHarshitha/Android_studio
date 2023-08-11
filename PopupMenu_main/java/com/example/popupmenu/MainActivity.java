package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(MainActivity.this,view);
                popupMenu.inflate(R.menu.menu);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId()==R.id.red)
                        {
                            t1.setTextColor(Color.RED);
                        }
                        if(item.getItemId()==R.id.blue)
                        {
                            t1.setTextColor(Color.BLUE);
                        }
                        if(item.getItemId()==R.id.green)
                        {
                            t1.setTextColor(Color.GREEN);
                        }

                        return true;
                    }
                });
            }
        });
    }
}