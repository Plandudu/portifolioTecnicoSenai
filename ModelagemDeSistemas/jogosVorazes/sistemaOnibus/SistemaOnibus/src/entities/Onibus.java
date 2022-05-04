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
public class Onibus {
    private String placa;
    private double preco;
    private double gasolinaTanqueLitros;
    private Funcionario funcionario;
    private ArrayList<String> escala;
    private String tempoReal;
    private ArrayList<Double> custoCombustivelAbastecer;

    public Onibus(String placa, double preco, double gasolinaTanqueLitros, Funcionario funcionario, ArrayList<String> escala, String tempoReal, ArrayList<Double> custoCombustivelAbastecer) {
        this.placa = placa;
        this.preco = preco;
        this.gasolinaTanqueLitros = gasolinaTanqueLitros;
        this.funcionario = funcionario;
        this.escala = escala;
        this.tempoReal = tempoReal;
        this.custoCombustivelAbastecer = custoCombustivelAbastecer;
    }

    
    
    public boolean abastecer(Double litro, Double preco){
        return false;
    }
    
    public boolean manutencao(String placa){
        return false;
    }
    
    public boolean trocarPneu(String placa){
        return false;
    }
    
    public boolean atualizarOnibusTempoReal(String tempoReal){
        return false;
    }

}
