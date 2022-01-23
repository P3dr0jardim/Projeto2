package com.mycompany.projeto2;

import java.util.ArrayList;

public class Droga extends Negocio implements Policiavel {
    private ArrayList<Associate> associatesDrogas;
    private RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
    private Familia familia;
    
    public Droga(Familia familia, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade, double ValorAtualTributavel, boolean Musculado, boolean Inteligente) {
        super(familia, nome, ValorBaseTributavel, ProbPolicia, true, CapoRegime, rentabilidade, ValorAtualTributavel, true, false);
        this.familia = familia;
        associatesDrogas = new ArrayList<Associate>();
        this.createAssociates();
    }
    
    @Override
    public void createAssociates() {
        int quantidadeDeAssociates = randomAtributesGenerator.generateRandomNumber();
        System.out.println("quantidadeDeAssociates " + quantidadeDeAssociates);
        for (int i = 0; i < quantidadeDeAssociates; i++) {
            associatesDrogas.add(new Associate(familia, randomAtributesGenerator.generateRandomName("Associate"), 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false));
        }
        System.out.println("Associates Criados: " + associatesDrogas);
    }

    //Média do Musculo da equipa de Soldiers
    @Override
        public void AtualizaValoresNegocio() {
        if (VerificaMusculo() >= 50 && VerificaMusculo() < 70) {
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
            setValorAtualTributavel(novaRentabilidade*0.2);
            policiarNegocio();
        } else if (VerificaMusculo() >= 70 && VerificaMusculo() < 90) {
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 5);
            setValorAtualTributavel(novaRentabilidade*0.3);
            policiarNegocio();
        } else if (VerificaMusculo() >= 90) {
            double novaRentabilidade = getRentabilidade() * 4;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia() - 10);
            setValorAtualTributavel(novaRentabilidade*0.4);
            policiarNegocio();
        } else {
            setProbPolicia(getProbPolicia() + 15);
            policiarNegocio();
        }
    }
    
    @Override
    public void policiarNegocio(){
        RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
        int atuar = randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar();
        int prender = randomAtributesGenerator.generateProbabilidadeSerPreso();
        if(atuar <= getProbPolicia()){
            System.out.println("A policia está a atuar no negocio.");
            for (int i =0; i < getCapoRegime().getSoldiers().size(); i++){
                if ( getCapoRegime().getSoldiers().get(i).getLealdade() < 15 ){
                    getCapoRegime().getSoldiers().get(i).setInformador(true);
                }
                else if (prender <= getCapoRegime().getSoldiers().get(i).getProbabilidadeSerPreso()){
                    familia.addPreso(getCapoRegime().getSoldiers().get(i));
                    System.out.println("O "+ getCapoRegime().getSoldiers().get(i).getNome() + "foi preso!");
                    getCapoRegime().getSoldiers().get(i).setEstaPreso(true);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        String texto;
        texto = "Associates Drogas: " + "\n";
        for (Associate associate : associatesDrogas) {
            texto += "Associate: " + associate.getNome() + "\n";
        };
        return super.toString() + texto;
    }

}
