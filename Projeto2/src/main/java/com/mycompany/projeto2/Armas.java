package com.mycompany.projeto2;

public class Armas extends Negocio{

    public Armas(String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade) {
        super(nome, ValorBaseTributavel, ProbPolicia, Policiavel, CapoRegime, rentabilidade);
    }
    
    //Média do Musculo da equipa de Soldiers
    public void AtualizaRentabilidadeArmas(){
        if(VerificaMusculo() >= 55){
            double novaRentabilidade= getRentabilidade() * 1.5;
            setRentabilidade(novaRentabilidade);
        }
        if(VerificaMusculo() >= 75){
            double novaRentabilidade = getRentabilidade() * 2;
            setRentabilidade(novaRentabilidade);
        }
    }
    
}
