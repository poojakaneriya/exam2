package com.example.exam2;

import static com.example.exam2.R.id.list;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list ;
    String pizza [] = {"chicago Delights","la Pino'z Pizza","Fannito Pizza","Pizza Hut","Kutchi King","Gangour", "Zorko Brand Of Food","Gita's Fast Food","Tea Post","Shiv Farsan"};

    int pic[] = {R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,
    R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,R.drawable.img_9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list  = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,pizza);
        list.setAdapter(arr);
    }
}