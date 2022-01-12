package com.mycompany.projeto2;

public abstract class Mafioso {

    //Variaveis de Instancia
    private Familia familia;
    private String nome;
    private int ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso = 0;
    private boolean estaPreso, linhagem;

//Construtores
// Construtor Mafioso
    public Mafioso(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem) {
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
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCcId() {
        return ccId;
    }

    public void setCcId(int ccId) {
        this.ccId = ccId;
    }

    public int getLealdade() {
        return lealdade;
    }

    public void setLealdade(int lealdade) {
        this.lealdade = lealdade;
    }

    public int getMusculo() {
        return musculo;
    }

    public void setMusculo(int musculo) {
        this.musculo = musculo;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getEstratega() {
        return estratega;
    }

    public void setEstratega(int estratega) {
        this.estratega = estratega;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getProbabilidadeSerPreso() {
        return probabilidadeSerPreso;
    }

    public void setProbabilidadeSerPreso(int probabilidadeSerPreso) {
        this.probabilidadeSerPreso = probabilidadeSerPreso;
    }

    public boolean isEstaPreso() {
        return estaPreso;
    }

    public void setEstaPreso(boolean estaPreso) {
        this.estaPreso = estaPreso;
    }

    public boolean isLinhagem() {
        return linhagem;
    }

    public void setLinhagem(boolean linhagem) {
        this.linhagem = linhagem;
    }
    
    @Override
    public String toString() {
        String texto;
        texto = "Nome do mafioso: "+nome+"\n";
        texto += "ccId:" + ccId+"\n";
        texto += "Lealdade:" + lealdade+"\n";
        texto += "Musculo:" + musculo+"\n";
        texto += "Inteligencia:" + inteligencia+"\n";
        texto += "Estratega:" + estratega+"\n";
        texto += "Carisma:" + carisma+"\n";
        texto += "ProbabilidadeSerPreso:" + probabilidadeSerPreso+"\n";
        texto += "EstaPreso:" + estaPreso+"\n";
        texto += "Linhagem:" + linhagem+"\n";
        return texto;
    }
}
