package com.houda.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Affichage du message via le code Java
        /*TextView textViewHello = findViewById(R.id.textViewID);
        textViewHello.setText(R.string.textHello);*/
    }
}