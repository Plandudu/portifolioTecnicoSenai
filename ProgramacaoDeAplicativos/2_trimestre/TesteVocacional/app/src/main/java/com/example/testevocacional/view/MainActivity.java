package com.example.testevocacional.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testevocacional.R;
import com.example.testevocacional.entities.Profissao;
import com.example.testevocacional.entities.Usuario;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static Usuario usuario = null;
    EditText login, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
    }

    public void entrar(View view){
        verificar_usuario();
    }

    public void trocaTela(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void registrar(View view){
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }




    public void verificar_usuario(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuario");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String l = login.getText().toString();
                String s = senha.getText().toString();
                int i = 0;
                for (DataSnapshot d : snapshot.getChildren()){
                    usuario = d.getValue(Usuario.class);

                    if((usuario.getEmail().equals(l) || usuario.getNome().equals(l)) && usuario.getSenha().equals(s)){
                        i = 1;
                        trocaTela();
                        break;
                    }
                }
                if (i == 0){
                    usuario = null;
                    print("Usuario ou senha invalido");
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