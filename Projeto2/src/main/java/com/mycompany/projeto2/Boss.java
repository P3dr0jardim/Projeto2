package com.mycompany.projeto2;

public class Boss extends Mafioso {

    private boolean consiglieri = false;
    private Familia familia;
    private CapoRegime equipaDoCapoRegime;
    private RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator(); 
    public Boss(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, linhagem);
        this.familia = familia;
    }
    
    public void RecrutaSoldier(String nome, int capoRegime) {
        //Codigo para recrutar um soldier 
        
        System.out.println("randomAtributesGenerator " + randomAtributesGenerator.generateRandomLealdade());
        
        familia.addSoldier(new Soldier(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true));
        
        equipaDoCapoRegime = familia.getCapoRegime(capoRegime);
        
        equipaDoCapoRegime.addSoldier(new Soldier(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true));
        
        System.out.println("Familia do soldier " + familia.getNome());
        
        System.out.println(equipaDoCapoRegime.capoRegimeTeam());
        
        System.out.println("Atualmente existem: " + familia.getSoldiers().size());
    }

    public void RecrutaCapoRegime(String nome) {
        //Codigo para recrutar um CapoRegime 
        
        familia.addCapoRegime(new CapoRegime(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true));
        
        System.out.println("Familia do capoRegime " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getCapoRegime().size());
    }

    public void RecrutaUnderboss(String nome) {
        //Codigo para recrutar um Underboss 
        familia.addUnderboss(new Underboss(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true));
        
        System.out.println("Familia do capoRegime " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getUnderBoss().size());
    }

    public void NomearConsiglieri(String nome) {
        //Codigo para nomear um consiglieri 
        consiglieri = true;
        
        familia.addConsiglieri(new Consiglieri(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true));
        System.out.println("Familia do consiglieri " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getConsiglieri().size());
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
