package com.krishna.asciieducation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonDemo extends AppCompatActivity {

    Button submit;
    EditText f_name,m_name,l_name;
    TextView tx1,tx2,tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_demo);

        f_name=findViewById(R.id.fname);
        tx1 = findViewById(R.id.firstTextView);
        tx2 = findViewById(R.id.middleTextView);
        tx3 = findViewById(R.id.lastTextView);
        m_name = findViewById(R.id.mname);
        l_name = findViewById(R.id.lname);
        submit = findViewById(R.id.submit);

        Editable s1 = f_name.getText();
        Editable s2 =m_name.getText();
        Editable s3 = l_name.getText();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (f_name.getText().toString().isEmpty() || m_name.getText().toString().isEmpty() || l_name.getText().toString().isEmpty())
                {
                    Toast.makeText(ButtonDemo.this, "Please Fill All Details", Toast.LENGTH_SHORT).show();
                }
                else {

                    tx1.append(s1);
                    tx2.append(s2);
                    tx3.append(s3);

                }

            }

        });


    }
}