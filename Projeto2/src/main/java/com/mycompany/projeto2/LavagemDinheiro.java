package com.mycompany.projeto2;

public class LavagemDinheiro extends Negocio {

    public LavagemDinheiro(CapoRegime Caporegime, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime, rentabilidade);
    }

    //Média do Musculo da equipa de Soldiers
    public void AtualizaValoresLavagem() {
        if (VerificaInteligencia() >= 50 && VerificaInteligencia() < 70) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
        }
        if (VerificaInteligencia() >= 70 && VerificaInteligencia() < 90 ) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia()-5);
        }
        else if (VerificaInteligencia() >= 90) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia()-10);
        }
        else
            setProbPolicia(getProbPolicia()+15);
    }

}
