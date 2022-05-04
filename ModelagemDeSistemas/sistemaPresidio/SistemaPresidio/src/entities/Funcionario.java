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
public class Funcionario extends Pessoa{
    private String cargo;
    private int cargaHoraria;
    private boolean bateuPonto;
    private String pis;
    private float salario;
    private float valeTransporte;
    private float valeAlimentacao;

    public Funcionario(String nome, String cpf, String dataNascimento, String contato, String genero, String cargo, int cargaHoraria, boolean bateuPonto, String pis, float salario, float valeTransporte, float valeAlimentacao) {
        super(nome, cpf, dataNascimento, contato, genero);
        this.cargo = cargo;
        this.cargaHoraria = cargaHoraria;
        this.bateuPonto = bateuPonto;
        this.pis = pis;
        this.salario = salario;
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }
    
    public boolean baterPonto(){
        return false;
    }
    
    public boolean aumentarSalario(Float valor, String cpf){
        return false;
    }
    
    public boolean aumentarSalario(Float valor, String cpf, Integer cargaHoraria ){
        return false;
    }
    
    public boolean receberSalario(){
        return false;
    }
    
    public boolean receberVale(String vale){
        return false;
    }
    
    public boolean terFerias(String data){
        return false;
    }
    
    public void trabalhar(){
        
    }
    
    public int fazerHoraExtra(){
        return 0;
    }
    public boolean serTransferido(Pavilhao pavilhao){
        return false;
    }
    public void serDemitido(String cargo, String pis, String nome){
        
    }
    public void pedirDemissao(String cargo, String pis, String nome){
        
    }
}
