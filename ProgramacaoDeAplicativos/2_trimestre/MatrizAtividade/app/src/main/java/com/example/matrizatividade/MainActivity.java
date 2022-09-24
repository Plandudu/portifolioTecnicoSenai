package com.example.matrizatividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.matrizatividade.R;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2, n3, n4, n5, n6, n7, n8, n9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
    }

    public void avancar(View v){
        if(n1 == null || n2 == null || n3 == null || n4 == null || n5 == null || n6 == null || n7 == null || n8 == null || n9 == null){
            Toast.makeText(this, "campos invalidos", Toast.LENGTH_LONG);
        }else{
            Resultado.n1 = Integer.parseInt(n1.getText().toString());
            Resultado.n2 = Integer.parseInt(n2.getText().toString());
            Resultado.n3 = Integer.parseInt(n3.getText().toString());
            Resultado.n4 = Integer.parseInt(n4.getText().toString());
            Resultado.n5 = Integer.parseInt(n5.getText().toString());
            Resultado.n6 = Integer.parseInt(n6.getText().toString());
            Resultado.n7 = Integer.parseInt(n7.getText().toString());
            Resultado.n8 = Integer.parseInt(n8.getText().toString());
            Resultado.n9 = Integer.parseInt(n9.getText().toString());

            Intent i = new Intent(this, Resultado.class);
            startActivity(i);
        }

    }

}