package com.mycompany.projeto2;
import java.util.ArrayList;

public class Familia {
    //Variáveis de Instância
    private String nome;
    private double riqueza, patrimonio;
    private ArrayList<Mafioso> mafiosos;
    private ArrayList<Boss> bosses;
    private ArrayList<Underboss> underbosses;
    private ArrayList<Consiglieri> consiglieris;
    private ArrayList<CapoRegime> caporegimes;
    private ArrayList<Soldier> soldiers;
    
    //Construtor
    public Familia(String nome, double riqueza, double patrimonio){
        this.nome= nome;
        this.riqueza= riqueza;
        this.patrimonio= patrimonio;
        mafiosos = new ArrayList<Mafioso>();
        bosses = new ArrayList<Boss>();
        underbosses = new ArrayList<Underboss>();
        consiglieris = new ArrayList<Consiglieri>();
        caporegimes = new ArrayList<CapoRegime>();
        soldiers = new ArrayList<Soldier>();
    }

    //Método que devolve a lista de mafiosos na família 
    public ArrayList<Mafioso> getMafiosos() {
        return mafiosos;
    }

    //Método que adiciona objetos da classe Mafiosos à lista
    public void addMafioso(Mafioso mafioso) {
        mafiosos.add(mafioso);
    }
    
    //Método que devolve a lista com o boss da família 
    public ArrayList<Boss> getBoss(){
        return bosses;
    }
    
    //Método que adiciona o boss à lista dos boss da família
    public void addBoss(Boss boss){
        bosses.add(boss);
    }
    
    //Método que devolve a lista com o underboss da família 
    public ArrayList<Underboss> getUnderBoss(){
        return underbosses;
    }
    
    //Método que adiciona o underboss à lista dos underboss da família
    public void addUnderboss(Underboss underboss){
        underbosses.add(underboss);
    }
    
    //Método que devolve a lista com o consiglieri da família 
    public ArrayList<Consiglieri> getConsiglieri(){
        return consiglieris;
    }
    
    //Método que adiciona o consiglieri à lista dos consiglieri da família
    public void addConsiglieri(Consiglieri consiglieri){
        consiglieris.add(consiglieri);
    }
    
    //Método que devolve a lista com os caporegime da família 
    public ArrayList<CapoRegime> getCapoRegime(){
        return caporegimes;
    }
    
    //Método que adiciona um caporegime à lista dos caporegimes da família
    public void addCapoRegime(CapoRegime caporegime){
        caporegimes.add(caporegime);
    }
    
    //Método que devolve a lista com os soldiers da família 
    public ArrayList<Soldier> getSoldiers(){
        return soldiers;
    }
    
    //Método que adiciona um soldier à lista dos soldiers da família
    public void addSoldier(Soldier soldier){
        soldiers.add(soldier);
    }

    //Métodos Seletores
    public String getNome() {
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

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }
    
    //Override do método toString
    @Override
    public String toString(){
        String texto;
        texto = "Nome da Familia: "+nome+"\n";
        texto += "Riqueza da Familia: "+riqueza+"\n";
        texto += "Patrimonio da Familia: "+patrimonio;
        return texto;
    }
}

