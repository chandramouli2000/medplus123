package com.example.medplus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity3 extends AppCompatActivity {
    Button book,book2;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Button button = findViewById(R.id.book);
        book2 = (Button)findViewById(R.id.book2);
        layout = (LinearLayout)findViewById(R.id.maxrad);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                button.setText("booked");
                book2.setVisibility(View.VISIBLE);


            }
        });
    }


    public void meet(View view) {
        Intent i = new Intent(this,meet.class);
        startActivity(i);
    }

    public void expand(View view) {
        layout.setVisibility(View.VISIBLE);

    }
}