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
public class Presidio {
    private String nome;
    private String local;
    private List<Pavilhao> pavilhao = new ArrayList<>();
    private String contato;
    private List<Pessoa> pessoa = new ArrayList<>();
    private List<String> estoque = new ArrayList<>();
    private float despesa;
    private float orcamento;
    private List<String> transporte = new ArrayList<>();
    private int lotacao;
    private List<String> sistemaSeguranca = new ArrayList<>();

    public Presidio(String nome, String local, String contato, float despesa, float orcamento, int lotacao) {
        this.nome = nome;
        this.local = local;
        this.contato = contato;
        this.despesa = despesa;
        this.orcamento = orcamento;
        this.lotacao = lotacao;
    }
    
    
}
