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
public class Visitante extends Pessoa{
    private String dataVisita;
    private int horaVisita;
    private int minVisita;
    private int horaSaida;
    private int minSaida;
    private List<String> pertences = new ArrayList<>();
    private String tipoVisita;
    private List<String> presente = new ArrayList<>();
    private String relacao;

    public Visitante(String dataVisita, int horaVisita, int minVisita, int horaSaida, int minSaida, String tipoVisita, String relacao, String nome, String cpf, String dataNascimento, String contato, String genero) {
        super(nome, cpf, dataNascimento, contato, genero);
        this.dataVisita = dataVisita;
        this.horaVisita = horaVisita;
        this.minVisita = minVisita;
        this.horaSaida = horaSaida;
        this.minSaida = minSaida;
        this.tipoVisita = tipoVisita;
        this.relacao = relacao;
    }
    
    public String revistar(String pertences, String relacao){
        return null;
    }
    
    public boolean agendarVisita(String nome, String cpf, String dataVisita, String tipoVisita, int horaVisita, int minVisita,  String contato, String endereco){
        return false;
    }
    
    public boolean presentear(String presente){
        return false;
    }
    
    
}
