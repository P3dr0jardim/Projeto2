package com.mycompany.projeto2;

public abstract class Mafioso {

    //Variaveis de Instancia
    private String nome;
    private int ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso;
    private boolean estaPreso, linhagem;

//Construtores
// Construtor Mafioso
    public Mafioso(String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem) {
        this.nome = nome;
        this.lealdade = lealdade;
        this.musculo = musculo;
        this.inteligencia = inteligencia;
        this.estratega = estratega;
        this.carisma = carisma;
        this.probabilidaSerPreso = probabilidaSerPreso;
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

    public int getProbabilidaSerPreso() {
        return probabilidaSerPreso;
    }

    public void setProbabilidaSerPreso(int probabilidaSerPreso) {
        this.probabilidaSerPreso = probabilidaSerPreso;
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
        return "Nome do mafioso=" + nome + ", ccId=" + ccId + ", lealdade=" + lealdade + ", musculo=" + musculo + ", inteligencia=" + inteligencia + ", estratega=" + estratega + ", carisma=" + carisma + ", probabilidaSerPreso=" + probabilidaSerPreso + ", estaPreso=" + estaPreso + ", linhagem=" + linhagem + '}';
    }
}
