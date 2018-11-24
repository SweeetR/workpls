package com.example.roy.workpls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd = new Random();
    Button btn1;
    ImageView iv1;
    int i;
    int img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        iv1=(ImageView) findViewById(R.id.iv1);
        img1=R.drawable.arrow;
        img2=R.drawable.beach;
        img3=R.drawable.dyingstar;

    }

    public void clickeffect(View view) {
        i=rnd.nextInt(3)+1;

        btn1.setText(""+i);

        if(i==1)
            iv1.setImageResource(img1);
        else{
            if(i==2)
                iv1.setImageResource(img2);
            else
                iv1.setImageResource(img3);
        }

    }
}
