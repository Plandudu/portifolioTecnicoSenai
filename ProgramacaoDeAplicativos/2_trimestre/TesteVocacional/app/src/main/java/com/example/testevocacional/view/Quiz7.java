package com.example.testevocacional.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testevocacional.R;

public class Quiz7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);
        getSupportActionBar().hide();
    }

    public void letra_a(View view){
        Quiz1.result += Quiz1.a;
        trocaTela();
    }

    public void letra_b(View view){
        Quiz1.result += Quiz1.b;
        trocaTela();
    }

    public void letra_c(View view){
        Quiz1.result += Quiz1.c;
        trocaTela();
    }

    public void letra_d(View view){
        Quiz1.result += Quiz1.d;
        trocaTela();
    }

    public void letra_e(View view){
        Quiz1.result += Quiz1.e;
        trocaTela();
    }

    public void trocaTela(){
        Intent i = new Intent(this, Quiz8.class);
        startActivity(i);
    }
    @Override
    public void onBackPressed() {
        // não chame o super desse método
    }
}
