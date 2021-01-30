package com.krishna.asciieducation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListView lang_list;
    String[] langArray = {"C Programming","C++","Java","Python","Advance Java" , "C#" ,"Perl","R Programming" ,"PHP",
            ".net","Modula3","Java Script","HTML","CSS","BootStrap"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lang_list = findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,langArray);

        lang_list.setAdapter(adapter);


        }

    }