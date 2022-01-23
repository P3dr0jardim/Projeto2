package com.mycompany.projeto2;

import java.util.ArrayList;

public class Familia {

    //Variáveis de Instância
    private int familiaId;
    private String nome;
    private double riqueza, patrimonio, custoFixo;
    private ArrayList<Mafioso> mafiosos;
    private Boss boss;
    private Consiglieri consiglieri;
    private Underboss underboss;
    private ArrayList<CapoRegime> caporegimes;
    private ArrayList<Soldier> soldiers;
    private ArrayList<Object> obituarioFamiliares;
    private ArrayList<Negocio> negocios;
    private Familia[] familiasComNegociosPartilhados;
    private CapoRegime capoRegimeSelecionado;
    private Negocio negocioSelecionado;
    private ArrayList<Mafioso> presosDaFamilia;

    //Construtor
    public Familia(int familiaId, String nome, double riqueza, double patrimonio, double custoFixo) {
        this.familiaId = familiaId;
        this.nome = nome;
        this.riqueza = riqueza;
        this.patrimonio = patrimonio;
        this.custoFixo = custoFixo;
        mafiosos = new ArrayList<Mafioso>();
        caporegimes = new ArrayList<CapoRegime>();
        soldiers = new ArrayList<Soldier>();
        obituarioFamiliares = new ArrayList<Object>();
        negocios = new ArrayList<Negocio>();
        familiasComNegociosPartilhados = new Familia[5];
        presosDaFamilia = new ArrayList<Mafioso>();
    }

    //Método que retorn o array com os presos
    public ArrayList<Mafioso> getPresosDaFamilia() {
        return presosDaFamilia;
    }

    //Método que adiciona um membro da mafia à prisao
    public void addPreso(Mafioso mafioso) {
        presosDaFamilia.add(mafioso);
    }

    //Método que liberta um membro da mafia da prisao
    public void libertarPreso(int mafiosoId) {
        if (presosDaFamilia.size() > 0) {
            for (Mafioso mafioso : presosDaFamilia) {
                if (mafiosoId == mafioso.getCcId()) {
                    presosDaFamilia.remove(mafioso);
                    System.out.println("O mafioso " + mafioso.getNome() + " foi libertado");
                    mafioso.setEstaPreso(false);
                } else {
                    System.out.println("O valor do ID não corresponde a nenhum preso!");
                }
            }
        } else {
            System.out.println("Não existe prisioneiros");
        }
    }

    //Método que retorn os negócios ativos na família
    public ArrayList<Negocio> getNegocios() {
        return negocios;
    }

    //Método que adiciona objetos da classe Mafiosos à lista
    public void addNegocio(Negocio negocio) {
        negocios.add(negocio);
    }

    public Negocio getNegocio(String nomeNegocio, int negocioId, boolean isByName) {
        //Redefine a variavel negocio para null
        negocioSelecionado = null;
        if (isByName) {
            for (Negocio negocio : negocios) {
                System.out.println("nomeNegocio " + nomeNegocio);
                System.out.println("negocio.getNome() " + negocio.getNome());
                if (nomeNegocio.equals(negocio.getNome())) {
                    negocioSelecionado = negocio;
                }
            }
        } else {
            return negocios.get(negocioId);
        }

        System.out.println("negocioSelecionado " + negocioSelecionado.getNome());
        return negocioSelecionado;
    }

    //Método que devolve a lista de mafiosos na família 
    public ArrayList<Mafioso> getMafiosos() {
        return mafiosos;
    }

    //Método que adiciona objetos da classe Mafiosos à lista
    public void addMafioso(Mafioso mafioso) {
        mafiosos.add(mafioso);
    }

    //Método que retorna o boss da família
    public Boss getBoss() {
        return boss;
    }

    //Método que atribui um boss à família
    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    //Método que retorna o consiglieri da família
    public Consiglieri getConsiglieri() {
        return consiglieri;
    }

    //Método que atribui um Consiglieri à família
    public void setConsiglieri(Consiglieri consiglieri) {
        this.consiglieri = consiglieri;
    }

    //Método que retorna o underboss da família
    public Underboss getUnderboss() {
        return underboss;
    }

    //Método que atribui um underboss à familia
    public void setUnderboss(Underboss underboss) {
        this.underboss = underboss;
    }

    //Método que devolve a lista com os caporegime da família 
    public ArrayList<CapoRegime> getCapoRegimes() {
        return caporegimes;
    }

    //Método que adiciona um caporegime à lista dos caporegimes da família
    public void addCapoRegime(CapoRegime caporegime) {
        caporegimes.add(caporegime);
    }

    //Método que remove um capoRegime da lista dos caporegimes da família
    public void removeCapoRegime(String capoRegimeNome) {
        caporegimes.removeIf(capoRegime -> capoRegime.getNome().equals(capoRegimeNome));
    }

    //Método que retorna o caporegime na qual o seu ccID seja igual ao valor do ID introduzido como parâmetro
    public CapoRegime getCapoRegime(int capoRegimeId) {
        //Redefine a variavel capoRegime para null
        capoRegimeSelecionado = null;

        for (CapoRegime capoRegime : caporegimes) {
            if (capoRegimeId == capoRegime.getCcId()) {
                capoRegimeSelecionado = capoRegime;
            } else {
                capoRegimeSelecionado = null;
            }
        }

        return capoRegimeSelecionado;

    }

    //Método que devolve a lista com os soldiers da família 
    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }

    //Método que adiciona um soldier à lista dos soldiers da família
    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    //Método que remove um soldier da lista dos soldiers da família
    public void removeSoldier(String soldierName) {
        soldiers.removeIf(soldier -> soldier.getNome().equals(soldierName));
    }

    //Método que retorna o nome da família
    public String getNome() {
        return nome;
    }

    //Método que retorna a riqueza da familia
    public double getRiqueza() {
        return riqueza;
    }

    //Metodo que retorna o patrimonio da familia
    public double getPatrimonio() {
        return patrimonio;
    }
    
    //Retorna o ID da familia
    public int getFamiliaId() {
        return familiaId;
    }
    
    //Método que atribui um novo valor à riqueza
    public void setRiqueza(double riqueza) {
        this.riqueza = riqueza;
    }
    
    //Atribui um novo valor ao patrimonio
    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    //Retorna os membros que passaram para o obituario da familia
    public ArrayList<Object> getObituarioFamiliares() {
        return obituarioFamiliares;
    }

    //Método que adiciona um soldier à lista dos soldiers da família
    public void addFamiliarObituario(Object familiar) {
        obituarioFamiliares.add(familiar);
    }

    //Retorn o custo fixo da familia
    public double getCustoFixo() {
        return custoFixo;
    }

    //Atribui um novo valor ao tal custo fixo
    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }

    //Override do método toString
    @Override
    public String toString() {
        String texto;
        texto = "\n" + "Id da Familia: " + familiaId + "\n";
        texto += "Nome da Familia: " + nome + "\n";
        texto += "Riqueza da Familia: " + riqueza + "\n";
        texto += "Patrimonio da Familia: " + patrimonio;
        return texto;
    }
}
