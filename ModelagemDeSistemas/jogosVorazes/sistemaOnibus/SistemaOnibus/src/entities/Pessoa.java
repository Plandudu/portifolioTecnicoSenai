/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author felipe_apio-souza
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String numeroCelular;

    public Pessoa(String nome, String dataNascimento, String endereco, String numeroCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.numeroCelular = numeroCelular;
    }
    
    
}
