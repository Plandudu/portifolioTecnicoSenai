package com.example.testevocacional.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testevocacional.R;
import com.example.testevocacional.entities.Usuario;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.ktx.Firebase;

import java.util.ArrayList;
import java.util.List;

public class Cadastro extends AppCompatActivity {
    EditText nome, senha, email, newSenha;
    Firebase meuFirebase;
    DatabaseReference dados;
    static Usuario uso = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();
        nome = findViewById(R.id.usuario);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senhaRegister);
        newSenha = findViewById(R.id.senhaConfirmar);
        Toast.makeText(this, "INICIANDO TELA", Toast.LENGTH_SHORT).show();
    }

    public void retornar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public Boolean senha(){
        if(senha.getText().toString().equals(newSenha.getText().toString())){
            return true;
        }else{
            Toast.makeText(this, "Senha deve ser igual ao confirmar", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void cadastrar(){
        String l = nome.getText().toString();
        String s = senha.getText().toString();
        String e = email.getText().toString();
        Usuario uso = new Usuario(l, s, e);
        uso.salvar_bd();
        this.uso = uso;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void verificar_usuario(View view){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuario");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Usuario u = null;
                String l = email.getText().toString();
                String n = nome.getText().toString();
                String s = senha.getText().toString();
                List<Boolean> teste = new ArrayList<>();
                int i = 0;

                for (DataSnapshot d : snapshot.getChildren()){
                    u = d.getValue(Usuario.class);
                    //verifica se o email UNICO existe na tabela OU se a senha for igual
                    if(u.getNome().equals(n) || u.getEmail().equals(l)){
                        //usuario com requisitos para ser iniciado
                        i = 1;
                        break;
                    }
                }

                if (i == 0 && senha()){
                    cadastrar();
                }else{
                    print("Usuario existente");
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