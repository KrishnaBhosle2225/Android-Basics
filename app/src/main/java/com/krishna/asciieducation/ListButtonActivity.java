package com.krishna.asciieducation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListButtonActivity extends AppCompatActivity {

    Button add, remove;
    ListView listView;
    EditText editText;
    ArrayAdapter<String> adapter;
    ArrayList<String> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_button);
        
        add = findViewById(R.id.addcity);
        remove = findViewById(R.id.removecity);
        listView = findViewById(R.id.liststate1);
        editText = findViewById(R.id.editcity);

        cityList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(ListButtonActivity.this, android.R.layout.simple_list_item_1, cityList);


        add.setOnClickListener(new addListListener());
        listView.setAdapter(adapter);

        remove.setOnClickListener(new removeListListener());
        listView.setAdapter(adapter);
    }

    class addListListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (editText.getText().equals("")==true)
            {
                Toast.makeText(ListButtonActivity.this,"Enter City Name",Toast.LENGTH_SHORT).show();
            }
            if (cityList.contains(editText.getText().toString().trim()))
            {
                Toast.makeText(ListButtonActivity.this, "Already Exists", Toast.LENGTH_SHORT).show();
            }
            else
            {

                cityList.add(editText.getText().toString().trim());
                adapter.notifyDataSetChanged();
                Toast.makeText(ListButtonActivity.this,editText.getText().toString().trim()+" City is Added",Toast.LENGTH_SHORT).show();
                editText.setText("");
            }

        }
    }

    class removeListListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (editText.getText().equals("")==true)
            {
                Toast.makeText(ListButtonActivity.this,"Enter City Name",Toast.LENGTH_SHORT).show();
            }
            if (!cityList.contains(editText.getText().toString().trim()))
            {
                Toast.makeText(ListButtonActivity.this, editText.getText().toString().trim()+" City is not in List", Toast.LENGTH_SHORT).show();
            }
            else {
                cityList.remove(editText.getText().toString().trim());
                adapter.notifyDataSetChanged();
                Toast.makeText(ListButtonActivity.this,editText.getText().toString().trim()+" City is Removed",Toast.LENGTH_SHORT).show();
                editText.setText("");
            }
        }
    }

}