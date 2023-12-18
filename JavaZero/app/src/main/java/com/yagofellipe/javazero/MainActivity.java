package com.yagofellipe.javazero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yagofellipe.javazero.classes.ContaBancaria;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContaBancaria conta = new ContaBancaria();
    }
}