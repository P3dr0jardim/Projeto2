package com.mycompany.projeto2;

import java.util.ArrayList;

public class LavagemDinheiro extends Negocio implements Policiavel {

    private ArrayList<Associate> associatesLavagemDeDinheiro;
    private RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
    private Familia familia;

    public LavagemDinheiro(Familia familia, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade, double ValorAtualTributavel, boolean Musculado, boolean Inteligente) {
        super(familia, nome, ValorBaseTributavel, ProbPolicia, true, CapoRegime, rentabilidade, ValorAtualTributavel, false, true);
        this.familia = familia;
        associatesLavagemDeDinheiro = new ArrayList<Associate>();
        this.createAssociates();
    }

    @Override
    public void createAssociates() {
        int quantidadeDeAssociates = randomAtributesGenerator.generateRandomNumber();
        System.out.println("quantidadeDeAssociates " + quantidadeDeAssociates);
        for (int i = 0; i < quantidadeDeAssociates; i++) {
            associatesLavagemDeDinheiro.add(new Associate(familia, randomAtributesGenerator.generateRandomName("Associate"), 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false));
        }
        System.out.println("Associates Criados: " + associatesLavagemDeDinheiro);
    }

    //Média do Musculo da equipa de Soldiers
    @Override
    public void AtualizaValoresNegocio() {
        if (VerificaInteligencia() >= 50 && VerificaInteligencia() < 70) {
            double novaRentabilidade = getRentabilidade() * 1.5;
            setRentabilidade(novaRentabilidade);
            setValorAtualTributavel(novaRentabilidade * 0.15);
        }
        if (VerificaInteligencia() >= 70 && VerificaInteligencia() < 90) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 5);
            setValorAtualTributavel(novaRentabilidade * 0.2);
        } else if (VerificaInteligencia() >= 90) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 10);
            setValorAtualTributavel(novaRentabilidade * 0.3);
        } else {
            setProbPolicia(getProbPolicia() + 15);
        }
    }

    @Override
    public void policiarNegocio() {
    }

    @Override
    public String toString() {
        String texto;
        texto = "Associates Lavagem Dinheiro: " + "\n";
        for (Associate associate : associatesLavagemDeDinheiro) {
            texto += "Associate: " + associate.getNome() + "\n";
        };
        return super.toString() + texto;
    }

}
