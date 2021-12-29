package com.mycompany.projeto2;

import java.util.Random;
import java.util.ArrayList;
public class Negocio {
    private String nome;
    private double ValorBaseTributavel;
    private int ProbPolicia, MusculoEquipa, EstrategaEquipa, InteligenciaEquipa;
    private boolean Policiavel, Musculado, Estratega, Inteligente;
    private ArrayList<CapoRegime> equipa;
    private ArrayList<Negocio> NegociosExistentes = new ArrayList();
    
    //Constutor de negocio
    public Negocio(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, boolean Musculado, boolean Estratega, boolean Inteligente){
        this.nome=nome;
        this.ValorBaseTributavel=ValorBaseTributavel;
        this.ProbPolicia=0;
        this.Policiavel=Policiavel;
        this.Musculado=Musculado;
        this.Estratega=Estratega;
        this.Inteligente=Inteligente;
        equipa= new ArrayList<CapoRegime>();    
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
    public boolean getMusculado(){
        return Musculado;
    }
    public boolean getEstratega(){
        return Estratega;
    }
    public boolean getInteligente(){
        return Inteligente;
    }
    
    //Adiciona e verifica os necogiocs existentes
    public void addNegocio(Negocio negocio){
        NegociosExistentes.add(negocio);
    }
    public ArrayList<Negocio> getNegociosExistentes(){
        return NegociosExistentes;
    } 
    
    //Adiciona e mostra a(s) equipa(s) no negocio
    public void addCapoRegime(CapoRegime caporegime){
        equipa.add(caporegime);
    }
    public ArrayList<CapoRegime> getCaporegimes(){
        return equipa;
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
    
    //Analisa a equipa associada ao negocio obtendo o valor total da equipa correspondente a cada caracteristica e seu valor médio 
    public void AnalisaEquipas(){
        for (int i = 0; i<equipa.size();i++){
            MusculoEquipa+=equipa.get(i).getMusculo();
            EstrategaEquipa+=equipa.get(i).getEstratega();
            InteligenciaEquipa+=equipa.get(i).getInteligencia();
            for (int j=0; j<equipa.get(i).getSoldiers().size() ;j++){
                MusculoEquipa+=equipa.get(i).getSoldiers().get(j).getMusculo();
                EstrategaEquipa+=equipa.get(i).getSoldiers().get(j).getEstratega();
                InteligenciaEquipa+=equipa.get(i).getSoldiers().get(j).getInteligencia();
            }
        }
    }
    
    //Verifica as condiçõess do negocio com a equipa relacionada com ele
    public void AnalisaNegocio(){
        if(getMusculado()==true && getEstratega()==false && getInteligente()== false){
        
        }
        if(getMusculado()==false && getEstratega()==true && getInteligente()==false){
        
        }
        if(getMusculado()==true && getEstratega()==true && getInteligente()==true){
        
        }
    }
}
