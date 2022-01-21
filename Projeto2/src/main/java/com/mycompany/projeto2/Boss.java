package com.mycompany.projeto2;

public class Boss extends Mafioso {

    private boolean consiglieri = false;
    private Familia familia;
    private Familia familiaPartilhada;
    private CapoRegime equipaDoCapoRegime, capoRegime;
    private RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
    private int quantidadeDeNegocios, randomNumber;
    private Negocio negocioPartilhado;

    public Boss(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso, estaPreso, true, false);
        this.familia = familia;
    }

    public void RecrutaSoldier(String nome, int capoRegime) {
        //Codigo para recrutar um soldier 
        System.out.println("randomAtributesGenerator " + randomAtributesGenerator.generateRandomLealdade());

        familia.addSoldier(new Soldier(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        equipaDoCapoRegime = familia.getCapoRegime(capoRegime);

        equipaDoCapoRegime.addSoldier(new Soldier(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        System.out.println("Familia do soldier " + familia.getNome());

        System.out.println(equipaDoCapoRegime.capoRegimeTeam());

        System.out.println("Atualmente existem: " + familia.getSoldiers().size());
    }

    public void RecrutaCapoRegime(String nome) {
        //Codigo para recrutar um CapoRegime 
        familia.addCapoRegime(new CapoRegime(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        System.out.println("Familia do capoRegime " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getCapoRegimes().size());
    }

    public void RecrutaUnderboss(String nome) {
        //Codigo para recrutar um Underboss 
        familia.addUnderboss(new Underboss(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        System.out.println("Familia do capoRegime " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getUnderBosses().size());
    }

    public void NomearConsiglieri(String nome) {
        //Codigo para nomear um consiglieri 
        consiglieri = true;

        familia.addConsiglieri(new Consiglieri(familia, nome, randomAtributesGenerator.generateRandomCCID(), randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));
        System.out.println("Familia do consiglieri " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getConsiglieris().size());
    }

    public String temConsiglieri() {
        if (consiglieri) {
            return "O chefe da mafia " + getNome() + " tem um consiglieri";

        } else {
            return "O chefe da mafia " + getNome() + " não tem um consiglieri";
        }
    }

    public void geraNegocio(int capoRegimeId, Config config) {
        capoRegime = familia.getCapoRegime(capoRegimeId);
        if (getCarisma() >= 80) {
            quantidadeDeNegocios = 5;
        } else if (getCarisma() >= 50 && getCarisma() < 80) {
            quantidadeDeNegocios = 3;
        } else if (getCarisma() < 50) {
            quantidadeDeNegocios = 1;
        }

        if (randomAtributesGenerator.generateProbabilidadeDeSerPartilhado() >= 50) {
            int familiaIndex = randomAtributesGenerator.generateRandomIndex(config.getFamilias().size());
            if (config.getFamilia(familiaIndex) == null) {
                familiaPartilhada = null;
            } else {
                familiaPartilhada = config.getFamilia(familiaIndex);
                if (familiaPartilhada.getNegocios().size() == 0) {
                    negocioPartilhado = null;
                } else {
                    negocioPartilhado = familiaPartilhada.getNegocio(randomAtributesGenerator.generateRandomIndex(familiaPartilhada.getNegocios().size()));
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
                    Casino casino = new Casino(familia, "Casino", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), false, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true);
                    familia.addNegocio(casino);
                    capoRegime.addNegocio(casino);
                    break;
                case 1:
                    Armas armas = new Armas(familia, "Armas", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false);
                    familia.addNegocio(armas);
                    capoRegime.addNegocio(armas);
                    break;
                case 2:
                    Droga droga = new Droga(familia, "Droga", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false);

                    familia.addNegocio(droga);
                    capoRegime.addNegocio(droga);
                    break;
                case 3:
                    LavagemDinheiro lavagemDinheiro = new LavagemDinheiro(familia, "LavagemDinheiro", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true);

                    familia.addNegocio(lavagemDinheiro);
                    capoRegime.addNegocio(lavagemDinheiro);
                    break;
                case 4:

                    Roubo roubo = new Roubo(familia, "Roubo", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, true);
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
