package com.example.testevocacional.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testevocacional.R;
import com.example.testevocacional.entities.Jogo;
import com.example.testevocacional.entities.Usuario;
import com.example.testevocacional.view.Resultado;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResultadoBottom extends AppCompatActivity {
    TextView p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, titulo;
    Jogo jogo = new Jogo();
    Jogo j1 = new Jogo();
    Button vr_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_bottom);
        getSupportActionBar().hide();
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);
        p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p1 = findViewById(R.id.p1);
        p8 = findViewById(R.id.p8);
        p9 = findViewById(R.id.p9);
        p10 = findViewById(R.id.p10);
        p11 = findViewById(R.id.p11);
        p12 = findViewById(R.id.p12);
        titulo = findViewById(R.id.tituloArea);
        vr_bt = findViewById(R.id.vr_bt);
    }

    public void alterarTexto(){
        p1.setText(jogo.getProfissao().getP1());
        p2.setText(jogo.getProfissao().getP2());
        p3.setText(jogo.getProfissao().getP3());
        p4.setText(jogo.getProfissao().getP4());
        p5.setText(jogo.getProfissao().getP5());
        p6.setText(jogo.getProfissao().getP6());
        p7.setText(jogo.getProfissao().getP7());
        p8.setText(jogo.getProfissao().getP8());
        p9.setText(jogo.getProfissao().getP9());
        p10.setText(jogo.getProfissao().getP10());
        p11.setText(jogo.getProfissao().getP11());
        p12.setText(jogo.getProfissao().getP12());
        titulo.setText(titulo.getText().toString() + " " + jogo.getProfissao().getTitulo());
        visibleText();
    }
    public void visibleText(){
        p1.setVisibility(View.VISIBLE);
        p2.setVisibility(View.VISIBLE);
        p3.setVisibility(View.VISIBLE);
        p4.setVisibility(View.VISIBLE);
        p5.setVisibility(View.VISIBLE);
        p6.setVisibility(View.VISIBLE);
        p7.setVisibility(View.VISIBLE);
        p8.setVisibility(View.VISIBLE);
        p9.setVisibility(View.VISIBLE);
        p10.setVisibility(View.VISIBLE);
        p11.setVisibility(View.VISIBLE);
        p12.setVisibility(View.VISIBLE);
        titulo.setVisibility(View.VISIBLE);
    }

    public void retornar(View view){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }

    public void verificar_jogo(View view){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Jogo");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot d : snapshot.getChildren()){
                    j1 = d.getValue(Jogo.class);
                    if(j1.getUsuario().getNome().equals(MainActivity.usuario.getNome())){
                        jogo = j1;
                        alterarTexto();
                        vr_bt.setVisibility(View.INVISIBLE);
                        break;
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    public void print(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}