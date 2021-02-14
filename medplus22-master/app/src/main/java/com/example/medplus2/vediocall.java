package com.example.medplus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vediocall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vediocall);
    }

    public void back(View view) {
        Intent i = new Intent(this,meet.class);
        startActivity(i);
    }
}