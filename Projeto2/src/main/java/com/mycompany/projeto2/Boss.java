package com.mycompany.projeto2;

public class Boss extends Mafioso {

    private boolean consiglieri = false;
    private Familia familia;

    public Boss(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, linhagem);
        this.familia = familia;
    }

    public void RecrutaSoldier(String nome) {
        //Codigo para recrutar um soldier 
        familia.addSoldier(new Soldier(familia, nome, 10, 50, 20, 10, 70, 80, 10, false, true));
           
        System.out.println("Familia do soldier " + familia.getNome());
        
        System.out.println("Sodliers: " + familia.getSoldiers());
        System.out.println("Atualmente existem: " + familia.getSoldiers().size());
    }

    public void RecrutaCapoRegime() {
        //Codigo para recrutar um CapoRegime 
        CapoRegime capoRegime = new CapoRegime(familia, "Joao", 100, 50, 20, 10, 70, 80, 10, false, true);
        System.out.println("O capoRegime foi criado com os dados:" + capoRegime.toString());
    }

    public void RecrutaUnderboss() {
        //Codigo para recrutar um Underboss 
        Underboss underboss = new Underboss(familia, "Antonio", 100, 50, 20, 10, 70, 80, 10, false, true);
        System.out.println("O underboss foi criado com os dados:" + underboss.toString());
    }

    public void NomearConsiglieri() {
        //Codigo para nomear um consiglieri 
        consiglieri = true;
        Consiglieri consiglieri = new Consiglieri(familia, "Marcelo", 100, 50, 20, 10, 70, 80, 10, false, true);
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
