package com.mycompany.projeto2;

public class Roubo extends Negocio {

    public Roubo(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime, rentabilidade);
    }

    //Média do Musculo da equipa de Soldiers
    public void AtualizaRentabilidadeRoubo() {
        if (VerificaMusculo() >= 50 && VerificaInteligencia() >= 50) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
        }
        if (VerificaMusculo() >= 75 && VerificaInteligencia() >= 75) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
        }
    }

}
