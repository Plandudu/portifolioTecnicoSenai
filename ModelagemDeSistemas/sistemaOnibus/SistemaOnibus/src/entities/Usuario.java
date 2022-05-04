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
class Usuario {
    private String cpf;
    private int id;
    private CartaoRecarga cartaoRecarga;
    private ArrayList<Onibus> onibus;
    private ArrayList<String> principaisLugares;

    public Usuario(String cpf, int id, CartaoRecarga cartaoRecarga, ArrayList<Onibus> onibus, ArrayList<String> principaisLugares) {
        this.cpf = cpf;
        this.id = id;
        this.cartaoRecarga = cartaoRecarga;
        this.onibus = onibus;
        this.principaisLugares = principaisLugares;
    }
    
    public Usuario(String cpf, int id, CartaoRecarga cartaoRecarga) {
        this.cpf = cpf;
        this.id = id;
        this.cartaoRecarga = cartaoRecarga;
        onibus = new ArrayList();
        principaisLugares = new ArrayList();
    }
    
    public boolean adicionarOnibusFavorito(Onibus onibus){
        return false;
    }
    
    public String visualizarOnibusTempoReal(Onibus onibus){
        return null;
    }
    
    public boolean avaliarOnibus(Onibus onibus){
        return false;
    }
    
    public boolean removerOnibusFavorito(Onibus onibus){
        return false;
    }
    
    public boolean adicionarLugares(String lugares){
        return false;
    }
    
    public boolean removerLugares(String lugares){
        return false;
    }
    
}
