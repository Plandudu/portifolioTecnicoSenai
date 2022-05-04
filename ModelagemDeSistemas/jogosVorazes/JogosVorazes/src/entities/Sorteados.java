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
public class Sorteados extends Pessoa{
    private int id;
    private String endereco;
    private int filhos;
    private boolean conjugue;

    public Sorteados(int id, String endereco, int filhos, boolean conjugue, int idSorteado, String nome, String dataNascimento, String sexo) {
        super(id, nome, dataNascimento, sexo);
        this.id = idSorteado;
        this.endereco = endereco;
        this.filhos = filhos;
        this.conjugue = conjugue;
    }
    
    public boolean sairDoSorteio(){
        return false;
    }
    
    public void confereSorteio(){
       
    }
    
    public void avaliarSorteio(String comentario){
    }
    
    
    
}
