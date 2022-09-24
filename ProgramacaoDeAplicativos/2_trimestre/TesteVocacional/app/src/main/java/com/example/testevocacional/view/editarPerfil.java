package com.example.testevocacional.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

import java.util.ArrayList;
import java.util.List;

public class editarPerfil extends AppCompatActivity {
    EditText email, senha, senhaConfirmar;
    int temp = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);
        getSupportActionBar().hide();
        email = findViewById(R.id.emailAlterar);
        senha = findViewById(R.id.alterarSenha);
        senhaConfirmar = findViewById(R.id.senhaAlterarConfirmar);
    }

    public void editarPerfil(View view){
        if (!senha.getText().toString().equals("")){
            if(!editarSenha()){
                print("Senha invalida");
            }else{
                print("Senha alterda com sucesso");
            }
        }else if (!email.getText().toString().equals("")){
            if(!editarEmail()){
                print("Email invalida");
            }else{
                print("Email alterda com sucesso");
            }
        }else{
            print("Campos devem ser unicos");
        }
    }

    public boolean editarEmail(){
        if(verificar_email()){
            MainActivity.usuario.setEmail(email.getText().toString());
            MainActivity.usuario.salvar_bd();
            return true;
        }
        return false;
    }

    public boolean verificar_email(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuario");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot d : snapshot.getChildren()){
                    Usuario u = d.getValue(Usuario.class);
                    if (email.getText().toString().equals(u.getEmail())){
                        temp = 1;
                        System.out.println("EMAIL NAO ALTERADO COM SUCESSO");
                        break;
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        System.out.println("TEMP: " + temp);
        if (temp == 0){
            return true;
        }else{
            return false;
        }


    }
    public boolean editarSenha(){
        if(senha.getText().toString().equals(MainActivity.usuario.getSenha())){
            return false;
        }else if(!senha.getText().toString().equals(senhaConfirmar.getText().toString())){
            return false;
        }
        MainActivity.usuario.setSenha(senha.getText().toString());
        MainActivity.usuario.salvar_bd();
        return true;
    }

    public void print(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}