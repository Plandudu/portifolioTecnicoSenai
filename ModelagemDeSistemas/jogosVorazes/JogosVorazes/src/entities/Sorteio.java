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
public class Sorteio {
    private int id;
    private ArrayList<Sorteados> sorteados;
    private String dataSorteio;
    private int qtdParticipante;

    public Sorteio(int id, ArrayList<Sorteados> sorteados, String dataSorteio, int qtdParticipante) {
        this.id = id;
        this.sorteados = sorteados;
        this.dataSorteio = dataSorteio;
        this.qtdParticipante = qtdParticipante;
    }
    
    public String sortear(){
        return null;
    }
    
    public int diminuirParticipantes(){
        return qtdParticipante;
    }
    
    public boolean expulsarParticipante(){
        return false;
    }
    
}
