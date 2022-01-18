package com.mycompany.projeto2;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao, capoRegime, preso, negocioId, familiaId;
        String nome, nomeNegocio;
        boolean sair = false, underbossMenu = false;
        RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
        Scanner scan = new Scanner(System.in);
        Boss boss;
        Config config = new Config();

        Familia familia1 = new Familia(1, "Peaky Blinders", 1000.0, 2000.0, 100.0);
        config.addFamilia(familia1);
        Boss chefeDaMafiaFamilia1 = new Boss(familia1, "Thomas Shelby", 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false);
        familia1.setBoss(chefeDaMafiaFamilia1);

        Familia familia2 = new Familia(2, "Yakuza", 3000.0, 5000.0, 100.0);
        config.addFamilia(familia2);
        Boss chefeDaMafiaFamilia2 = new Boss(familia2, "Jackie Chan", 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false);
        familia2.setBoss(chefeDaMafiaFamilia2);

        Familia familia3 = new Familia(3, "Sicilian Mafia", 10000.0, 20000.0, 100.0);
        config.addFamilia(familia3);
        Boss chefeDaMafiaFamilia3 = new Boss(familia3, "Al Capone", 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false);
        familia3.setBoss(chefeDaMafiaFamilia3);

        Familia familia4 = new Familia(4, "Sinaloa Cartel", 100000.0, 200000.0, 100.0);
        config.addFamilia(familia4);
        Boss chefeDaMafiaFamilia4 = new Boss(familia4, "Pablo Escobar", 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false);
        familia4.setBoss(chefeDaMafiaFamilia4);

        Familia familia5 = new Familia(5, "Triad", 1000000.0, 2000000.0, 100.0);
        config.addFamilia(familia5);
        Boss chefeDaMafiaFamilia5 = new Boss(familia5, "Heung Wah-yim", 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true, false);
        familia5.setBoss(chefeDaMafiaFamilia5);

        Prisao prisao = new Prisao();
        Underboss underboss;
        Consiglieri consiglieri;
        Familia familia;

        do {
            if (!config.isFamiliaFoiEscolhida()) {
                System.out.println("Welcome to “The five crime families of New York");
                System.out.println("Selecione uma das seguintes familias para poder fazer a gestao da mesma (Introduza o id da familia)");
                System.out.println(config.getFamilias());
                while (!scan.hasNextInt()) {
                    System.out.println("O valor introduzido não é valido!");
                    System.out.println("Introduza novamente um valor valido");
                    scan.next(); // this is important!
                }
                familiaId = scan.nextInt();
                familia = config.getFamilia(familiaId);
                System.out.println("A familia escolhida foi: " + familia.getNome());

            } else {
                System.out.println("familia escolhida: " + config.getFamiliaEscolhida());

                System.out.println("        MENU MÁFIA       ");
                System.out.println("1 - Boss");
                System.out.println("2 - UnderBoss");
                System.out.println("3 - Consigliere");
                System.out.println("4 - Familia");
                System.out.println("5 - Mudar de Familia");
                System.out.println("6 - Sair da aplicação");
                System.out.println("Introduza uma opção: ");
                while (!scan.hasNextInt()) {
                    System.out.println("O valor introduzido não é valido!");
                    System.out.println("Introduza novamente um valor valido");
                    scan.next(); // this is important!
                }

                opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\n        Opções válidas      ");
                        System.out.println("1. Recruta Soldier");
                        System.out.println("2. Recruta CapoRegime");
                        System.out.println("3. Recruta Underboss");
                        System.out.println("4. Gera negócios para caporegime");
                        System.out.println("5. Nomear consiglieri");
                        System.out.println("O que pretende?");
                        while (!scan.hasNextInt()) {
                            System.out.println("O valor introduzido não é valido!");
                            System.out.println("Introduza novamente um valor valido");
                            scan.next(); // this is important!
                        }
                        opcao = scan.nextInt();
                        boss = config.getFamiliaEscolhida().getBoss();

                        switch (opcao) {
                            case 1:
                                System.out.println("Atualmente existe: " + config.getFamiliaEscolhida().getSoldiers());

                                System.out.println("CapoRegimes disponiveis" + config.getFamiliaEscolhida().getCapoRegimes());

                                System.out.println("Introduza o capoRegime que o soldier ira fazer parte");
                                capoRegime = scan.nextInt();

                                System.out.println("Introduza o nome do soldier");
                                nome = scan.next();

                                boss.RecrutaSoldier(nome, capoRegime);
                                break;
                            case 2:
                                System.out.println("Introduza o nome do capoRegime");
                                nome = scan.next();
                                boss.RecrutaCapoRegime(nome);

                                for (int i = 0; i < config.getFamiliaEscolhida().getCapoRegimes().size(); i++) {
                                    config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios();
                                    for (int j = 0; j < config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios().size(); j++) {
                                        double tributos = config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios().get(j).getValorAtualTributavel();
                                        double ganhos = config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios().get(j).getRentabilidade();
                                        double lucro = ganhos - tributos;
                                        config.getFamiliaEscolhida().setRiqueza(config.getFamiliaEscolhida().getRiqueza() + lucro);
                                    }
                                }
                                System.out.println("A riqueza da familia foi atualizada!");
                                break;
                            case 3:
                                System.out.println("Introduza o nome do Underboss");
                                nome = scan.next();
                                boss.RecrutaUnderboss(nome);
                                underbossMenu = true;
                                break;
                            case 4:
                                //Gera negocios para caporegime
                                System.out.println("Introduza o capoRegime que ira atribuir o novo negocio");
                                capoRegime = scan.nextInt();
                                //System.out.println("Introduza o nome do negocio");
                                //nomeNegocio = scan.next();

                                boss.geraNegocio(capoRegime, config);
                                System.out.println("negocios da familia: " + config.getFamiliaEscolhida().getNegocios());

                                break;
                            case 5:
                                System.out.println("Introduza o nome do Consiglieri");
                                nome = scan.next();
                                boss.NomearConsiglieri(nome);
                                break;
                            default:
                                System.out.println("\nOpção inválida!\n");
                        }
                        break;
                    case 2:
                        if (underbossMenu) {
                            System.out.println("\n        Opções válidas      ");
                            System.out.println("1. Libertar mafioso");
                            System.out.println("2. Período contabilístico");
                            System.out.println("3. Loyalty test");
                            System.out.println("O que pretende?");
                            while (!scan.hasNextInt()) {
                                System.out.println("O valor introduzido não é valido!");
                                System.out.println("Introduza novamente um valor valido");
                                scan.next(); // this is important!
                            }
                            opcao = scan.nextInt();

                            switch (opcao) {
                                case 1:
                                    if (prisao.getPresos().size() > 0) {
                                        System.out.println("O(s) seguinte(s) " + prisao.getPresos().size() + " mafioso(s) encontram-se na prisão:");
                                        for (int i = 0; i < prisao.getPresos().size(); i++) {
                                            System.out.println("ID: " + prisao.getPresos().get(i).getCcId() + ", Nome: " + prisao.getPresos().get(i).getNome());
                                        }
                                        System.out.println("Introduza o id do mafioso que deseja libertar da prisao");
                                        preso = scan.nextInt();
                                        prisao.libertarPreso(preso);
                                    } else {
                                        System.out.println("Nenhum mafioso encontra-se preso neste momento");
                                    }
                                    break;
                                case 2:
                                    //Periodo Contabilistico
                                    for (int i = 0; i < config.getFamiliaEscolhida().getCapoRegimes().size(); i++) {
                                        config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios();
                                        for (int j = 0; j < config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios().size(); j++) {
                                            double tributos = config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios().get(j).getValorAtualTributavel();
                                            double ganhos = config.getFamiliaEscolhida().getCapoRegimes().get(i).getNegocios().get(j).getRentabilidade();
                                            double lucro = ganhos - tributos;
                                            config.getFamiliaEscolhida().setRiqueza(config.getFamiliaEscolhida().getRiqueza() + lucro);
                                        }
                                    }
                                    System.out.println("A riqueza da familia foi atualizada!");
                                    break;
                                case 3:
                                    underboss = config.getFamiliaEscolhida().getUnderBoss();
                                    underboss.loyaltyTest(config.getFamiliaEscolhida());
                                    break;
                                default:
                                    System.out.println("\nOpção inválida!\n");
                                    break;
                            }
                        } else {
                            System.out.println("O Menu underBoss esta indisponivel, porque o underboss ainda nao foi criado!");
                        }

                        break;
                    case 3:
                        System.out.println("\n        Opções válidas      ");
                        System.out.println("1. Expandir negócio");
                        System.out.println("2. Mafia sitdown");
                        System.out.println("O que pretende?");
                        while (!scan.hasNextInt()) {
                            System.out.println("O valor introduzido não é valido!");
                            System.out.println("Introduza novamente um valor valido");
                            scan.next(); // this is important!
                        }
                        opcao = scan.nextInt();

                        switch (opcao) {
                            case 1:
                                System.out.println("Negocios: " + config.getFamiliaEscolhida().getNegocios());
                                System.out.println("Introduza o id do negocio que deseja expandir");
                                negocioId = scan.nextInt();

                                System.out.println("Consiglieri: " + config.getFamiliaEscolhida().getConsiglieris());
                                consiglieri = config.getFamiliaEscolhida().getConsiglieri();
                                consiglieri.expandirNegocio(negocioId);
                                break;
                            case 2:
                                //Mafia Sitdown

                                break;
                            default:
                                System.out.println("\nOpção inválida!\n");
                        }
                        break;
                    case 4:
                        System.out.println("\n        Opções válidas      ");
                        System.out.println("1. Retrato de familia");
                        System.out.println("2. Plano de negocios");
                        System.out.println("3. Mapa de custos");
                        System.out.println("4. Espirito de equipa");
                        System.out.println("5. Obituario");
                        System.out.println("6. Encarcerados");
                        System.out.println("7. All out war");
                        System.out.println("O que pretende?");
                        while (!scan.hasNextInt()) {
                            System.out.println("O valor introduzido não é valido!");
                            System.out.println("Introduza novamente um valor valido");
                            scan.next(); // this is important!
                        }
                        opcao = scan.nextInt();

                        switch (opcao) {
                            case 1:
                                System.out.println(config.getFamiliaEscolhida().getSoldiers());
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                System.out.println("Obituario: " + config.getFamiliaEscolhida().getObituarioFamiliares());
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                System.out.println("\nSaindo da aplicação...");
                                sair = true;
                                break;
                            default:
                                System.out.println("\nOpção inválida!\n");
                        }
                        break;
                    case 5:
                        config.setFamiliaFoiEscolhida(false);
                        break;
                    case 6:
                        sair = true;
                        System.out.println("Saiu da app!");
                        break;
                    default:
                        System.out.println("\nOpção inválida, tente novamente!\n");
                }
            }
        } while (!sair);
    }
}
