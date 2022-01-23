package com.mycompany.projeto2;

public abstract class Pessoa {
    //Variaveis de Instancia

    private Familia familia;
    private String nome;
    private int ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso = 0;
    private boolean estaPreso, linhagem, informador;
    
    public Pessoa(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        this.familia = familia;
        this.nome = nome;
        this.ccId = ccId;
        this.lealdade = lealdade;
        this.musculo = musculo;
        this.inteligencia = inteligencia;
        this.estratega = estratega;
        this.carisma = carisma;
        this.probabilidadeSerPreso = probabilidadeSerPreso;
        this.carisma = carisma;
        this.estaPreso = estaPreso;
        this.linhagem = linhagem;
        this.informador=informador;
    }
    
    
//Getters e setters necessários para a classe
    public Familia getFamilia() {
        return familia;
    }

    public String getNome() {
        return nome;
    }

    public int getCcId() {
        return ccId;
    }

    public int getLealdade() {
        return lealdade;
    }

    public int getMusculo() {
        return musculo;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getEstratega() {
        return estratega;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getProbabilidadeSerPreso() {
        return probabilidadeSerPreso;
    }

    public void setEstaPreso(boolean estaPreso) {
        this.estaPreso = estaPreso;
    }
    
    public boolean isInformador(){
        return informador;
    }
    
    public void setInformador(boolean informador){
        this.informador=informador;
    }

    @Override
    public String toString() {
        String texto;
        texto = "Nome: " + nome + "\n";
        texto += "ccId:" + ccId + "\n";
        texto += "Lealdade:" + lealdade + "\n";
        texto += "Musculo:" + musculo + "\n";
        texto += "Inteligencia:" + inteligencia + "\n";
        texto += "Estratega:" + estratega + "\n";
        texto += "Carisma:" + carisma + "\n";
        texto += "ProbabilidadeSerPreso:" + probabilidadeSerPreso + "\n";
        texto += "EstaPreso:" + estaPreso + "\n";
        texto += "Linhagem:" + linhagem + "\n";
        texto += "Informador: " + informador + "\n";
        return texto;
    }
}
