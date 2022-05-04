/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author felipe_apio-souza
 */
public class Empresa {
    private String cnpj;
    private String nome;
    private ArrayList<Onibus> onibus;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Usuario> usuarios;

    public Empresa(String cnpj, String nome, ArrayList<Onibus> onibus, ArrayList<Funcionario> funcionarios, ArrayList<Usuario> usuarios) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.onibus = onibus;
        this.funcionarios = funcionarios;
        this.usuarios = usuarios;
    }

    
    
    public boolean aumentarFrotaOnibus(Onibus onibus){
        return false;
    }
    
    public boolean aumentarFuncionarios(Funcionario funcionario){
        return false;
    }
    
    public boolean aumentarSalario(Funcionario funcionario){
        return false;
    }
    
    public boolean demitir(Onibus onibus){
        return false;
    }

    
    
}
