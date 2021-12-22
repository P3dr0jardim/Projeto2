package com.mycompany.projeto2;

public class Familia {
    //Variáveis de Instância
    private String nome;
    private double riqueza, patrimonio;
    
    //Construtor
    public Familia(String nome, double riqueza, double patrimonio){
        this.nome= nome;
        this.riqueza= riqueza;
        this.patrimonio= patrimonio;
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

