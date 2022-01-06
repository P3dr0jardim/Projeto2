package com.mycompany.projeto2;

public class Armas extends Negocio{
    private double rentabilidade;

    public Armas(double rentabilidade, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime) {
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
    public void AtualizaRentabilidadeArmas(){
        if(VerificaMusculo() >= 55){
            double novaRentabilidade= rentabilidade * 1.5;
            setRentabilidade(novaRentabilidade);
        }
        if(VerificaMusculo() >= 75){
            double novaRentabilidade = rentabilidade * 2;
            setRentabilidade(novaRentabilidade);
        }
    }
    
}
