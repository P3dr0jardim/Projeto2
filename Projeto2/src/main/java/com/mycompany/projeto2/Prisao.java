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

    //Método que liberta um membro da mafia da prisao
    public void libertarPreso(int mafiosoId) {
        int posicao = 0;
        if (presos.get(0).getCcId() == mafiosoId){
            presos.remove(0);
            presos.get(0).getFamilia().setRiqueza(presos.get(0).getFamilia().getRiqueza()*0.05);//pagamento de libertar
            System.out.println("O mafioso " +  presos.get(0).getNome() + " foi libertado!");
        }else if (presos.get(0).getCcId() != mafiosoId){
            while(presos.get(posicao).getCcId() != mafiosoId){
                posicao++;
            }
            presos.remove(posicao);
            presos.get(posicao).getFamilia().setRiqueza(presos.get(posicao).getFamilia().getRiqueza()*0.05);//pagamento de libertar
            System.out.println("O mafioso " +  presos.get(posicao).getNome() + " foi libertado de volta para a familia!");
        }
        else {
            System.out.println("O valor do ID não corresponde a nenhum preso!");
        }    
    }

}
