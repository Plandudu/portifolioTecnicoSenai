package com.example.testevocacional.entities;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profissao {
    private String titulo;
    private String p1;
    private String p2;
    private String p3;
    private String p4;
    private String p5;
    private String p6;
    private String p7;
    private String p8;
    private String p9;
    private String p10;
    private String p11;
    private String p12;

    public Profissao(String titulo, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12) {
        this.titulo = titulo;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
        this.p10 = p10;
        this.p11 = p11;
        this.p12 = p12;
    }

    public Profissao() {
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public void setP5(String p5) {
        this.p5 = p5;
    }

    public void setP6(String p6) {
        this.p6 = p6;
    }

    public void setP7(String p7) {
        this.p7 = p7;
    }

    public void setP8(String p8) {
        this.p8 = p8;
    }

    public void setP9(String p9) {
        this.p9 = p9;
    }

    public void setP10(String p10) {
        this.p10 = p10;
    }

    public void setP11(String p11) {
        this.p11 = p11;
    }

    public void setP12(String p12) {
        this.p12 = p12;
    }

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public String getP3() {
        return p3;
    }

    public String getP4() {
        return p4;
    }

    public String getP5() {
        return p5;
    }

    public String getP6() {
        return p6;
    }

    public String getP7() {
        return p7;
    }

    public String getP8() {
        return p8;
    }

    public String getP9() {
        return p9;
    }

    public String getP10() {
        return p10;
    }

    public String getP11() {
        return p11;
    }

    public String getP12() {
        return p12;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    //conexao BD
    public void salvar_bd(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child("Profissao").child(titulo).setValue(this);
    }
}
