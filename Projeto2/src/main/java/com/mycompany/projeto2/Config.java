package com.mycompany.projeto2;

import java.util.ArrayList;

public class Config {

    private ArrayList<Familia> familias;
    private Familia familiaEscolhida;
    private boolean familiaFoiEscolhida = false;

    public Config() {
        familias = new ArrayList<Familia>();
    }

    public ArrayList<Familia> getFamilias() {
        return familias;
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
        for (Familia familia : familias) {
            if (familiaId == familia.getFamiliaId()) {
                familiaEscolhida = familia;
                familiaFoiEscolhida = true;
            }
        }
        
        return familiaEscolhida;
    }
}
