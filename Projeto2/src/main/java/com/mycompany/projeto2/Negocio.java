package com.mycompany.projeto2;

public abstract class Negocio {

    private String nome;
    private double ValorBaseTributavel, rentabilidade, ValorAtualTributavel=ValorBaseTributavel;
    private int ProbPolicia;
    private boolean Policiavel, Musculado, Inteligente;
    private CapoRegime CapoRegime;

    //Constutor de negocio
    public Negocio(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade, double ValorAtualTributavel, boolean Musculado, boolean Inteligente) {
        this.nome = nome;
        this.ValorBaseTributavel = ValorBaseTributavel;
        this.ProbPolicia = ProbPolicia;
        this.Policiavel = Policiavel;
        this.CapoRegime = CapoRegime;
        this.rentabilidade = rentabilidade;
        this.ValorAtualTributavel=ValorAtualTributavel;
        this.Musculado=Musculado;
        this.Inteligente=Inteligente;   
    }

    //Getters e setters necessários
    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double aumento) {
        this.rentabilidade = aumento;
    }

    public CapoRegime getCapoRegime() {
        return CapoRegime;
    }

    public double getValorAtualTributavel() {
        return ValorAtualTributavel;
    }

    public void setValorAtualTributavel(double tributo) {
        this.ValorAtualTributavel += tributo;
    }

    public boolean isMusculado() {
        return Musculado;
    }

    public boolean isInteligente() {
        return Inteligente;
    }

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
    
    //Metodo abstrato defenido em cada subclasse de negocio
    public abstract void AtualizaValoresNegocio();

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
        texto = "Nome do negocio: " + nome + "\n";
        texto += "Valor Base Tributavel:" + ValorBaseTributavel + "\n";
        texto += "Probabilidade da Policia:" + ProbPolicia + "\n";
        texto += "Policiavel:" + Policiavel + "\n";
        texto += "CapoRegime:" + CapoRegime.getNome() + "\n";
        texto += "Rentabilidade:" + rentabilidade + "\n";
        return texto;
    }
}
