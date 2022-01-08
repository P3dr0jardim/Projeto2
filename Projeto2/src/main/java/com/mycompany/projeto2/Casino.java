package com.mycompany.projeto2;

public class Casino extends Negocio {

    public Casino(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime, rentabilidade);
    }

    //Média do Musculo da equipa de Soldiers
    public void AtualiazaRentabilidadeCasino() {
        if (VerificaInteligencia() >= 40) {
            double novaRentabilidade = getRentabilidade() * 1.5;
            setRentabilidade(novaRentabilidade);
        }
        if (VerificaInteligencia() >= 70) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
        }
        if (VerificaInteligencia() >= 90) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
        }
    }
}
