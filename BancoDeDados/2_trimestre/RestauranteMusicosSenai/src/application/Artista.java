package application;

import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue_aguete-filho
 */
public class Artista {
    private String cpf;

    public Artista(String cpf, String nome, String numero, String email, String categoria, String estado, String cidade, String bairro, String numero_casa, String cep, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.categoria = categoria;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero_casa = numero_casa;
        this.cep = cep;
        this.senha = senha;
    }

    public Artista() {
    }

    
  

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    private String nome;
    private String numero;
    private String email;
    private String categoria;
    private String estado;
    private String cidade;
    private String bairro;
    private String numero_casa;
    private String cep;
    private String senha;
    
    
 }
