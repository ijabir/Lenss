package com.example.ijabi.lenss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.hl);
    }

    public void cc(View view)
    {
        //tv.setText("OKAY");
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void cv(View view)
    {
        Intent intent = new Intent(MainActivity.this,Main27Activity.class);
        startActivity(intent);
    }
}
