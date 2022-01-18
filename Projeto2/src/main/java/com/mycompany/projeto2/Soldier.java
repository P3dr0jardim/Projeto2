package com.mycompany.projeto2;

public class Soldier extends Mafioso {

    public Soldier(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso, estaPreso, true, informador);

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
