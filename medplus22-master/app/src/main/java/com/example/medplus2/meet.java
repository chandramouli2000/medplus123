package com.example.medplus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class meet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet);
    }

    public void status(View view) {
        Intent i = new Intent(this,status.class);
        startActivity(i);
    }

    public void opentablets(View view) {
        Intent i = new Intent(this,tablets.class);
        startActivity(i);
    }

    public void pay(View view) {
        Intent i = new Intent(this,payment.class);
        startActivity(i);
    }

    public void vediocall(View view) {
        Intent i = new Intent(this,vediocall.class);
        startActivity(i);

    }
}