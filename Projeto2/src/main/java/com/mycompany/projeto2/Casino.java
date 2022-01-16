package com.mycompany.projeto2;

public class Casino extends Negocio {

    public Casino(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade, double ValorAtualTributavel, boolean Musculado, boolean Inteligente) {
        super(nome, ValorBaseTributavel, ProbPolicia, false, CapoRegime, rentabilidade, ValorAtualTributavel, false, true);
    }

    //Média do Musculo da equipa de Soldiers
    @Override
    public void AtualizaValoresNegocio() {
        if (VerificaInteligencia() >= 50 && VerificaInteligencia() < 70) {
            double novaRentabilidade = getRentabilidade() * 1.5;
            setRentabilidade(novaRentabilidade);
            setValorAtualTributavel(novaRentabilidade*0.15);
        } else if (VerificaInteligencia() >= 70 && VerificaInteligencia() < 90) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 5);
            setValorAtualTributavel(novaRentabilidade*0.2);
        } else if (VerificaInteligencia() >= 90) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 10);
            setValorAtualTributavel(novaRentabilidade*0.3);
        } else {
            setProbPolicia(getProbPolicia() + 15);
        }
    }
}
