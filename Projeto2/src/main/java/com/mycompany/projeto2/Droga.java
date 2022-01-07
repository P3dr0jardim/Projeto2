package com.mycompany.projeto2;

public class Droga extends Negocio {

    public Droga(double rentabilidade, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime, rentabilidade);
    }

    //Média do Musculo da equipa de Soldiers
    public void AtualizaRentabilidadeDroga() {
        if (VerificaMusculo() >= 70) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
        }
        if (VerificaMusculo() >= 85) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
        }
    }

}
