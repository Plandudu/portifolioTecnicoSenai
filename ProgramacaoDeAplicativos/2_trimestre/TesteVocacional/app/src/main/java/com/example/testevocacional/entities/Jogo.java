package com.example.testevocacional.entities;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Jogo {
    private Usuario usuario;
    private Profissao profissao;

    public Jogo() {
    }

    public Jogo(Usuario usuario, Profissao profissao) {
        this.usuario = usuario;
        this.profissao = profissao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    //conexao BD
    public void salvar_bd(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child("Jogo").child(usuario.getNome()).setValue(this);
    }
}
