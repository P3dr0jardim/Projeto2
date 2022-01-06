package com.mycompany.projeto2;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao, capoRegime, preso;
        String nome;
        boolean sair = false, underbossMenu = false;
        RandomAtributesGenerator randomAtributesGenerator = new RandomAtributesGenerator();
        Scanner scan = new Scanner(System.in);
        Familia familia1 = new Familia(1, "Peaky Blinders", 1000.0, 2000.0);
        Boss chefeDaMafia = new Boss(familia1, "Thomas Shelby", 1, randomAtributesGenerator.generateRandomLealdade(), randomAtributesGenerator.generateRandomMusculo(), randomAtributesGenerator.generateRandomInteligencia(), randomAtributesGenerator.generateRandomEstrategia(), randomAtributesGenerator.generateRandomCarisma(), 0, false, true);
        Prisao prisao = new Prisao();
        Underboss underboss;

        do {
            System.out.println("        MENU MÁFIA       ");
            System.out.println("1 - Boss");
            System.out.println("2 - UnderBoss");
            System.out.println("3 - Consigliere");
            System.out.println("4 - Familia");
            System.out.println("5 - Sair da aplicação");
            System.out.println("Introduza uma opção: ");
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
                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Atualmente existe: " + familia1.getSoldiers());

                            System.out.println("CapoRegimes disponiveis" + familia1.getCapoRegimes());

                            System.out.println("Introduza o capoRegime que o soldier ira fazer parte");
                            capoRegime = scan.nextInt();

                            System.out.println("Introduza o nome do soldier");
                            nome = scan.next();
                            chefeDaMafia.RecrutaSoldier(nome, capoRegime);
                            break;
                        case 2:
                            System.out.println("Introduza o nome do capoRegime");
                            nome = scan.next();
                            chefeDaMafia.RecrutaCapoRegime(nome);
                            break;
                        case 3:
                            System.out.println("Introduza o nome do Underboss");
                            nome = scan.next();
                            chefeDaMafia.RecrutaUnderboss(nome);
                            underbossMenu = true;
                            break;
                        case 4:
                            //Gera negocios para caporegime
                            break;
                        case 5:
                            System.out.println("Introduza o nome do Consiglieri");
                            nome = scan.next();
                            chefeDaMafia.NomearConsiglieri(nome);
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
                        opcao = scan.nextInt();

                        switch (opcao) {
                            case 1:
                                System.out.println("Introduza o id do mafioso que deseja libertar da prisao");
                                preso = scan.nextInt();
                                prisao.libertarPreso(preso);
                                break;
                            case 2:
                                //Periodo Contabilistico
                                break;
                            case 3:
                                underboss = familia1.getUnderBoss();
                                underboss.loyaltyTest(familia1);
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
                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("\naaaaaaaaaaa\n");
                            break;
                        case 2:
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
                    opcao = scan.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println(familia1.getSoldiers());
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            System.out.println("Obituario: " + familia1.getObituarioFamiliares());
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
                    sair = true;
                    System.out.println("Saiu da app!");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!\n");
            }
        } while (!sair);
    }
}
