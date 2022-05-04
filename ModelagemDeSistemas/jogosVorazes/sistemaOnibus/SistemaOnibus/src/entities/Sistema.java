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
public class Sistema {
    private int id;
    private ArrayList<Usuario> usuario;
    private ArrayList<Onibus> onibus;
    private String licencaSoftware;

    public Sistema(int id, String licencaSoftware) {
        this.id = id;
        this.licencaSoftware = licencaSoftware;
    }

    public Sistema(int id, ArrayList<Usuario> usuario, String licencaSoftware) {
        this.id = id;
        this.usuario = usuario;
        this.licencaSoftware = licencaSoftware;
    }

    public Sistema(int id, ArrayList<Usuario> usuario, ArrayList<Onibus> onibus, String licencaSoftware) {
        this.id = id;
        this.usuario = usuario;
        this.onibus = onibus;
        this.licencaSoftware = licencaSoftware;
    }
    
    public boolean recomendarOnibus(Onibus onibus, Usuario usuario){
        return false;
    }
    
    public boolean mediaAvaliacaoOnibus(ArrayList<Usuario> usuario){
        return false;
    }
    
    public boolean manutencaoPlataforma(){
        return false;
    }
    
    public double mediaCustoGasolina(ArrayList<Onibus> onibus){
        return 0.0;
    }
}
