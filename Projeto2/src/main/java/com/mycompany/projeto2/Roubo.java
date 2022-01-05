package com.mycompany.projeto2;

public class Roubo extends Negocio{
    private double rentabilidade;
    private CapoRegime CapoRegime;

    public Roubo(double rentabilidade, CapoRegime Caporegime, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel) {
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
    public void VerificaMusculoEInteligencia(){
        double mediaMusculo = 0;
        double mediaInteligencia = 0;
        double somaMusculo = 0; 
        double somaInteligencia = 0;
        for(int i=0;i<CapoRegime.getSoldiers().size();i++){ 
            somaMusculo += CapoRegime.getSoldiers().get(i).getMusculo();
            somaInteligencia += CapoRegime.getSoldiers().get(i).getInteligencia();
        }
        mediaMusculo = somaMusculo/CapoRegime.getSoldiers().size();
        mediaInteligencia = somaInteligencia/CapoRegime.getSoldiers().size();
        if(mediaMusculo >= 50 && mediaInteligencia >= 50){
            double novaRentabilidade= rentabilidade * 2;
            setRentabilidade(novaRentabilidade);
        }
        if(mediaMusculo >= 75 && mediaInteligencia >= 75){
            double novaRentabilidade = rentabilidade * 3;
            setRentabilidade(novaRentabilidade);
        }
    }
    
}
