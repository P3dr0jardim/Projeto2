package com.mycompany.projeto2;

import java.util.TreeMap;

public class Prisao {

    private TreeMap<String, Mafioso> presos;

    public Prisao() {
        presos = new TreeMap<String, Mafioso>();
    }

    public void setPresos(TreeMap<String, Mafioso> presos) {
        this.presos = presos;
    }

    public TreeMap<String, Mafioso> getPresos() {
        return presos;
    }

    public void inserePrisioneiro(Mafioso mafioso) {
        presos.put(mafioso.getFamilia().getNome(), mafioso);
    }

    public String getPrisioneiroDaFamilia(String nomeDaFamilia) {
        if (presos.size() > 0) {
            return "Presos da familia " + nomeDaFamilia + presos.get(nomeDaFamilia);
        }else{
            return "Nao tem prisioneiros";
        }
    }

    public void removePrisioneiro(Mafioso mafioso) {
        presos.remove(mafioso.getFamilia().getNome(), mafioso);
    }

    //Método que liberta um membro da mafia da prisao
    public void libertarPreso(int mafiosoId) {
        int posicao = 0;
        if (presos.get(0).getCcId() == mafiosoId) {
            presos.remove(0);
            presos.remove(this);
            presos.get(0).getFamilia().setRiqueza(presos.get(0).getFamilia().getRiqueza() * 0.05);//pagamento de libertar
            System.out.println("O mafioso " + presos.get(0).getNome() + " foi libertado!");
        } else if (presos.get(0).getCcId() != mafiosoId) {
            while (presos.get(posicao).getCcId() != mafiosoId) {
                posicao++;
            }
            presos.remove(posicao);
            presos.remove(this);
            presos.get(posicao).getFamilia().setRiqueza(presos.get(posicao).getFamilia().getRiqueza() * 0.05);//pagamento de libertar
            System.out.println("O mafioso " + presos.get(posicao).getNome() + " foi libertado de volta para a familia!");
        } else {
            System.out.println("O valor do ID não corresponde a nenhum preso!");
        }
    }

}
