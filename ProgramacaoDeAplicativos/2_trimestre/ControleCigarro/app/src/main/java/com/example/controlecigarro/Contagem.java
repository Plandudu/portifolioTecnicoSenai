package com.example.controlecigarro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Contagem extends AppCompatActivity {
    TextView fumo;
    int i, vapev;
    String l = MainActivity.usuario.getEmail();
    Boolean t = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contagem);
        getSupportActionBar().hide();
        fumo = findViewById(R.id.fumo);

        if(Inicial.i == 1){
            fumo.setText("cigarro");
        }else if(Inicial.i == 2){
            fumo.setText("charuto");
        }else if(Inicial.i == 3){
            fumo.setText("vape");
        }else if(Inicial.i == 4){
            fumo.setText("narguile");
        }else if(Inicial.i == 5){
            fumo.setText("cachimbo");
        }
    }

    public void cigarro(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Cigarro");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    if(d.getValue(Cigarro.class).getEmailUser().equals(l)){
                        System.out.println(1);
                        i = d.getValue(Cigarro.class).getQtd();
                        t = true;
                        break;
                    }else {
                        t = false;
                    }

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        if(t == false){
            i = 1;
            Cigarro cigarro = new Cigarro(MainActivity.usuario.getEmail(), i);
            cigarro.salvar();
        } else{
            i += 1;
            Cigarro cigarro = new Cigarro(l, i);
            cigarro.salvar();
        }
        Toast.makeText(this,"Fumou: " + vapev, Toast.LENGTH_LONG).show();
        i = 0;

    }

    public void charuto(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Charuto");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    if(d.getValue(Charuto.class).getEmailUser().equals(l)){
                        System.out.println(1);
                        i = d.getValue(Charuto.class).getQtd();
                        t = true;
                        break;
                    }else {
                        t = false;
                    }

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        if(t == false){
            i = 1;
            Charuto charuto = new Charuto(MainActivity.usuario.getEmail(), i);
            charuto.salvar();
        } else{
            i += 1;
            Charuto charuto = new Charuto(l, i);
            charuto.salvar();
        }
        Toast.makeText(this,"Fumou: " + vapev, Toast.LENGTH_LONG).show();
        i = 0;

    }

    public void vape(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Vape");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    if(d.getValue(Vape.class).getEmailUser().equals(l)){
                        Vape v = d.getValue(Vape.class);
                        vapev = v.getQtd();
                        System.out.println("Quantidade = " + vapev);
                        t = true;
                        break;
                    }else {
                        t = false;
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });
        System.out.println("total = " + vapev);
        if(t == false){
            vapev = 1;
            Vape vape = new Vape(MainActivity.usuario.getEmail(), vapev);
            vape.salvar();
        } else{
            vapev += 1;
            Vape vape = new Vape(l, vapev);
            vape.salvar();
        }
        Toast.makeText(this,"Fumou: " + vapev, Toast.LENGTH_LONG).show();
        vapev = 0;

    }

    public void narguile(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Narguile");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    if(d.getValue(Vape.class).getEmailUser().equals(l)){
                        System.out.println(1);
                        i = d.getValue(Narguile.class).getQtd();
                        t = true;
                        break;
                    }else {
                        t = false;
                    }

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        if(t == false){
            i = 1;
            Narguile narguile = new Narguile(MainActivity.usuario.getEmail(), i);
            narguile.salvar();
        } else{
            i += 1;
            Narguile narguile = new Narguile(l, i);
            narguile.salvar();
        }
        Toast.makeText(this,"Fumou: " + vapev, Toast.LENGTH_LONG).show();
        i = 0;

    }

    public void cachimbo(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Cachimbo");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    if(d.getValue(Cachimbo.class).getEmailUser().equals(l)){
                        System.out.println(1);
                        i = d.getValue(Narguile.class).getQtd();
                        t = true;
                        break;
                    }else {
                        t = false;
                    }

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        if(t == false){
            i = 1;
            Cachimbo cachimbo = new Cachimbo(MainActivity.usuario.getEmail(), i);
            cachimbo.salvar();
        } else{
            i += 1;
            Cachimbo cachimbo = new Cachimbo(l, i);
            cachimbo.salvar();
        }
        Toast.makeText(this,"Fumou: " + vapev, Toast.LENGTH_LONG).show();
        i = 0;

    }


    public void botao(View view){
        if(Inicial.i == 1){
            cigarro();
        }else if(Inicial.i == 2){
            charuto();
        }else if(Inicial.i == 3){
            vape();
        }else if(Inicial.i == 4){
            narguile();
        }else if(Inicial.i == 5){
            cachimbo();
        }
    }

    public void mudaTela(){
        Intent i = new Intent(this, Inicial.class);
        startActivity(i);
    }

}