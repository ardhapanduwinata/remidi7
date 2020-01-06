package com.example.remidi7;

import androidx.appcompat.app.AppCompatActivity;

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
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"2", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"3", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"4", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"5", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"6", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"7", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"8", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"9", Toast.LENGTH_LONG);
                Picasso.with(getApplicationContext()).load(R.drawable.ic_launcher_background).into(imageView);
            }
        });
    }


}
