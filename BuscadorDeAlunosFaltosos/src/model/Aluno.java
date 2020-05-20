/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Arley Novais
 */
public class Aluno {
    private String nome;
    private String turma;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, String turma){
        this.nome = nome;
        this.turma = turma;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Aluno)obj).nome.equals(this.nome); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public String toString() {
        return '(' + this.nome + ", " + this.turma + ')';
    }
}
