package com.example.week3app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText widthText;
    private EditText heightText;
    private TextView areaCalc;
    private Button calculatebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        widthText = (EditText) findViewById(R.id.widthText);
        heightText = (EditText) findViewById(R.id.heightText);
        areaCalc = (TextView) findViewById(R.id.areaCalc);
        calculatebutton = (Button) findViewById(R.id.calculateArea);
        calculatebutton.setOnClickListener(this);

    }

    public static int calculateArea(int width, int height){

        int totalArea;

        totalArea = width * height;
        return totalArea;
    }

    @Override
    public void onClick(View v){
        System.out.println("in onClick");
        int userLength = Integer.parseInt(widthText.getText().toString());
        int userheight = Integer.parseInt(heightText.getText().toString());
        int areaCalced = calculateArea( userheight, userLength);
        System.out.println(areaCalced);
        String returnText = Integer.toString(areaCalced);
        areaCalc.setText(returnText);

    }
}
