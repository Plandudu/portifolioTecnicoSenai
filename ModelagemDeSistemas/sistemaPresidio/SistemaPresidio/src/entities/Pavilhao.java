/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_apio-souza
 */
public class Pavilhao {
    private int cela;
    private int refeitorio;
    private int banheiro;
    private int solitaria;
    private List<Presidiario> presidiario = new ArrayList<Presidiario>();
    private List<Funcionario> funcionario = new ArrayList<>();
    private int id;
    private String tipo;
    private int patio;
    private int biblioteca;
    private int lavanderia;
    private int salaDeAula;
    private List<String> salasTecnico = new ArrayList<>();
    private int capela;
    private List<String> salaDeVisita = new ArrayList<>();
    private boolean lojaConveniencia;

    public Pavilhao(int cela, int refeitorio, int banheiro, int solitaria, int id, String tipo, int patio, int biblioteca, int lavanderia, int salaDeAula, int capela, boolean lojaConveniencia) {
        this.cela = cela;
        this.refeitorio = refeitorio;
        this.banheiro = banheiro;
        this.solitaria = solitaria;
        this.id = id;
        this.tipo = tipo;
        this.patio = patio;
        this.biblioteca = biblioteca;
        this.lavanderia = lavanderia;
        this.salaDeAula = salaDeAula;
        this.capela = capela;
        this.lojaConveniencia = lojaConveniencia;
    }
    
    
}
