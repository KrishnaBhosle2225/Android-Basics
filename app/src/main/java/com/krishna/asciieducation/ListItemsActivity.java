package com.krishna.asciieducation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListItemsActivity extends AppCompatActivity {

    ListView listView;
    String[] lang_array = {"C Programming", "C++","Java","Python","Android","HTML","CSS","JavaScript","PHP","BootStrap",
            "Angular","Node JS","Modula3","C#","Swift"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lang_array);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ListViewItemClickListener());
    }

        class ListViewItemClickListener implements AdapterView.OnItemClickListener{

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               if (position==0)
               {
                    Toast.makeText(ListItemsActivity.this, "C Progamming is Clicked ", Toast.LENGTH_SHORT).show();
               }
               if (position==1)
               {
                    Toast.makeText(ListItemsActivity.this, "C++ is Clicked ", Toast.LENGTH_SHORT).show();
               }
               if (position==2)
               {
                    Toast.makeText(ListItemsActivity.this, "Java is Clicked ", Toast.LENGTH_SHORT).show();
               }
               if (position==3)
               {
                    Toast.makeText(ListItemsActivity.this, "Python is Clicked ", Toast.LENGTH_SHORT).show();
               }
                if (position==4)
                {
                    Toast.makeText(ListItemsActivity.this, "Android is Clicked ", Toast.LENGTH_SHORT).show();
                }
                if (position==5)
                {
                    Toast.makeText(ListItemsActivity.this, "HTML is Clicked ", Toast.LENGTH_SHORT).show();
                }
                if (position==6)
                {
                    Toast.makeText(ListItemsActivity.this, "CSS is Clicked ", Toast.LENGTH_SHORT).show();
                }
                if (position==7)
                {
                    Toast.makeText(ListItemsActivity.this, "JavaScript is Clicked ", Toast.LENGTH_SHORT).show();
                }
                if (position==8)
                {
                    Toast.makeText(ListItemsActivity.this, "PHP is Clicked ", Toast.LENGTH_SHORT).show();
                }


            }
    }
}