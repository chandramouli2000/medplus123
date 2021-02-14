package com.example.medplus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Object view;
    EditText edittext;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edittext = (EditText)findViewById(R.id.problem);
        button = (Button)findViewById(R.id.opsub);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edittext.getText().toString();
                if(name == "")
                {
                    Intent obj1 = new Intent(MainActivity2.this, diet.class);
                    startActivityForResult(obj1, 10);
                }
                else {

                    Intent obj2 = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivityForResult(obj2, 10);
                }



            }
        });


    }

    public void opsub(View view) {


    }
}