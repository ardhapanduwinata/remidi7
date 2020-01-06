package com.example.remidi7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class ListMenuActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_menu);

        btn1 = findViewById(R.id.menu1);
        btn2 = findViewById(R.id.menu2);
        btn3 = findViewById(R.id.menu3);
        btn4 = findViewById(R.id.menu4);
        btn5 = findViewById(R.id.menu5);
        btn6 = findViewById(R.id.menu6);
        btn7 = findViewById(R.id.menu7);
        btn8 = findViewById(R.id.menu8);
        btn9 = findViewById(R.id.menu9);
        imageView = findViewById(R.id.imageView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"1", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar1);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"2", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar2);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"3", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar3);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"4", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar4);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"5", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar5);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"6", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar1);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"7", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar2);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"8", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar3);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"9", Toast.LENGTH_LONG);

                Resources res = getResources();
                Bitmap src = BitmapFactory.decodeResource(res, R.drawable.img_avatar4);

                RoundedBitmapDrawable dr = RoundedBitmapDrawableFactory.create(res, src);
                dr.setCornerRadius(1000);
                imageView.setImageDrawable(dr);
            }
        });
    }


}
