package com.pr.ksb.exp4registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fNmame,lName,password;
    Button submit;
    RadioGroup genderRgroup;
    RadioButton male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(validate())
                {
                    Toast.makeText(getApplicationContext(),"All data is valid",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Some data is invalid",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void initUI()
    {
        fNmame=findViewById(R.id.editText);
        lName=findViewById(R.id.editText2);
        male=findViewById(R.id.radio_male);
        female=findViewById(R.id.radio_female);
        submit=findViewById(R.id.btn_submit);
        genderRgroup=findViewById(R.id.radioGroup);
        password=findViewById(R.id.editTextTextPassword);

    }
    private boolean validate()
    {
        boolean isValid=false;

        String firstName=fNmame.getText().toString();
        String lastName=lName.getText().toString();
        String pwd=password.getText().toString();



        if(firstName.equals(""))
        {
            Toast.makeText(this,"FirstName is empty",Toast.LENGTH_SHORT).show();
        }
        else if(lastName.isEmpty())
        {
            Toast.makeText(this,"Last name is empty",Toast.LENGTH_SHORT).show();
        }
        else if(!male.isChecked()&&!female.isChecked())
        {
            Toast.makeText(this,"Please choose gender",Toast.LENGTH_SHORT).show();
        }
        else if(pwd.length()<3)
        {
            Toast.makeText(this,"Password should have at least 3 letters",Toast.LENGTH_SHORT).show();
        }

        else
        {
            isValid=true;
        }

        return isValid;

    }
}
