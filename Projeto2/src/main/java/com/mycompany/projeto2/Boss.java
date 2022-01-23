package com.mycompany.projeto2;

public class Boss extends Mafioso {

    private boolean hasConsiglieri = false;
    private Familia familia;
    private Familia familiaPartilhada;
    private CapoRegime capoRegime;
    private RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
    private int quantidadeDeNegocios, randomNumber;
    private Negocio negocioPartilhado;

    public Boss(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso, estaPreso, true, false);
        this.familia = familia;
    }

    //Recruta alguém para ser Soldier da família
    public void RecrutaSoldier(String nome, CapoRegime capoRegime) {
        //Codigo para recrutar um soldier 
        Soldier soldier = new Soldier(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), randomAtributesGenerator.generateProbabilidadeSerPreso(), false, true, false);
        familia.addSoldier(soldier);
        capoRegime.addSoldier(soldier);
        
        System.out.println("Familia do soldier " + familia.getNome());

        System.out.println(capoRegime.capoRegimeTeam());

        System.out.println("Atualmente existem: " + familia.getSoldiers().size());
    }

    public Familia getFamiliaPartilhada() {
        return familiaPartilhada;
    }

    public void setFamiliaPartilhada(Familia familiaPartilhada) {
        this.familiaPartilhada = familiaPartilhada;
    }

    //Recruta alguém para o cargo de CapoRegime
    public void RecrutaCapoRegime(String nome) {
        //Codigo para recrutar um CapoRegime 
        familia.addCapoRegime(new CapoRegime(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        System.out.println("Familia do capoRegime " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getCapoRegimes().size());
    }
    
    //Recruta alguém para o cargo de underboss
    public void RecrutaUnderboss(String nome) {
        //Codigo para recrutar um Underboss 
        Underboss underboss = new Underboss(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false);

        System.out.println("Familia do underboss " + familia.getNome());
        familia.setUnderboss(underboss);
        
    }
    
    //Vai nomear alguém para o cargo de consiglieri
    public void NomearConsiglieri(String nome) {
        //Codigo para nomear um consiglieri 
        hasConsiglieri = true;

        Consiglieri consiglieri = new Consiglieri(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false);
        System.out.println("Familia do consiglieri" + familia.getNome());
        System.out.println("Consiglieri anterior: " + familia.getConsiglieri());
        familia.setConsiglieri(consiglieri);
        System.out.println("Consiglieri atual: " + familia.getConsiglieri());
    
    }
    
    //Método que vai gerar consoante o carisma do boss um certo valor de negocio para o caporegime associado
    public void geraNegocio(CapoRegime capoRegime, Config config) {
        if (getCarisma() >= 80) {
            quantidadeDeNegocios = 5;
        } else if (getCarisma() >= 50 && getCarisma() < 80) {
            quantidadeDeNegocios = 3;
        } else if (getCarisma() < 50) {
            quantidadeDeNegocios = 1;
        }

        if (randomAtributesGenerator.generateProbabilidadeDeSerPartilhado() >= 1) {
            int familiaIndex = randomAtributesGenerator.generateRandomIndex(config.getFamilias().size());
            if (config.getFamilia(familiaIndex) == null) {
                familiaPartilhada = null;
            } else {
                familiaPartilhada = config.getFamilia(familiaIndex);
                if (familiaPartilhada.getNegocios().size() == 0) {
                    negocioPartilhado = null;
                } else {
                    negocioPartilhado = familiaPartilhada.getNegocio(null, randomAtributesGenerator.generateRandomIndex(familiaPartilhada.getNegocios().size()), false);
                }
            }
        }

        if (familiaPartilhada != null && negocioPartilhado != null) {
            familia.addNegocio(negocioPartilhado);
            capoRegime.addNegocio(negocioPartilhado);
        }

        System.out.println("familiaPartilhada: " + familiaPartilhada);
        System.out.println("negocioPartilhado: " + negocioPartilhado);

        for (int i = 0; i < quantidadeDeNegocios; i++) {
            randomNumber = randomAtributesGenerator.generateRandomNumber();
            System.out.println("quantidadeDeNegocios " + quantidadeDeNegocios);
            //Alterar criação de negocios
            switch (randomNumber) {
                case 0:
                    Casino casino = new Casino(familia, randomAtributesGenerator.generateRandomName("Casino"), randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), false, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true);
                    familia.addNegocio(casino);
                    capoRegime.addNegocio(casino);
                    break;
                case 1:
                    Armas armas = new Armas(familia, randomAtributesGenerator.generateRandomName("Armas"), randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false);
                    familia.addNegocio(armas);
                    capoRegime.addNegocio(armas);
                    break;
                case 2:
                    Droga droga = new Droga(familia, randomAtributesGenerator.generateRandomName("Droga"), randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false);

                    familia.addNegocio(droga);
                    capoRegime.addNegocio(droga);
                    break;
                case 3:
                    LavagemDinheiro lavagemDinheiro = new LavagemDinheiro(familia, randomAtributesGenerator.generateRandomName("LavagemDinheiro"), randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true);

                    familia.addNegocio(lavagemDinheiro);
                    capoRegime.addNegocio(lavagemDinheiro);
                    break;
                case 4:

                    Roubo roubo = new Roubo(familia, randomAtributesGenerator.generateRandomName("Roubo"), randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, true);
                    familia.addNegocio(roubo);
                    capoRegime.addNegocio(roubo);
                    break;
                default:
                // code block
            }
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
