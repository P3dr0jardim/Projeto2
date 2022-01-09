package com.mycompany.projeto2;

public class Armas extends Negocio{

    public Armas(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime, rentabilidade);
    }
    
    //Média do Musculo da equipa de Soldiers
    public void AtualizaValoresArmas(){
        if(VerificaMusculo() >= 50 && VerificaMusculo() < 70){
            double novaRentabilidade= getRentabilidade() * 1.5;
            setRentabilidade(novaRentabilidade);
        }
        else if(VerificaMusculo() >= 70 && VerificaMusculo() < 90){
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia()-5);
        }
        else if(VerificaMusculo() >= 95){
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
            setProbPolicia(getProbPolicia()-10);
        }
        else
            setProbPolicia(getProbPolicia()+10);
    }
    
}
