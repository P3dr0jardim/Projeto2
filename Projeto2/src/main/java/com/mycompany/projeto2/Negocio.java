/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author franc
 */
import java.util.*;
public class Negocio {
    private String nome;
    private double ValorBaseTributavel;
    private int ProbPolicia;
    private boolean Policiavel;
    
    //Constutor de negocio
    public Negocio(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel){
        this.nome=nome;
        this.ValorBaseTributavel=ValorBaseTributavel;
        this.ProbPolicia=0;
        this.Policiavel=Policiavel;
    }
    
    //Getters e setters necessários
    public String getNome(){
        return nome;
    }
    public double getValorBaseTributavel(){
        return ValorBaseTributavel;
    }
    public void setValorBaseTributavel(int NovoValorBase){
        this.ValorBaseTributavel=NovoValorBase;
    }
    public boolean VerificaPoliciavel(){
        return Policiavel;
    }
    public int getProbPolicia(){
        return ProbPolicia;
    }
    public void setProbPolicia(int prob){
        this.ProbPolicia=prob;
    }    
    
    //Probabilidade da policia agir caso haja um informador no negócio
    public void ProbComInformador(int aumento){
        ProbPolicia+=aumento;
    }
    
    //Probabilidade do negocio ser atuado pela policia
    public void PoliciaAtuar(){
        if (VerificaPoliciavel()==true){
            Random rand= new Random();
            int policia = rand.nextInt(61)+20;//valor entre 20 e 80 (inclusive ambos)
            setProbPolicia(policia);
        }
    }
}
