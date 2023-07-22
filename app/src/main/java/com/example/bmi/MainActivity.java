package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editft,editINch,editweight;
        Button btn;
        TextView result;
        LinearLayout llmain;
        llmain=findViewById(R.id.llMain);
        editweight=findViewById(R.id.editweight);
        editft=findViewById(R.id.editFT);
        editINch=findViewById(R.id.editInch);
        btn=findViewById(R.id.btn);
        result=findViewById(R.id.txtresult);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        double weight=Double.parseDouble(editweight.getText().toString());
        int hInFT=Integer.parseInt(editft.getText().toString());
        int hInInch=Integer.parseInt(editINch.getText().toString());
        hInInch+=hInFT*12;
        double totalINcm=hInInch*2.53;
        double totalINm=totalINcm/100;
        double result1=weight/(totalINm*totalINm);
        if (result1>25) {
            result.setText("overweight ");
            result.setTextColor(getResources().getColor(R.color.black));

            llmain.setBackgroundColor(getResources().getColor(R.color.overWt));
        } else if (result1>20) {
            result.setText("Normal ");
            result.setTextColor(getResources().getColor(R.color.black));
        llmain.setBackgroundColor(getResources().getColor(R.color.Normal));
        }else {
            result.setText("underWeight ");
            result.setTextColor(getResources().getColor(R.color.black));

            llmain.setBackgroundColor(getResources().getColor(R.color.underWt));
        }
    }
});


    }
}