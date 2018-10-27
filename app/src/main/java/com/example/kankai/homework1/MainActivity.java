package com.example.kankai.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kankai.homework1.model.Body;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ctof_button = findViewById(R.id.ctof_button);
        ctof_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input_edt = findViewById(R.id.input_edittext);
                double input = Integer.parseInt(input_edt.getText().toString());

                Body body = new Body(input);
                double output = body.cal_ctof();
                String out = String.format(Locale.US,"%.2f",output);
                TextView output_textview = (TextView)findViewById(R.id.output_textview);
                output_textview.setText(out);
            }
        });


        final Button ftoc_button = findViewById(R.id.ftoc_button);
        ftoc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input_edt = findViewById(R.id.input_edittext);
                double input = Integer.parseInt(input_edt.getText().toString());

                Body body = new Body(input);
                double output = body.cal_ftoc();
                String out = String.format(Locale.US,"%.2f",output);
                TextView output_textview = (TextView)findViewById(R.id.output_textview);
                output_textview.setText(out);
            }
        });
    }
}
