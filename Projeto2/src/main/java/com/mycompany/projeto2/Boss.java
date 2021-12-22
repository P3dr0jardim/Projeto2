package com.mycompany.projeto2;

public class Boss extends Mafioso {

    private boolean consiglieri = false;

    public Boss(String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem) {
        super(nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, linhagem);
    }

    public void RecrutaSoldier() {
        //Codigo para recrutar um soldier 
        Soldier soldier = new Soldier("Pedro", 100, 50, 20, 10, 70, 80, 10, false, true);

        System.out.println("O soldier foi criado com os dados:" + soldier.toString());
    }

    public void RecrutaCapoRegime() {
        //Codigo para recrutar um CapoRegime 
        CapoRegime capoRegime = new CapoRegime("Joao", 100, 50, 20, 10, 70, 80, 10, false, true);
        System.out.println("O capoRegime foi criado com os dados:" + capoRegime.toString());
    }

    public void RecrutaUnderboss() {
        //Codigo para recrutar um Underboss 
        Underboss underboss = new Underboss("Antonio", 100, 50, 20, 10, 70, 80, 10, false, true);
        System.out.println("O underboss foi criado com os dados:" + underboss.toString());
    }

    public void NomearConsiglieri() {
        //Codigo para nomear um consiglieri 
        consiglieri = true;
        Consiglieri consiglieri = new Consiglieri("Marcelo", 100, 50, 20, 10, 70, 80, 10, false, true);
        System.out.println("O consiglieri foi criado com os dados:" + consiglieri.toString());
    }

    public String temConsiglieri() {
        if (consiglieri) {
            return "O chefe da mafia " + getNome() + " tem um consiglieri";

        } else {
            return "O chefe da mafia " + getNome() + " não tem um consiglieri";
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
