package com.krishna.asciieducation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class EditTextDemo extends AppCompatActivity {

    EditText editText1,editText2;
    LinearLayout linearLayout;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_demo);

        linearLayout = findViewById(R.id.linear);

        editText2 = new EditText(this);
        editText2.setHint("created by Dyanmically");
        editText2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        linearLayout.addView(editText2);

    }
}