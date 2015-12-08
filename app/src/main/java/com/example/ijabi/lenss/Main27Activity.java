package com.example.ijabi.lenss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main27Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);
    }
    public void cf2pp(View view)
    {
        Intent intent = new Intent(this, Main28Activity.class);
        //src = "@drawable/f2pp";
        /*int src;
        src = 1;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }

    public void cf2(View view)
    {
        Intent intent = new Intent(this, Main29Activity.class);
        //src = "@drawable/f2";
        /*int src;
        src=4;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }


    public void cbf2f(View view)
    {
        Intent intent = new Intent(this, Main210Activity.class);
        //src = "@drawable/bf2f";
       /* int src;
        src=2;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }

    public void cf(View view)
    {
        Intent intent = new Intent(this, Main211Activity.class);
        //src = "@drawable/f";
        /*int src;
        src = 3;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }

    public void clf(View view)
    {
        Intent intent = new Intent(this, Main212Activity.class);
        //src = "@drawable/images";
       /* int src;
        src=5;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }
}