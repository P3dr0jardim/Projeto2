package com.mycompany.projeto2;

import java.util.ArrayList;

public class Config {

    private ArrayList<Familia> familias;
    private Familia familiaEscolhida, familiaPartilhada;
    private boolean familiaFoiEscolhida = false;

    public Config() {
        familias = new ArrayList<Familia>();
    }

    public ArrayList<Familia> getFamilias() {
        return familias;
    }

    public Familia getFamiliaEscolhida() {
        return familiaEscolhida;
    }

    public void setFamiliaEscolhida(Familia familiaEscolhida) {
        this.familiaEscolhida = familiaEscolhida;
    }

    public void setFamilias(ArrayList<Familia> familias) {
        this.familias = familias;
    }

    public boolean isFamiliaFoiEscolhida() {
        return familiaFoiEscolhida;
    }

    public void setFamiliaFoiEscolhida(boolean familiaFoiEscolhida) {
        this.familiaFoiEscolhida = familiaFoiEscolhida;
    }

    //Método que adiciona familias da classe familia à lista
    public void addFamilia(Familia familia) {
        familias.add(familia);
    }

    public Familia getFamilia(int familiaId) {
        if (!familiaFoiEscolhida) {
            System.out.println("Familia nao foi escolhida");
            for (Familia familia : familias) {
                if (familiaId == familia.getFamiliaId()) {
                    familiaEscolhida = familia;
                    familiaFoiEscolhida = true;
                }
            }

            return familiaEscolhida;
        } else {
            System.out.println("Familia foi escolhida");

            System.out.println("FamiliaId" + familiaId);
            System.out.println("familiaEscolhida.getFamiliaId()" + familiaEscolhida.getFamiliaId());
            if (familiaId != familiaEscolhida.getFamiliaId()) {

                for (Familia familia : familias) {

                    if (familiaId == familia.getFamiliaId()) {
                        System.out.println("Familia partilhada certo");
                        familiaPartilhada = familia;
                    }
                }
            } else {
                System.out.println("Familia partilhada erro");
                return null;
            }

            return familiaPartilhada;
        }
    }
}
