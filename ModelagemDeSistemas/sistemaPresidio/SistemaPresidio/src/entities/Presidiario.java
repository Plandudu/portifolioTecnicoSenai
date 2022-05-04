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
public class Presidiario extends Pessoa{
    private int codigo;
    private String crime;
    private int numCela;
    private Pavilhao pavilhao;
    private String advogado;
    private int tempoSentencaMeses;
    private boolean julgamento;
    private boolean fianca;
    private String atividade;

    public Presidiario(String nome, String cpf, String dataNascimento, String contato, String genero, int codigo, String crime, int numCela, Pavilhao pavilhao, String advogado, int tempoSentencaMeses, boolean julgamento, boolean fianca, String atividade) {
        super(nome, cpf, dataNascimento, contato, genero);
        this.codigo = codigo;
        this.crime = crime;
        this.numCela = numCela;
        this.pavilhao = pavilhao;
        this.advogado = advogado;
        this.tempoSentencaMeses = tempoSentencaMeses;
        this.julgamento = julgamento;
        this.fianca = fianca;
        this.atividade = atividade;
    }
    
    public void tatuar(String crime){
        
    }
    
    public boolean receberVisita(String cpf, String crime, String advogado, String atividade){
        return false;
    }
    
    public boolean receberLigacao(String cpf, String crime, String advogado, String atividade){
        return false;
    }
    
    public boolean fazerLigacao(String cpf, Integer codigo, String crime, String advogado){
        return false;
    }
    
    public void serLiberado(String nome, String cpf){
        
    }
    
    public boolean transferencia(Integer codigo, Pavilhao pavilhao, Funcionario funcionario){
        return false;
    }
    
    public void sairPresidio(String nome, String cpf, String crime){
    }
    
    public boolean comparecerJulgamento(String nome, String cpf, String crime, Funcionario funcionario){
        return false;
    }
    
    public boolean banhoDeSol(){
        return false;
    }
    
    public boolean recolher(Integer codigo){
        return false;
    }
    
    public boolean irSolitaria(String cpf, String nome, Integer codigo){
        return false;
    }
}
