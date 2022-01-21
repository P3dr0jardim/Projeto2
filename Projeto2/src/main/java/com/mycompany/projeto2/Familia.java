package com.mycompany.projeto2;

import java.util.ArrayList;

public class Familia {

    //Variáveis de Instância
    private int familiaId;
    private String nome;
    private double riqueza, patrimonio, custoFixo;
    private ArrayList<Mafioso> mafiosos;
    private Boss boss;
    private ArrayList<Underboss> underbosses;
    private ArrayList<Consiglieri> consiglieris;
    private ArrayList<CapoRegime> caporegimes;
    private ArrayList<Soldier> soldiers;
    private ArrayList<Object> obituarioFamiliares;
    private ArrayList<Negocio> negocios;
    private ArrayList<Negocio> tiposDeNegocio;
    private Familia[] familiasComNegociosPartilhados;

    //Construtor
    public Familia(int familiaId, String nome, double riqueza, double patrimonio, double custoFixo) {
        this.familiaId = familiaId;
        this.nome = nome;
        this.riqueza = riqueza;
        this.patrimonio = patrimonio;
        this.custoFixo = custoFixo;
        mafiosos = new ArrayList<Mafioso>();
        underbosses = new ArrayList<Underboss>();
        consiglieris = new ArrayList<Consiglieri>();
        caporegimes = new ArrayList<CapoRegime>();
        soldiers = new ArrayList<Soldier>();
        obituarioFamiliares = new ArrayList<Object>();
        negocios = new ArrayList<Negocio>();
        tiposDeNegocio = new ArrayList<Negocio>();
        familiasComNegociosPartilhados = new Familia[5];
    }

    public ArrayList<Negocio> getNegocios() {
        return negocios;
    }

    public void setNegocios(ArrayList<Negocio> negocios) {
        this.negocios = negocios;
    }

    //Método que adiciona objetos da classe Mafiosos à lista
    public void addNegocio(Negocio negocio) {
        negocios.add(negocio);
    }

    public Negocio getNegocio(int id) {
        return negocios.get(id);
    }

    public ArrayList<Negocio> getTiposDeNegocio() {
        return tiposDeNegocio;
    }

    public void setTiposDeNegocio(ArrayList<Negocio> tiposDeNegocio) {
        this.tiposDeNegocio = tiposDeNegocio;
    }

    //Método que devolve a lista de mafiosos na família 
    public ArrayList<Mafioso> getMafiosos() {
        return mafiosos;
    }

    //Método que adiciona objetos da classe Mafiosos à lista
    public void addMafioso(Mafioso mafioso) {
        mafiosos.add(mafioso);
    }

    public Familia[] getFamiliasComNegociosPartilhados() {
        return familiasComNegociosPartilhados;
    }

    public void setFamiliasComNegociosPartilhados(Familia[] familiasComNegociosPartilhados) {
        this.familiasComNegociosPartilhados = familiasComNegociosPartilhados;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    //Método que devolve a lista com o underboss da família 
    public ArrayList<Underboss> getUnderBosses() {
        return underbosses;
    }

    //Método que devolve a lista com o underboss da família 
    public Underboss getUnderBoss() {
        return underbosses.get(0);
    }

    //Método que adiciona o underboss à lista dos underboss da família
    public void addUnderboss(Underboss underboss) {
        underbosses.add(underboss);
    }

    //Método que devolve a lista com o consiglieri da família 
    public ArrayList<Consiglieri> getConsiglieris() {
        return consiglieris;
    }

    public Consiglieri getConsiglieri() {
        return consiglieris.get(0);
    }

    //Método que adiciona o consiglieri à lista dos consiglieri da família
    public void addConsiglieri(Consiglieri consiglieri) {
        consiglieris.add(consiglieri);
    }

    //Método que devolve a lista com os caporegime da família 
    public ArrayList<CapoRegime> getCapoRegimes() {
        return caporegimes;
    }

    //Método que adiciona um caporegime à lista dos caporegimes da família
    public void addCapoRegime(CapoRegime caporegime) {
        caporegimes.add(caporegime);
    }

    public CapoRegime getCapoRegime(int id) {
        System.out.println("CapoRegime: " + caporegimes.get(id));
        return caporegimes.get(id);
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

    //Métodos Seletores
    public String getNomeFamilia() {
        return nome;
    }

    public double getRiqueza() {
        return riqueza;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    //Métodos Modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRiqueza(double riqueza) {
        this.riqueza = riqueza;
    }

    public int getFamiliaId() {
        return familiaId;
    }

    public void setFamiliaId(int familiaId) {
        this.familiaId = familiaId;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public ArrayList<Object> getObituarioFamiliares() {
        return obituarioFamiliares;
    }

    public void setObituarioFamiliares(ArrayList<Object> obituarioFamiliares) {
        this.obituarioFamiliares = obituarioFamiliares;
    }

    //Método que adiciona um soldier à lista dos soldiers da família
    public void addFamiliarObituario(Object familiar) {
        obituarioFamiliares.add(familiar);
    }

    public double getCustoFixo() {
        return custoFixo;
    }

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
