package com.mycompany.projeto2;

import java.util.ArrayList;

public abstract class Negocio {

    private Familia familia;
    private String nome;
    private double ValorBaseTributavel, rentabilidade, ValorAtualTributavel = ValorBaseTributavel;
    private int ProbPolicia;
    private boolean Policiavel, Musculado, Inteligente;
    private CapoRegime CapoRegime;
    private RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
    private ArrayList<Associate> associates;

    //Constutor de negocio
    public Negocio(Familia familia, String nome, double ValorBaseTributavel, int ProbPolicia, boolean Policiavel, CapoRegime CapoRegime, double rentabilidade, double ValorAtualTributavel, boolean Musculado, boolean Inteligente) {
        this.familia = familia;
        this.nome = nome;
        this.ValorBaseTributavel = ValorBaseTributavel;
        this.ProbPolicia = ProbPolicia;
        this.Policiavel = Policiavel;
        this.CapoRegime = CapoRegime;
        this.rentabilidade = rentabilidade;
        this.ValorAtualTributavel = ValorAtualTributavel;
        this.Musculado = Musculado;
        this.Inteligente = Inteligente;
        associates = new ArrayList<Associate>();
    }

    //Metodo que cria associados para se enquadrarem nos negocios
    public void createAssociates() {
        int quantidadeDeAssociates = randomAtributesGenerator.generateRandomNumber();
        System.out.println("quantidadeDeAssociates " + quantidadeDeAssociates);
        for (int i = 0; i < quantidadeDeAssociates; i++) {
            associates.add(new Associate(familia, randomAtributesGenerator.generateRandomName("Associate"), 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false));
        }
        System.out.println("Associates Criados: " + associates);
    }

    //Método que retorna os associados
    public ArrayList<Associate> getAssociates() {
        return associates;
    }

    //Retorna a rentabilidade do negocio
    public double getRentabilidade() {
        return rentabilidade;
    }

    //Atribui um novo valor à rentabilidade
    public void setRentabilidade(double aumento) {
        this.rentabilidade = aumento;
    }

    //Retorna o caporegime associado ao negocio
    public CapoRegime getCapoRegime() {
        return CapoRegime;
    }

    //Retorna o valor atual tributavel do negócio
    public double getValorAtualTributavel() {
        return ValorAtualTributavel;
    }

    //Atribui um novo valor atual tributavel
    public void setValorAtualTributavel(double tributo) {
        this.ValorAtualTributavel += tributo;
    }

    //Retorna se o negocio é ou não Musculado
    public boolean isMusculado() {
        return Musculado;
    }

    //Retorna se o negocio é ou não Inteligente
    public boolean isInteligente() {
        return Inteligente;
    }

    //Retorna o nome do negocio
    public String getNome() {
        return nome;
    }

    //Retorna o valor base tributavel
    public double getValorBaseTributavel() {
        return ValorBaseTributavel;
    }

    //Atribui um novo valor base tributavel ao negocio
    public void setValorBaseTributavel(double NovoValorBase) {
        this.ValorBaseTributavel = NovoValorBase;
    }

    //Retorna se o negocio é ou não policiavel
    public boolean VerificaPoliciavel() {
        return Policiavel;
    }

    //Retorna a probabilidade da policia atuar
    public int getProbPolicia() {
        return ProbPolicia;
    }

    //Atribui um novo valor da probabilidade da policia atuar
    public void setProbPolicia(int prob) {
        this.ProbPolicia = prob;
    }

    //Metodo abstrato defenido em cada subclasse de negocio
    public abstract void AtualizaValoresNegocio();

    //Retorna um valor da média obtida da Inteligencia da equipa a atuar no negocio
    public double VerificaInteligencia() {
        double media = 0;
        double soma = 0;
        for (int i = 0; i < CapoRegime.getSoldiers().size(); i++) {
            soma += CapoRegime.getSoldiers().get(i).getInteligencia();
        }
        media = soma / CapoRegime.getSoldiers().size();
        return media;
    }

    //Retorna o valor médio do Musculo relativo à equipa associada ao negocio
    public double VerificaMusculo() {
        double media = 0;
        double soma = 0;
        for (int i = 0; i < CapoRegime.getSoldiers().size(); i++) {
            soma += CapoRegime.getSoldiers().get(i).getMusculo();
        }
        media = soma / CapoRegime.getSoldiers().size();
        return media;
    }

    @Override
    public String toString() {
        String texto;
        texto = "Nome do negocio: " + nome + "\n";
        texto += "Valor Base Tributavel: " + ValorBaseTributavel + "\n";
        texto += "Probabilidade da Policia: " + ProbPolicia + "\n";
        texto += "Policiavel: " + Policiavel + "\n";
        texto += "CapoRegime: " + CapoRegime.getNome() + "\n";
        texto += "Rentabilidade: " + rentabilidade + "\n";
        return texto;
    }
}
