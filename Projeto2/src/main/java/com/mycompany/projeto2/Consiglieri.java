package com.mycompany.projeto2;

public class Consiglieri extends Mafioso {
    private double aumentoValorBaseTributabel;
    private Familia familia;
    private Negocio negocio;
    public Consiglieri(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem) {
        super(familia,nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, linhagem);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void expandirNegocio(int negocioId){
        
        negocio = familia.getNegocio(negocioId);

        if(getEstratega() > 50){
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 100;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        }
        
        if(getEstratega() > 70){
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 200;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        }
        
        if(getEstratega() > 90){
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 500;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        }
    }
}
