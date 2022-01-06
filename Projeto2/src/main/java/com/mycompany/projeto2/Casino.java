package com.mycompany.projeto2;

public class Casino extends Negocio{
    private double rentabilidade;

    public Casino(double rentabilidade, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime) {
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
    public void AtualiazaRentabilidadeCasino(){
        if(VerificaInteligencia() >= 40){
            double novaRentabilidade= rentabilidade * 1.5;
            setRentabilidade(novaRentabilidade);
        }
        if(VerificaInteligencia() >= 70){
            double novaRentabilidade = rentabilidade * 2;
            setRentabilidade(novaRentabilidade);
        }
        if(VerificaInteligencia() >= 90){
            double novaRentabilidade = rentabilidade * 3;
            setRentabilidade(novaRentabilidade);
        }
    }
}