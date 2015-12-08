package com.example.ijabi.lenss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void f2pp(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main22Activity.class);
        //src = "@drawable/f2pp";
        /*int src;
        src = 1;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }

    public void f2(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main23Activity.class);
        //src = "@drawable/f2";
        /*int src;
        src=4;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }


    public void bf2f(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main24Activity.class);
        //src = "@drawable/bf2f";
       /* int src;
        src=2;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }

    public void f(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main25Activity.class);
        //src = "@drawable/f";
        /*int src;
        src = 3;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }

    public void lf(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main26Activity.class);
        //src = "@drawable/images";
       /* int src;
        src=5;
        intent.putExtra("src", src);*/
        startActivity(intent);
    }
}