package com.example.myhw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username =  findViewById(R.id.username);
        EditText password =  findViewById(R.id.password);
        loginbutton =  findViewById(R.id.btnlogin);


            loginbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (username.getText().toString().equals("abcdefghi") && password.getText().toString().equals("abcdefghi")) {
                        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                        startActivity(intent);

                    }
                    else{
                        Toast.makeText(getApplicationContext(),"wrong credentials",Toast.LENGTH_SHORT).show();
                        loginbutton.setEnabled(false);
                    }
                }
            });
        }
    }

