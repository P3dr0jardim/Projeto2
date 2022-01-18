package com.mycompany.projeto2;

public class Associate extends Pessoa {
//Construtores
// Construtor Mafioso

    public Associate(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso, estaPreso, false, false);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}