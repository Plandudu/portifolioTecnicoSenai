package com.example.testevocacional.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testevocacional.R;

public class Quiz1 extends AppCompatActivity {
    static int a = 1;
    static int b = 2;
    static int c = 3;
    static int d = 4;
    static int e = 5;
    static int result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        getSupportActionBar().hide();
        Resultado.temp = 0;
    }

    @Override
    public void onBackPressed() {
        // não chame o super desse método
    }
    public void letra_a(View view){
        result += a;
        trocaTela();
    }

    public void letra_b(View view){
        result += b;
        trocaTela();
    }

    public void letra_c(View view){
        result += c;
        trocaTela();
    }

    public void letra_d(View view){
        result += d;
        trocaTela();
    }

    public void letra_e(View view){
        result += e;
        trocaTela();
    }

    public void trocaTela(){
        Intent i = new Intent(this, Quiz2.class);
        startActivity(i);
    }
}
