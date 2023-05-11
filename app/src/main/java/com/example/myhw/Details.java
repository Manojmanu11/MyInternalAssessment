package com.example.myhw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myhw.R.id;

public class Details extends AppCompatActivity {

    ImageView img;
    TextView tv1,tv2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        img=(ImageView)findViewById(R.id.imgView);
        tv1=(TextView) findViewById(R.id.textView);
        tv2=(TextView) findViewById(id.textView2);
        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("name"));
        tv2.setText(getIntent().getStringExtra("description"));
    }
}