package com.mycompany.projeto2;

import java.util.ArrayList;
import java.util.TreeMap;

public class Prisao {

    private ArrayList<Mafioso> presos;
    private TreeMap<String,Mafioso> presosFamilia;

    public Prisao() {
        presos = new ArrayList<Mafioso>();
        presosFamilia = new TreeMap<String,Mafioso>();
    }

    public ArrayList<Mafioso> getPresos() {
        return presos;
    }

    public TreeMap<String, Mafioso> getPresosFamilia() {
        return presosFamilia;
    }

    public void setPresos(ArrayList<Mafioso> presos) {
        this.presos = presos;
    }

    //Método que adiciona um membro da mafia à prisao
    public void addPreso(Mafioso m) {
        presos.add(m);
        inserePrisioneiro(m);
    }

    //Método que liberta um membro da mafia da prisao
    public void libertarPreso(int mafiosoId) {
        int posicao = 0;
        if (presos.get(0).getCcId() == mafiosoId){
            presos.remove(0);
            presosFamilia.remove(this);
            presos.get(0).getFamilia().setRiqueza(presos.get(0).getFamilia().getRiqueza()*0.05);//pagamento de libertar
            System.out.println("O mafioso " +  presos.get(0).getNome() + " foi libertado!");
        }else if (presos.get(0).getCcId() != mafiosoId){
            while(presos.get(posicao).getCcId() != mafiosoId){
                posicao++;
            }
            presos.remove(posicao);
            presosFamilia.remove(this);
            presos.get(posicao).getFamilia().setRiqueza(presos.get(posicao).getFamilia().getRiqueza()*0.05);//pagamento de libertar
            System.out.println("O mafioso " +  presos.get(posicao).getNome() + " foi libertado de volta para a familia!");
        }
        else {
            System.out.println("O valor do ID não corresponde a nenhum preso!");
        }    
    }
    
    public void inserePrisioneiro(Mafioso m){
        presosFamilia.put(m.getFamilia().getNomeFamilia(), m);
    }
    
    public void removePrisioneiro(Mafioso m){
        presosFamilia.remove(m.getFamilia().getNomeFamilia(), m);
    }
}
