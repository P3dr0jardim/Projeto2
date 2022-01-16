package com.mycompany.projeto2;

public class Armas extends Negocio implements Policiavel{

    public Armas(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade, double ValorAtualTributavel, boolean Musculado, boolean Inteligente) {
        super(nome, ValorBaseTributavel, ProbPolicia, true, CapoRegime, rentabilidade, ValorAtualTributavel, true, false);
    }
    
    //Média do Musculo da equipa de Soldiers
    @Override
    public void AtualizaValoresNegocio(){
        if(VerificaMusculo() >= 50 && VerificaMusculo() < 70){
            double novaRentabilidade= getRentabilidade() * 1.5;
            setRentabilidade(novaRentabilidade);
            setValorAtualTributavel(novaRentabilidade*0.15);
            policiarNegocio();
        }
        else if(VerificaMusculo() >= 70 && VerificaMusculo() < 90){
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia()-5);
            setValorAtualTributavel(novaRentabilidade*0.2);
            policiarNegocio();
        }
        else if(VerificaMusculo() >= 95){
            double novaRentabilidade = getRentabilidade() * 3;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia()-10);
            setValorAtualTributavel(novaRentabilidade*0.3);
            policiarNegocio();
        }
        else{
            setProbPolicia(getProbPolicia()+10);
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
                    Prisao prisao = new Prisao();
                    prisao.addPreso(getCapoRegime().getSoldiers().get(i));
                    System.out.println("O "+ getCapoRegime().getSoldiers().get(i).getNome() + "foi preso!");
                }
            }
        }
    }
}