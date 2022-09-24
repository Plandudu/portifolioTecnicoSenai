package com.example.testevocacional.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.testevocacional.R;
import com.example.testevocacional.entities.Jogo;
import com.example.testevocacional.entities.Profissao;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Resultado extends AppCompatActivity {
    TextView p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, titulo;
    Profissao p = null;
    static Jogo jogo = null;
    static Integer temp = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
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
        if (temp == 1){
            resultado();
        }else{
            p1.setVisibility(View.INVISIBLE);
            p2.setVisibility(View.INVISIBLE);
            p3.setVisibility(View.INVISIBLE);
            p4.setVisibility(View.INVISIBLE);
            p5.setVisibility(View.INVISIBLE);
            p6.setVisibility(View.INVISIBLE);
            p7.setVisibility(View.INVISIBLE);
            p8.setVisibility(View.INVISIBLE);
            p9.setVisibility(View.INVISIBLE);
            p10.setVisibility(View.INVISIBLE);
            p11.setVisibility(View.INVISIBLE);
            p12.setVisibility(View.INVISIBLE);
            titulo.setVisibility(View.INVISIBLE);
        }
    }

    public void resultado(){
        if (Quiz1.result <= 10){
            //biologicas
            profissoes("biologicas");
        }else if(Quiz1.result <= 18){
            //humanas
            profissoes("humanas");
        }else if(Quiz1.result <= 26){
            //exatas
            profissoes("exatas");
        }else if(Quiz1.result <= 34){
            //saude
            profissoes("saude");
        }else{
            //linguagens
            profissoes("linguagens");
        }
    }

    public void profissoes(String id){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Profissao");
        reference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot d : snapshot.getChildren()){
                    p = d.getValue(Profissao.class);
                    System.out.println(p.getTitulo());
                    if (p.getTitulo().equals(id)){
                        System.out.println(p.getP1());
                        print(p.getP1());
                        alterarTexto();
                        jogo = new Jogo(MainActivity.usuario, p);
                        jogo.salvar_bd();
                        Quiz1.result = 0;
                        temp = 0;

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

    public void alterarTexto(){
        p1.setText(p.getP1());
        p2.setText(p.getP2());
        p3.setText(p.getP3());
        p4.setText(p.getP4());
        p5.setText(p.getP5());
        p6.setText(p.getP6());
        p7.setText(p.getP7());
        p8.setText(p.getP8());
        p9.setText(p.getP9());
        p10.setText(p.getP10());
        p11.setText(p.getP11());
        p12.setText(p.getP12());
        titulo.setText(titulo.getText().toString() + " " + p.getTitulo());
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
        //Quiz1.result = 0;
    }
    public void retornar(View view){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
    @Override
    public void onBackPressed() {
        // não chame o super desse método
    }
}
