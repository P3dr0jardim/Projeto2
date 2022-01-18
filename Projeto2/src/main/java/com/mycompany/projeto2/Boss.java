package com.mycompany.projeto2;

public class Boss extends Mafioso {

    private boolean consiglieri = false;
    private Familia familia;
    private Familia familiaPartilhada;
    private CapoRegime equipaDoCapoRegime, capoRegime;
    private RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
    private int quantidadeDeNegocios, randomNumber;

    public Boss(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, true, false);
        this.familia = familia;
    }

    public void RecrutaSoldier(String nome, int capoRegime) {
        //Codigo para recrutar um soldier 
        System.out.println("randomAtributesGenerator " + randomAtributesGenerator.generateRandomLealdade());

        familia.addSoldier(new Soldier(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        equipaDoCapoRegime = familia.getCapoRegime(capoRegime);

        equipaDoCapoRegime.addSoldier(new Soldier(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        System.out.println("Familia do soldier " + familia.getNome());

        System.out.println(equipaDoCapoRegime.capoRegimeTeam());

        System.out.println("Atualmente existem: " + familia.getSoldiers().size());
    }

    public void RecrutaCapoRegime(String nome) {
        //Codigo para recrutar um CapoRegime 
        familia.addCapoRegime(new CapoRegime(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        System.out.println("Familia do capoRegime " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getCapoRegimes().size());
    }

    public void RecrutaUnderboss(String nome) {
        //Codigo para recrutar um Underboss 
        familia.addUnderboss(new Underboss(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));

        System.out.println("Familia do capoRegime " + familia.getNome());
        System.out.println("Atualmente existem: " + familia.getUnderBosses().size());
    }

    public void NomearConsiglieri(String nome) {
        //Codigo para nomear um consiglieri 
        consiglieri = true;

        familia.addConsiglieri(new Consiglieri(familia, nome, 10, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), getProbabilidadeSerPreso(), false, true, false));
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

        if (randomAtributesGenerator.generateProbabilidadeDeSerPartilhado() >= 1) {
            if (config.getFamilia(randomAtributesGenerator.generateRandomIndex(config.getFamilias().size())) == null) {
                familiaPartilhada = null;
            } else {
                familiaPartilhada = config.getFamilia(randomAtributesGenerator.generateRandomIndex(config.getFamilias().size()));

                System.out.println("Negocios da Familia Partilhada" + familiaPartilhada.getNegocios());
            }

            //remover a familia atual da lista
            System.out.println("familiaPartilhada " + familiaPartilhada);
        }

        System.out.println("Quantidade de negocios : " + quantidadeDeNegocios);

        for (int i = 0; i < quantidadeDeNegocios; i++) {
            randomNumber = randomAtributesGenerator.generateRandomNumber();
            switch (randomNumber) {
                case 0:
                    familia.addNegocio(new Casino("Casino", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), false, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true));
                    capoRegime.addNegocio(new Casino("Casino", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), false, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true));
                    break;
                case 1:
                    familia.addNegocio(new Armas("Armas", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false));
                    capoRegime.addNegocio(new Armas("Armas", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false));
                    break;
                case 2:
                    familia.addNegocio(new Droga("Droga", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false));
                    capoRegime.addNegocio(new Droga("Droga", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, false));
                    break;
                case 3:
                    familia.addNegocio(new LavagemDinheiro("LavagemDinheiro", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true));
                    capoRegime.addNegocio(new LavagemDinheiro("LavagemDinheiro", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), false, true));
                    break;
                case 4:
                    familia.addNegocio(new Roubo("Roubo", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, true));
                    capoRegime.addNegocio(new Roubo("Roubo", randomAtributesGenerator.generateRandomValorBaseTributavel(), randomAtributesGenerator.generateRandomProbabilidadePoliciaAtuar(), true, capoRegime, randomAtributesGenerator.generateRandomRentabilidade(), randomAtributesGenerator.generateRandomValorBaseTributavel(), true, true));
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
