package com.krishna.asciieducation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextViewDemo extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView textView1,textView2;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_demo);

        linearLayout = findViewById(R.id.view);

        textView1 = findViewById(R.id.textview1);
        textView1.append(" file");
        textView1.setTextSize(20);

        textView2 = new TextView(this);
        textView2.setText("This textview is created by dyanamically");
        textView2.setTextSize(15);
        textView2.setWidth(400);
        textView2.setHeight(200);
        textView2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView2.setBackgroundColor(Color.CYAN);
        textView2.setTextColor(Color.RED);

        linearLayout.addView(textView2);

    }
}