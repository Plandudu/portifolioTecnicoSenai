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
public class Funcionario extends Pessoa{
    private String pis;
    private String funcao;
    private double salario;
    private ArrayList<String> escalaDias;

    public Funcionario(String pis, String funcao, double salario, ArrayList<String> escalaDias, String nome, String dataNascimento, String endereco, String numeroCelular) {
        super(nome, dataNascimento, endereco, numeroCelular);
        this.pis = pis;
        this.funcao = funcao;
        this.salario = salario;
        this.escalaDias = escalaDias;
    }

    public boolean baterPonto(String bater){
        return false;
    }
    public void solicitarAumento(double aumento, Empresa empresa){
        
    }
    public boolean solicitarPromocao(String promocao, Empresa empresa){
        return false;
    }

   
    
    
    
}
