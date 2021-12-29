package com.mycompany.projeto2;

import java.util.ArrayList;

public class Prisao {

    private ArrayList<Mafioso> presos;

    public Prisao() {
        presos = new ArrayList<Mafioso>();
    }

    public ArrayList<Mafioso> getPresos() {
        return presos;
    }

    public void setPresos(ArrayList<Mafioso> presos) {
        this.presos = presos;
    }

    //Método que adiciona um membro da mafia à prisao
    public void addPreso(Mafioso mafioso) {
        presos.add(mafioso);
    }

    //Método que adiciona um membro da mafia à prisao
    public void libertarPreso(int mafiosoId) {
        presos.remove(mafiosoId);
    }

}
