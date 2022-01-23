package com.mycompany.projeto2;

import java.util.ArrayList;

public class Underboss extends Mafioso {

    private ArrayList<Soldier> soldiers;
    private ArrayList<CapoRegime> capoRegimes;
    private Soldier soldier, traidorSoldier, MelhorSoldier;
    private CapoRegime capoRegime, traidorCapoRegime;

    public Underboss(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso, estaPreso, true, false);
        soldiers = new ArrayList<Soldier>();
        capoRegimes = new ArrayList<CapoRegime>();
    }
    
    //Loyalty test sendo que caso seja adicionado alguem ao obituario deve ser feito um suposto pagamento aos familiares deste sendo entao retirado um certo valor à riqueza da familia dos mafiosos
    public void loyaltyTest(Familia familia) {

        soldiers = familia.getSoldiers();
        capoRegimes = familia.getCapoRegimes();

        for (int i = 0; i < soldiers.size(); i++) {
            soldier = soldiers.get(i);
            if (soldier.getLealdade() < 20 || soldier.isInformador() == true) {
                traidorSoldier = soldiers.get(i);
                System.out.println("TraidorSoldier = " + traidorSoldier.getNome());
                familia.removeSoldier(traidorSoldier.getNome());
                familia.addFamiliarObituario(traidorSoldier);
                System.out.println("O soldier " + traidorSoldier.getNome() + " foi removido da familia");
                familia.setRiqueza(familia.getRiqueza() * 0.97); //pagamento aos tais familiares do que sofreu "desaparecimento misterioso"
            }
        }

        for (int i = 0; i < capoRegimes.size(); i++) {
            capoRegime = capoRegimes.get(i);
            if (capoRegime.getLealdade() < 20) {
                traidorCapoRegime = capoRegimes.get(i);
                System.out.println("TraidorCapo = " + traidorCapoRegime.getNome());
                familia.removeCapoRegime(traidorCapoRegime.getNome());
                familia.addFamiliarObituario(traidorCapoRegime);
                System.out.println("O capoRegime " + traidorCapoRegime.getNome() + " foi removido da familia");
                familia.setRiqueza(familia.getRiqueza() * 0.97); //pagamento aos tais familiares do que sofreu "desaparecimento misterioso"
            }
        }

        if (traidorSoldier == null && traidorCapoRegime == null) {
            System.out.println("Não existe triadores!");
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
