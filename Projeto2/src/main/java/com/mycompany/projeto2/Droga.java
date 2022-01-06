package com.mycompany.projeto2;

public class Droga extends Negocio{
    private double rentabilidade;

    public Droga(double rentabilidade, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime);
        this.rentabilidade = rentabilidade;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double aumento) {
        this.rentabilidade = aumento;
    }
    
    //Média do Musculo da equipa de Soldiers
    public void AtualizaRentabilidadeDroga(){
        if(VerificaMusculo() >= 70){
            double novaRentabilidade= rentabilidade * 2;
            setRentabilidade(novaRentabilidade);
        }
        if(VerificaMusculo() >= 85){
            double novaRentabilidade = rentabilidade * 3;
            setRentabilidade(novaRentabilidade);
        }
    }
    
}
