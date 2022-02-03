package com.example.numad22sp_javierrosasruiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Buttons extends AppCompatActivity implements View.OnClickListener
{
    private static final String TAG = "Buttons";

    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    Button f;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonscreen);

        a = findViewById(R.id.buttonA);
        b = findViewById(R.id.buttonB);
        c = findViewById(R.id.buttonC);
        d = findViewById(R.id.buttonD);
        e = findViewById(R.id.buttonE);
        f = findViewById(R.id.buttonF);

        a.setOnClickListener(Buttons.this);
        b.setOnClickListener(Buttons.this);
        c.setOnClickListener(Buttons.this);
        d.setOnClickListener(Buttons.this);
        e.setOnClickListener(Buttons.this);
        f.setOnClickListener(Buttons.this);


        /*
        a.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

            }
        });
         */


    }

    @Override
    public void onClick(View view)
    {
        TextView pressedText = findViewById(R.id.pressed);


        switch (view.getId()) {
            case R.id.buttonA:

                Button buttonA = findViewById(R.id.buttonA);
                String buttonTextA = buttonA.getText().toString();
                pressedText.setText("Pressed: " + buttonTextA);

                break;
            case R.id.buttonB:

                Button buttonB = findViewById(R.id.buttonB);
                String buttonTextB = buttonB.getText().toString();
                pressedText.setText("Pressed: " + buttonTextB);

                break;
            case R.id.buttonC:

                Button buttonC = findViewById(R.id.buttonC);
                String buttonTextC = buttonC.getText().toString();
                pressedText.setText("Pressed: " + buttonTextC);

                break;
            case R.id.buttonD:

                Button buttonD = findViewById(R.id.buttonD);
                String buttonTextD = buttonD.getText().toString();
                pressedText.setText("Pressed: " + buttonTextD);

                break;

            case R.id.buttonE:

                Button buttonE = findViewById(R.id.buttonE);
                String buttonTextE = buttonE.getText().toString();
                pressedText.setText("Pressed: " + buttonTextE);

                break;
            case R.id.buttonF:
                Button buttonF = findViewById(R.id.buttonF);
                String buttonTextF = buttonF.getText().toString();
                pressedText.setText("Pressed: " + buttonTextF);
                break;

        }


    }




}
