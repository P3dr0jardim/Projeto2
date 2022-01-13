package com.mycompany.projeto2;

public class Roubo extends Negocio {

    public Roubo(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime, rentabilidade);
    }

    //Média do Musculo da equipa de Soldiers
    public void AtualizaValoresRoubo() {
        if ((VerificaMusculo() >= 50 && VerificaMusculo() < 70) && (VerificaInteligencia() >= 50 && VerificaInteligencia() < 70)) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
        } else if ((VerificaMusculo() >= 70 && VerificaMusculo() < 90) && (VerificaInteligencia() >= 70) && VerificaInteligencia() < 90) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 5);
        } else if (VerificaMusculo() >= 90 && VerificaInteligencia() >= 90) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 15);
        } else {
            setProbPolicia(getProbPolicia() + 15);
        }
    }

}
