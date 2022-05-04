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
public class Distrito {
    private int cep;
    private String nome;
    private String lider;
    private Sorteio sorteio;

    public Distrito(int cep, String nome, String lider, Sorteio sorteio) {
        this.cep = cep;
        this.nome = nome;
        this.lider = lider;
        this.sorteio = sorteio;
    }
    
    public boolean iniciarSorteio(Sorteio sorteio){
        return false;
    }
    
    public boolean premiarSorteado(){
        return false;
    }
    
    public boolean finalizarSorteio(Sorteio sorteio){
        return false;
    }
    
    
}
