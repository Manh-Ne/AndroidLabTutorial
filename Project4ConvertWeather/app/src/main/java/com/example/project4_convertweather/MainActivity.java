package com.example.project4_convertweather;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtdoC, edtdoF;
    Button btncf, btnfc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtdoC = findViewById(R.id.txtCel);
        edtdoF = findViewById(R.id.txtFar);
        btncf = findViewById(R.id.btnCel);
        btnfc = findViewById(R.id.btnFar);
        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doC = edtdoC.getText()+"";
                int C = Integer.parseInt(doC);
                edtdoF.setText(""+dcf.format(C*1.8+32));
            }
        });
        btnfc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doF = edtdoF.getText()+"";
                int F = Integer.parseInt(doF);
                edtdoC.setText(""+dcf.format((F-32)/1.8));
            }
        });
    }
}