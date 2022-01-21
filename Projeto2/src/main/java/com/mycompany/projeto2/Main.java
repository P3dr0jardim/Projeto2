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
        Familia familiaRival;

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
                                int introduzido = scan.nextInt();
                                for(int i = 0; i<config.getFamiliaEscolhida().getCapoRegimes().size(); i++){
                                    if(config.getFamiliaEscolhida().getCapoRegimes().get(i).getCcId()==introduzido){
                                        capoRegime = i;
                                        System.out.println("Introduza o nome do soldier");
                                        nome = scan.next();
                                        boss.RecrutaSoldier(nome, capoRegime);
                                    }
                                    else{
                                        i++;
                                    }
                                }
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
                                System.out.println("Mafia Sitdown"+"\n");
                                int estrategaConsiglieri = config.getFamiliaEscolhida().getConsiglieri().getEstratega();
                                for(int i = 0; i<config.getFamiliaEscolhida().getNegocios().size(); i++){
                                    if(config.getFamiliaEscolhida()==familia1){
                                        for(int k = 0; k<familia2.getNegocios().size(); k++){
                                            if(familia1.getNegocios().get(i)==familia2.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia2.setCustoFixo(familia2.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia2.setCustoFixo(familia2.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia3.getNegocios().size(); k++){
                                            if(familia1.getNegocios().get(i)==familia3.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia3.setCustoFixo(familia3.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia3.setCustoFixo(familia3.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia4.getNegocios().size(); k++){
                                            if(familia1.getNegocios().get(i)==familia4.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia4.setCustoFixo(familia4.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia4.setCustoFixo(familia4.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia5.getNegocios().size(); k++){
                                            if(familia1.getNegocios().get(i)==familia5.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia5.setCustoFixo(familia5.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia5.setCustoFixo(familia5.getCustoFixo()*1.5);
                                            }
                                        }
                                        if(config.getFamiliaEscolhida()==familia2){
                                        for(int k = 0; k<familia1.getNegocios().size(); k++){
                                            if(familia2.getNegocios().get(i)==familia1.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia1.setCustoFixo(familia1.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia1.setCustoFixo(familia1.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia3.getNegocios().size(); k++){
                                            if(familia2.getNegocios().get(i)==familia3.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia3.setCustoFixo(familia3.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia3.setCustoFixo(familia3.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia4.getNegocios().size(); k++){
                                            if(familia2.getNegocios().get(i)==familia4.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia4.setCustoFixo(familia4.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia4.setCustoFixo(familia4.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia5.getNegocios().size(); k++){
                                            if(familia2.getNegocios().get(i)==familia5.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia5.setCustoFixo(familia5.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia5.setCustoFixo(familia5.getCustoFixo()*1.5);
                                            }
                                        }
                                        if(config.getFamiliaEscolhida()==familia3){
                                        for(int k = 0; k<familia1.getNegocios().size(); k++){
                                            if(familia3.getNegocios().get(i)==familia1.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia1.setCustoFixo(familia1.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia1.setCustoFixo(familia1.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia2.getNegocios().size(); k++){
                                            if(familia3.getNegocios().get(i)==familia2.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia2.setCustoFixo(familia2.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia2.setCustoFixo(familia2.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia4.getNegocios().size(); k++){
                                            if(familia3.getNegocios().get(i)==familia4.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia4.setCustoFixo(familia4.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia4.setCustoFixo(familia4.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia5.getNegocios().size(); k++){
                                            if(familia3.getNegocios().get(i)==familia5.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia5.setCustoFixo(familia5.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia5.setCustoFixo(familia5.getCustoFixo()*1.5);
                                            }
                                        }
                                        if(config.getFamiliaEscolhida()==familia4){
                                        for(int k = 0; k<familia1.getNegocios().size(); k++){
                                            if(familia4.getNegocios().get(i)==familia1.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia1.setCustoFixo(familia1.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia1.setCustoFixo(familia1.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia2.getNegocios().size(); k++){
                                            if(familia4.getNegocios().get(i)==familia2.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia2.setCustoFixo(familia2.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia2.setCustoFixo(familia2.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia3.getNegocios().size(); k++){
                                            if(familia4.getNegocios().get(i)==familia3.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia3.setCustoFixo(familia3.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia3.setCustoFixo(familia3.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia5.getNegocios().size(); k++){
                                            if(familia4.getNegocios().get(i)==familia5.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia5.setCustoFixo(familia5.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia5.setCustoFixo(familia5.getCustoFixo()*1.5);
                                            }
                                        }
                                        if(config.getFamiliaEscolhida()==familia5){
                                        for(int k = 0; k<familia1.getNegocios().size(); k++){
                                            if(familia5.getNegocios().get(i)==familia1.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia1.setCustoFixo(familia1.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia1.setCustoFixo(familia1.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia2.getNegocios().size(); k++){
                                            if(familia5.getNegocios().get(i)==familia2.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia2.setCustoFixo(familia2.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia2.setCustoFixo(familia2.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia3.getNegocios().size(); k++){
                                            if(familia5.getNegocios().get(i)==familia3.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia3.setCustoFixo(familia3.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia3.setCustoFixo(familia3.getCustoFixo()*1.5);
                                            }
                                        }
                                        for(int k = 0; k<familia4.getNegocios().size(); k++){
                                            if(familia5.getNegocios().get(i)==familia4.getNegocios().get(k)){
                                                if(estrategaConsiglieri>=80)familia4.setCustoFixo(familia4.getCustoFixo()*2);
                                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia4.setCustoFixo(familia4.getCustoFixo()*1.5);
                                            }
                                        }
                                    }
                                }
                            }
                                    }   }
                                }
                                if(estrategaConsiglieri>=80)familia1.setCustoFixo(familia1.getCustoFixo()*2);
                                if(estrategaConsiglieri>=50 && estrategaConsiglieri <80)familia1.setCustoFixo(familia1.getCustoFixo()*1.5);
                                System.out.println("Custos Fixox Atualizados!");
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
                                System.out.println("Boss: " + config.getFamiliaEscolhida().getBoss() + "\n");
                                System.out.println("UnderBoss: " + config.getFamiliaEscolhida().getUnderBoss() + "\n");
                                System.out.println("Consiglieri: " + config.getFamiliaEscolhida().getConsiglieris() + "\n");
                                System.out.println("CapoRegimes: " + config.getFamiliaEscolhida().getCapoRegimes() + "\n");
                                System.out.println("Soldiers: " + config.getFamiliaEscolhida().getSoldiers() + "\n");
                                System.out.println("Negócios: " + config.getFamiliaEscolhida().getNegocios() + "\n");
                                System.out.println("Custo Fixo: " + config.getFamiliaEscolhida().getCustoFixo() + "\n");
                                System.out.println("Riqueza Acumulada: " + config.getFamiliaEscolhida().getRiqueza() + "\n");
                                System.out.println("Obituário: " + config.getFamiliaEscolhida().getObituarioFamiliares() + "\n");
                                //System.out.println("Encarcerados: "+config.getFamiliaEscolhida().getPresos()+"\n");
                                break;
                            case 2:
                                System.out.println("Negócios: " + config.getFamiliaEscolhida().getNegocios() + "\n");
                                break;
                            case 3:
                                System.out.println("Custos: " + config.getFamiliaEscolhida().getCustoFixo() + "\n");
                                break;
                            case 4:
                                for (int i = 0; i < config.getFamiliaEscolhida().getCapoRegimes().size(); i++) {
                                    System.out.println("O CapoRegime " + config.getFamiliaEscolhida().getCapoRegimes().get(i).getNome() + " tem os seguintes soldiers na sua equipa:" + "\n");
                                    System.out.println(config.getFamiliaEscolhida().getCapoRegimes().get(i).getSoldiers().toString());
                                }
                                break;
                            case 5:
                                System.out.println("Obituario: " + config.getFamiliaEscolhida().getObituarioFamiliares());
                                break;
                            case 6:
                                System.out.println("Encarcerados: ");
                                System.out.println(prisao.getPresosFamilia());
                                break;
                            case 7:
                                System.out.println("Selecione uma segunda família para o All Out War (Introduza o id da segunda familia.)");
                                System.out.println(config.getFamilias());
                                System.out.println("A familia que está selecionada é: " + config.getFamiliaEscolhida().getNome()+"\n");
                                System.out.println("Escolha a segunda família.");
                                familiaId = scan.nextInt();
                                familiaRival = config.getFamilia(familiaId);
                                System.out.println("A segunda familia escolhida foi: " + familiaRival.getNome());
                                if(config.getFamiliaEscolhida().getConsiglieri().getEstratega()>60 && familiaRival.getConsiglieri().getEstratega()<40){
                                    config.getFamiliaEscolhida().setCustoFixo(config.getFamiliaEscolhida().getCustoFixo()*1.5);
                                    familiaRival.setCustoFixo(familiaRival.getCustoFixo()/1.5);
                                }
                                if(config.getFamiliaEscolhida().getConsiglieri().getEstratega()<40 && familiaRival.getConsiglieri().getEstratega()>60){
                                    config.getFamiliaEscolhida().setCustoFixo(config.getFamiliaEscolhida().getCustoFixo()/1.5);
                                    familiaRival.setCustoFixo(familiaRival.getCustoFixo()*1.5);
                                }
                                if(config.getFamiliaEscolhida().getConsiglieri().getEstratega()>80 && familiaRival.getConsiglieri().getEstratega()<30){
                                    config.getFamiliaEscolhida().setCustoFixo(config.getFamiliaEscolhida().getCustoFixo()*3);
                                    familiaRival.setCustoFixo(familiaRival.getCustoFixo()/3);
                                }
                                if(config.getFamiliaEscolhida().getConsiglieri().getEstratega()<30 && familiaRival.getConsiglieri().getEstratega()>80){
                                    config.getFamiliaEscolhida().setCustoFixo(config.getFamiliaEscolhida().getCustoFixo()/3);
                                    familiaRival.setCustoFixo(familiaRival.getCustoFixo()*3);
                                }
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
