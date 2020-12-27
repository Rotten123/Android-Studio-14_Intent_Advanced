package com.thishkt.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivitymap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymap);

        open_map();
    }
    private void open_map(){
        Intent map = new Intent(Intent.ACTION_VIEW);
        startActivity(map);
        finish();//開啟後關閉XML
    }
}