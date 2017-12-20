package com.example.admin.acm_v10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.os.*;

public class MainActivity extends AppCompatActivity {

    private ImageView DigitalLibrary;
    int count=0;

    int[] imageArray = { R.drawable.digitallibrary, R.drawable.digital_library};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DigitalLibrary=(ImageView)findViewById(R.id.digital_library);
       // DigitalLibrary.setOnClickListener(ClickLogo);
        handler.postDelayed(runnable, 200);
    }

    View.OnClickListener ClickLogo = new OnClickListener() {

        public void onClick(View v) {
            count=(count+1)%10;
            if(count%2!=0)
                DigitalLibrary.setImageResource(R.drawable.digital_library);
            else
                DigitalLibrary.setImageResource(R.drawable.digitallibrary);
        }
    };

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        int i = 0;

        public void run() {
            DigitalLibrary.setImageResource(imageArray[i]);
            i++;
            if (i > imageArray.length - 1) {
                i = 0;
            }
            handler.postDelayed(this, 2000);

        }
    };







}
