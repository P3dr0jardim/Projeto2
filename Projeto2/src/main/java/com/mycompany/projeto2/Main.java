/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.projeto2;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
        boolean sair = false;
        
        Scanner scan= new Scanner (System.in);
        
        do{
        System.out.println("        MENU MÁFIA       ");
        System.out.println("1 - Boss");
        System.out.println("2 - UnderBoss");
        System.out.println("3 - Consigliere");
        System.out.println("4 - Familia");
        System.out.println("Introduza uma opção: ");
        opcao = scan.nextInt();

        switch (opcao){
            case 1:
                System.out.println("\n        Opções válidas      ");
                System.out.println("1. Recruta Soldier");
                System.out.println("2. Recruta CapoRegime");
                System.out.println("3. Recruta Underboss");
                System.out.println("4. Gera negócios para caporegime");
                System.out.println("5. Nomear consiglieri");
                System.out.println("O que pretende?");
                opcao = scan.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("\naaaaaaaaaaa\n");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("\nOpção inválida!\n");
                }
                break;
            case 2:
                System.out.println("\n        Opções válidas      ");
                System.out.println("1. Libertar mafioso");
                System.out.println("2. Período contabilístico");
                System.out.println("3. Loyalty test");
                System.out.println("O que pretende?");
                opcao= scan.nextInt();               
                
                switch (opcao){
                    case 1:
                        System.out.println("\naaaaaaaaaaa\n");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\nOpção inválida!\n");
                        break;
                }
                break;
            case 3:
                System.out.println("\n        Opções válidas      ");
                System.out.println("1. Expandir negócio");
                System.out.println("2. Mafia sitdown");
                System.out.println("O que pretende?");
                opcao = scan.nextInt();
                
                switch (opcao){
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
                System.out.println("8. Sair da aplicação");
                System.out.println("O que pretende?");
                opcao = scan.nextInt();
                
                switch (opcao){
                    case 1:
                        System.out.println("\naaaaaaaaaaa\n");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("\nSaindo da aplicação...");
                        sair=true;
                        break;
                    default:
                        System.out.println("\nOpção inválida!\n");
                }
                break;
            default:
                System.out.println("\nOpção inválida, tente novamente!\n");
        }
      }while (!sair);
    }
}
