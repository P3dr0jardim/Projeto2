package com.mycompany.projeto2;

import java.util.Random;

public class Negocio {

    private String nome;
    private double ValorBaseTributavel;
    private int ProbPolicia;
    private boolean Policiavel;
    private CapoRegime CapoRegime;
    private double rentabilidade;
    

    //Constutor de negocio
    public Negocio(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade) {
        this.nome = nome;
        this.ValorBaseTributavel = ValorBaseTributavel;
        this.ProbPolicia = 0;
        this.Policiavel = Policiavel;
        this.CapoRegime = CapoRegime;
        this.rentabilidade = rentabilidade;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double aumento) {
        this.rentabilidade = aumento;
    }

    //Getters e setters necessários
    public String getNome() {
        return nome;
    }

    public double getValorBaseTributavel() {
        return ValorBaseTributavel;
    }

    public void setValorBaseTributavel(double NovoValorBase) {
        this.ValorBaseTributavel = NovoValorBase;
    }

    public boolean VerificaPoliciavel() {
        return Policiavel;
    }

    public int getProbPolicia() {
        return ProbPolicia;
    }

    public void setProbPolicia(int prob) {
        this.ProbPolicia = prob;
    }

    //Probabilidade da policia agir caso haja um informador no negócio
    public void ProbComInformador(int aumento) {
        ProbPolicia += aumento;
    }

    //Probabilidade do negocio ser atuado pela policia
    public void PoliciaAtuar() {
        if (VerificaPoliciavel() == true) {
            Random rand = new Random();
            int policia = rand.nextInt(61) + 20;//valor entre 20 e 80 (inclusive ambos)
            setProbPolicia(policia);
        }
    }

    public double VerificaInteligencia() {
        double media = 0;
        double soma = 0;
        for (int i = 0; i < CapoRegime.getSoldiers().size(); i++) {
            soma += CapoRegime.getSoldiers().get(i).getInteligencia();
        }
        media = soma / CapoRegime.getSoldiers().size();
        return media;
    }

    public double VerificaMusculo() {
        double media = 0;
        double soma = 0;
        for (int i = 0; i < CapoRegime.getSoldiers().size(); i++) {
            soma += CapoRegime.getSoldiers().get(i).getMusculo();
        }
        media = soma / CapoRegime.getSoldiers().size();
        return media;
    }
    
    @Override
    public String toString() {
        String texto;
        texto = "Nome do negocio: "+nome+"\n";
        texto += "Valor Base Tributavel:" + ValorBaseTributavel+"\n";
        texto += "Probabilidade da Policia:" + ProbPolicia+"\n";
        texto += "Policiavel:" + Policiavel+"\n";
        texto += "CapoRegime:" + CapoRegime.getNome()+"\n";
        texto += "Rentabilidade:" + rentabilidade+"\n";
        return texto;
    }
}
