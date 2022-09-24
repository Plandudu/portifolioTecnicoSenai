package com.example.testevocacional.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.testevocacional.R;

public class Home extends AppCompatActivity {
    TextView bemvindo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        bemvindo = findViewById(R.id.bemvindo_text);
        bemvindo.setText("Bem vindo " + MainActivity.usuario.getNome());
        bemvindo.setVisibility(TextView.VISIBLE);
    }

    public void resultado(View view){
        Intent intent = new Intent(this, ResultadoBottom.class);
        startActivity(intent);
    }
    public void editarPerfil(View view){
        Intent i = new Intent(this, editarPerfil.class);
        startActivity(i);
    }

    public void iniciar(View view){
        Intent i = new Intent(this, Quiz1.class);
        startActivity(i);
    }


}