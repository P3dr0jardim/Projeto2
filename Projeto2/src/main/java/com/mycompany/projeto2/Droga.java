package com.mycompany.projeto2;


public class Droga extends Negocio{
    private double rentabilidade;
    private CapoRegime CapoRegime;

    public Droga(double rentabilidade, CapoRegime Caporegime, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel) {
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
        for(int i=0;i<CapoRegime.getSoldiers().size();i++){ 
            media += CapoRegime.getSoldiers().get(i).getMusculo();
        }
        if(media/CapoRegime.getSoldiers().size() >= 70){
            double novaRentabilidade= rentabilidade * 2;
            setRentabilidade(novaRentabilidade);
        }
        if(media/CapoRegime.getSoldiers().size() >= 85){
            double novaRentabilidade = rentabilidade * 3;
            setRentabilidade(novaRentabilidade);
        }
    }
    
}
