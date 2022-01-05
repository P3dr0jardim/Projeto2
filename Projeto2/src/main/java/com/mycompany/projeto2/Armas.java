package com.mycompany.projeto2;

public class Armas extends Negocio{
    private double rentabilidade;
    private CapoRegime CapoRegime;

    public Armas(double rentabilidade, CapoRegime Caporegime, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel);
        this.rentabilidade = rentabilidade;
        this.CapoRegime = CapoRegime;
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double aumento) {
        this.rentabilidade = aumento;
    }
    
    //Média do Musculo da equipa de Soldiers
    public void VerificaMusculo(){
        double media = 0;
        double soma = 0;
        for(int i=0;i<CapoRegime.getSoldiers().size();i++){ 
            soma += CapoRegime.getSoldiers().get(i).getMusculo();
        }
        media = soma/CapoRegime.getSoldiers().size();
        if(media >= 55){
            double novaRentabilidade= rentabilidade * 1.5;
            setRentabilidade(novaRentabilidade);
        }
        if(media >= 75){
            double novaRentabilidade = rentabilidade * 2;
            setRentabilidade(novaRentabilidade);
        }
    }
    
}
