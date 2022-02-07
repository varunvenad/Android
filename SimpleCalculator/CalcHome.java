package com.pr.ksb.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcHome extends AppCompatActivity {

    EditText e1,e2;
    Button add,sub,mul,div,clear;
    TextView t1;
    Float n1,n2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_home);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);

        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        clear=(Button)findViewById(R.id.clear);

        t1=(TextView)findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(e1.getText().toString().trim());
                n2=Float.parseFloat(e2.getText().toString().trim());
                res=n1+n2;
                t1.setText(String.valueOf(res));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(e1.getText().toString().trim());
                n2=Float.parseFloat(e2.getText().toString().trim());
                res=n1-n2;
                t1.setText(String.valueOf(res));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(e1.getText().toString().trim());
                n2=Float.parseFloat(e2.getText().toString().trim());
                res=n1*n2;
                t1.setText(String.valueOf(res));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Float.parseFloat(e1.getText().toString().trim());
                n2=Float.parseFloat(e2.getText().toString().trim());
                res=n1/n2;
                t1.setText(String.valueOf(res));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                t1.setText("0.00");


            }
        });

    }
}
