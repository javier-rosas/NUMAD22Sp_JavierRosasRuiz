package com.example.numad22sp_javierrosasruiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "MainActivity";
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                System.out.print("It Worked!");

                Toast.makeText(MainActivity.this, "             Javier \n rosasruiz.j@northeastern.edu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}