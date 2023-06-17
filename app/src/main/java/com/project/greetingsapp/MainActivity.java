package com.project.greetingsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextName = findViewById(R.id.editTextName);
        Button buttonHello = findViewById(R.id.buttonHello);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_LONG).show();
            }
        });
    }
}