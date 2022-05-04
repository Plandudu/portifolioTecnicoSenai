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
public class Treinamento {
    private int id;
    private String armas;
    private int suprimentos;
    private Sorteados sorteados;

    public Treinamento(int id, String armas, int suprimentos, Sorteados sorteados) {
        this.id = id;
        this.armas = armas;
        this.suprimentos = suprimentos;
        this.sorteados = sorteados;
    }
    
    public void aprenderAtirar(String armas){
        
    }
    
    public void sobrevivencia(String suprimentos){
        
    }
    
    public int prova(){
        return 0;
    }
}
