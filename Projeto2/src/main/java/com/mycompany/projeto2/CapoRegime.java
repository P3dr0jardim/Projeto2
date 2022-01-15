package com.mycompany.projeto2;

import java.util.ArrayList;

public class CapoRegime extends Mafioso {

    private ArrayList<Soldier> soldiers;
    private ArrayList<Negocio> negocios;

    public CapoRegime(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, true, informador);
        soldiers = new ArrayList<Soldier>();
        negocios = new ArrayList<Negocio>();
    }

    public ArrayList<Negocio> getNegocios() {
        return negocios;
    }

    public void setNegocios(ArrayList<Negocio> negocios) {
        this.negocios = negocios;
    }

    //Método que adiciona um negocio à lista dos soldiers associados ao capoRegime
    public void addNegocio(Negocio negocio) {
        negocios.add(negocio);
    }

    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(ArrayList<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    //Método que adiciona um soldier à lista dos soldiers associados ao capoRegime
    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public String capoRegimeTeam() {
        String texto;
        texto = "A equipa do capoRegime " + getNome() + " é " + getSoldiers();
        return texto;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
