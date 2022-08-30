package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    TextView textView,textview2,textview3,textview4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        textView=findViewById(R.id.tv1);
        textview2=findViewById(R.id.tv2);
        textview3=findViewById(R.id.tv3);
        textview4=findViewById(R.id.tv4);
        edittext=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valueinKilo=edittext.getText().toString();
                double kilo=Double.parseDouble(valueinKilo);
                double pound=kilo*2.205;
                textview4.setText(""+ pound);

            }
        });
    }
}