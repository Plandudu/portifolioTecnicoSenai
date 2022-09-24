/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ademar_dadam-neto
 */
public class Restaurante {
    private String cnpj;
    private String nome;
    private String numero;
    private String email;
    private String estado;
    private String cidade;
    private String bairro;
    private String numero_restaurante;
    private String cep;
    private String senha;

    public Restaurante(String cnpj, String nome, String numero, String email, String estado, String cidade, String bairro, String numero_restaurante, String cep, String senha) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero_restaurante = numero_restaurante;
        this.cep = cep;
        this.senha = senha;
    }
    
    public Restaurante() {
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getNumero_restaurante() {
        return numero_restaurante;
    }

    public void setNumero_restaurante(String numero_restaurante) {
        this.numero_restaurante = numero_restaurante;
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
    
   
}
