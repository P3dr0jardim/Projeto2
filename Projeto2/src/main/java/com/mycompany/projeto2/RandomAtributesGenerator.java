package com.mycompany.projeto2;

import java.util.Random;

public class RandomAtributesGenerator {

    private int randomIndex, probabilidadeDeSerPartilhado, randomCCID, randomLealdade, randomInteligencia, randomMusculo, randomEstrategia, randomCarisma, randomNumber, randomValorBaseTributavel, randomProbabPoliciaAtuar, randomRentabilidade, randomSerPreso, minValue = 100, maxValue = 1000;
    private String randomName;

    // create instance of Random class
    Random rand = new Random();

    public RandomAtributesGenerator() {

    }
    
    //Diversos randoms sendo obtidos consoante cada um valor ou uma string
    public String generateRandomName(String name) {
        randomName = name + rand.nextInt(1000);
        System.out.println("Random Name" + randomName);
        return randomName;
    }

    public int generateRandomIndex(int size) {
        randomIndex = rand.nextInt(size);
        System.out.println("RandomIndex: " + randomIndex);
        return randomIndex;
    }
    
    public int generateRandomCCID() {
        randomCCID = rand.nextInt(99999999-9999999);
        return randomCCID;
    }

    public int generateRandomValorBaseTributavel() {
        randomValorBaseTributavel = rand.nextInt(maxValue - minValue) + minValue;
        return randomValorBaseTributavel;
    }
    
    public int generateRandomRentabilidade() {
        randomRentabilidade = rand.nextInt(maxValue - minValue) + minValue;
        return randomRentabilidade;
    }

    public int generateRandomProbabilidadePoliciaAtuar() {
        randomProbabPoliciaAtuar = rand.nextInt(100);
        return randomProbabPoliciaAtuar;
    }

    public int generateProbabilidadeDeSerPartilhado() {
        probabilidadeDeSerPartilhado = rand.nextInt(100);
        return probabilidadeDeSerPartilhado;
    }

    public int generateRandomLealdade() {
        randomLealdade = rand.nextInt(100);
        return randomLealdade;
    }

    public int generateRandomNumber() {
        randomNumber = rand.nextInt(5);
        return randomNumber;
    }

    public int generateProbabilidadeSerPreso() {
        randomSerPreso = rand.nextInt(61) + 10;
        return randomSerPreso;
    }

    public int generateRandomInteligencia() {
        randomInteligencia = rand.nextInt(100);
        return randomInteligencia;
    }

    public int generateRandomMusculo() {
        randomMusculo = rand.nextInt(100);
        return randomMusculo;
    }

    public int generateRandomEstrategia() {
        randomEstrategia = rand.nextInt(100);
        return randomEstrategia;
    }

    public int generateRandomCarisma() {
        randomCarisma = rand.nextInt(100);
        return randomCarisma;
    }
}
