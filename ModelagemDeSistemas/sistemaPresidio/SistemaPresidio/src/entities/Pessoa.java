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
    private String cpf;
    private String dataNascimento;
    private String contato;
    private String genero;
    private String endereco;

    public Pessoa(String nome, String cpf, String dataNascimento, String contato, String genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.genero = genero;
    }
    
    
    public void registrar(String nome, String cpf, String dataNascimento, String contato, String genero){
        
    }
    
    public boolean verificaPresenca(String nome, String cpf){
        return false;
    }
}
