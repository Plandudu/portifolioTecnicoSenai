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
public class AgentePenal extends Funcionario{

    public AgentePenal(String nome, String cpf, String dataNascimento, String contato, String genero, String cargo, Integer cargaHoraria, Boolean bateuPonto, String pis, Float salario, Float valeTransporte, Float valeAlimentacao) {
        super(nome, cpf, dataNascimento, contato, genero, cargo, cargaHoraria, bateuPonto, pis, salario, valeTransporte, valeAlimentacao);
    }
    
    public boolean vigiar(Pavilhao pavilhao){
        return false;
    }
    
    public boolean acompanharPresidiario(Presidiario presidiario){
        return false;
    }
    
     public boolean transferenciaPresidiario(Presidiario presidiario){
        return false;
    }
    
    public void advertir(Presidiario presidiario, String pis){
      
    }
    
     public void advertir(Visitante pavilhao, String pis){
       
    }
    
    public void advertir(Presidiario presidiario, Visitante visitante, String pis){
  
    }
    
     public boolean conferir(Presidiario presidiario){
        return false;
    }
    
    public boolean conferir(Pavilhao pavilhao){
        return false;
    }
    
     public boolean revistar(Pavilhao pavilhao){
        return false;
    }
    
    public boolean revistar(Visitante visitante){
        return false;
    }
}
