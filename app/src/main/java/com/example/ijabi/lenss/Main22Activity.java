package com.example.ijabi.lenss;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity
{
    //ImageView imgsrc;
    //TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);




        /*tv = (TextView)findViewById(R.id.tv22);
        //imgsrc = (ImageView)findViewById(R.id.imge);

        //String grabImagePath = getIntent().getStringExtra("src");
        int grabImagePath = Integer.parseInt(getIntent().getExtras().toString());
        if(grabImagePath==1)
        {
            //imgsrc.setImageResource(R.drawable.f2pp);
            tv.setText("1");
        }

        else if(grabImagePath==2)
        {
            //imgsrc.setImageResource(R.drawable.bf2f);
            tv.setText("2");
        }
        else if(grabImagePath==3)
        {
            //imgsrc.setImageResource(R.drawable.f);
            tv.setText("3");
        }
        else if(grabImagePath==4)
        {
            //imgsrc.setImageResource(R.drawable.f2);
            tv.setText("4");
        }
        else if(grabImagePath==5)
        {
            //imgsrc.setImageResource(R.drawable.images);
            tv.setText("5");
        }*/
       /*
        imgsrc.setImageBitmap(BitmapFactory.decodeFile(grabImagePath));*/
    }
}
