package com.mycompany.projeto2;

import java.util.Random;

public class RandomAtributesGenerator {

    private int randomLealdade, randomInteligencia, randomMusculo, randomEstrategia, randomCarisma;

    // create instance of Random class
    Random rand = new Random();

    public RandomAtributesGenerator() {

    }

    public int generateRandomLealdade() {
        randomLealdade = rand.nextInt(100);
        return randomLealdade;
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
