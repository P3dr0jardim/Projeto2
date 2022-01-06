package com.mycompany.projeto2;

import java.util.ArrayList;

public class Underboss extends Mafioso {

    private ArrayList<Soldier> soldiers;
    private ArrayList<CapoRegime> capoRegimes;
    private Soldier soldier, traidorSoldier;
    private CapoRegime capoRegime, traidorCapoRegime;
    public Underboss(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, linhagem);
        soldiers = new ArrayList<Soldier>();
        capoRegimes = new ArrayList<CapoRegime>();
    }

    public void loyaltyTest(Familia familia) {

        soldiers = familia.getSoldiers();
        capoRegimes = familia.getCapoRegimes();

        for (int i = 0; i < soldiers.size(); i++) {
            soldier = soldiers.get(i);
            if (soldier.getLealdade() < 20) {
                traidorSoldier = soldiers.get(i);
                System.out.println("TraidorSoldier = " + traidorSoldier.getNome());
                familia.removeSoldier(traidorSoldier.getNome());
                familia.addFamiliarObituario(traidorSoldier);
                System.out.println("O soldier " + traidorSoldier.getNome() + " foi removido da familia");
            }
        }

        for (int i = 0; i < capoRegimes.size(); i++) {
            capoRegime = capoRegimes.get(i);
            if (capoRegime.getLealdade() < 20) {
                traidorCapoRegime = capoRegimes.get(i);
                System.out.println("TraidorCapo = " + traidorCapoRegime.getNome());
                
            }
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
