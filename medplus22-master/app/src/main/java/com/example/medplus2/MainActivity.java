package com.example.medplus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends AppCompatActivity {


    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void OnButtonClick(View view) {
        Intent obj1 = new Intent(MainActivity.this, MainActivity2.class);
        startActivityForResult(obj1, 10);
    }

    public void onnotiy(View view) {
        Intent obj1 = new Intent(MainActivity.this, notification.class);
        startActivityForResult(obj1, 10);

    }

    public void onstaus(View view) {
        Intent obj1 = new Intent(MainActivity.this, status.class);
        startActivityForResult(obj1, 10);
    }

    public void ondiet(View view) {
        Intent obj1 = new Intent(MainActivity.this, diet.class);
        startActivityForResult(obj1, 10);
    }


}
