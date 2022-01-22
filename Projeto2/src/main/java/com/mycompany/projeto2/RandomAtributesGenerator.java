package com.mycompany.projeto2;

import java.util.Random;

public class RandomAtributesGenerator {

    private int randomIndex, probabilidadeDeSerPartilhado, randomCCID, randomLealdade, randomInteligencia, randomMusculo, randomEstrategia, randomCarisma, randomNumber, randomValorBaseTributavel, randomProbabPoliciaAtuar, randomRentabilidade, randomSerPreso, minValue = 10000, maxValue = 100000000;
    private String randomName;

    // create instance of Random class
    Random rand = new Random();

    public RandomAtributesGenerator() {

    }

    public String getRandomName() {
        return randomName;
    }

    public void setRandomName(String randomName) {
        this.randomName = randomName;
    }
    
    public String generateRandomName(String name) {
        randomName = name + rand.nextInt(1000);
        System.out.println("Random Name" + randomName);
        return randomName;
    }

    public int getRandomIndex() {
        return randomIndex;
    }

    public void setRandomIndex(int randomIndex) {
        this.randomIndex = randomIndex;
    }

    public int generateRandomIndex(int size) {
        randomIndex = rand.nextInt(size);
        System.out.println("RandomIndex: " + randomIndex);
        return randomIndex;
    }

    public int getRandomCCID() {
        return randomCCID;
    }

    public void setRandomCCID(int randomCCID) {
        this.randomCCID = randomCCID;
    }
    
    public int generateRandomCCID() {
        randomCCID = rand.nextInt(99999999-9999999);
        return randomCCID;
    }

    public int generateRandomValorBaseTributavel() {
        randomValorBaseTributavel = rand.nextInt(maxValue - minValue) + minValue;
        return randomValorBaseTributavel;
    }

    public int getRandomValorBaseTributavel() {
        return randomValorBaseTributavel;
    }

    public void setRandomValorBaseTributavel(int randomValorBaseTributavel) {
        this.randomValorBaseTributavel = randomValorBaseTributavel;
    }

    public int generateRandomRentabilidade() {
        randomRentabilidade = rand.nextInt(maxValue - minValue) + minValue;
        return randomRentabilidade;
    }

    public int getRandomRentabilidade() {
        return randomRentabilidade;
    }

    public void setRandomRentabilidade(int randomRentabilidade) {
        this.randomRentabilidade = randomRentabilidade;
    }

    public int generateRandomProbabilidadePoliciaAtuar() {
        randomProbabPoliciaAtuar = rand.nextInt(100);
        return randomProbabPoliciaAtuar;
    }

    public int getRandomProbabPoliciaAtuarr() {
        return randomProbabPoliciaAtuar;
    }

    public void setRandomProbabilidadePoliciaAtuar(int ProbabilidadePoliciaAtuar) {
        this.randomProbabPoliciaAtuar = ProbabilidadePoliciaAtuar;
    }

    public int generateProbabilidadeDeSerPartilhado() {
        probabilidadeDeSerPartilhado = rand.nextInt(100);
        return probabilidadeDeSerPartilhado;
    }

    public int getProbabilidadeDeSerPartilhado() {
        return probabilidadeDeSerPartilhado;
    }

    public void setProbabilidadeDeSerPartilhado(int probabilidadeDeSerPartilhado) {
        this.probabilidadeDeSerPartilhado = probabilidadeDeSerPartilhado;
    }

    public int generateRandomLealdade() {
        randomLealdade = rand.nextInt(100);
        return randomLealdade;
    }

    public int generateRandomNumber() {
        randomNumber = rand.nextInt(5);
        return randomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
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

    public int getRandomLealdade() {
        return randomLealdade;
    }

    public void setRandomLealdade(int randomLealdade) {
        this.randomLealdade = randomLealdade;
    }

    public int getRandomInteligencia() {
        return randomInteligencia;
    }

    public void setRandomInteligencia(int randomInteligencia) {
        this.randomInteligencia = randomInteligencia;
    }

    public int getRandomMusculo() {
        return randomMusculo;
    }

    public void setRandomMusculo(int randomMusculo) {
        this.randomMusculo = randomMusculo;
    }

    public int getRandomEstrategia() {
        return randomEstrategia;
    }

    public void setRandomEstrategia(int randomEstrategia) {
        this.randomEstrategia = randomEstrategia;
    }

    public int getRandomCarisma() {
        return randomCarisma;
    }

    public void setRandomCarisma(int randomCarisma) {
        this.randomCarisma = randomCarisma;
    }

}
