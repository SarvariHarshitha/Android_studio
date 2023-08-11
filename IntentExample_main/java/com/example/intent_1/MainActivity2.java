package com.example.intent_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String imgIndex=bundle.getString("ImageIndex");
            setImage(imgIndex);
        }
    }
    private void setImage(String index){
        ImageView imgView=findViewById(R.id.imageView);

        switch(index){
            case "1":
                imgView.setImageResource(R.drawable.cat);
                break;
            case "2":
                imgView.setImageResource(R.drawable.dog);
                break;
            case "3":
                imgView.setImageResource(R.drawable.alien);
                break;
            case "4":
                imgView.setImageResource(R.drawable.groot);
                break;
            case "5":
                imgView.setImageResource(R.drawable.soul);
                break;
        }
    }
}