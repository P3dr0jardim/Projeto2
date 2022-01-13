package com.mycompany.projeto2;

public class Consiglieri extends Mafioso {

    private double aumentoValorBaseTributabel;
    private Familia familia;
    private Negocio negocio;

    public Consiglieri(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidaSerPreso, boolean estaPreso, boolean linhagem) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidaSerPreso, estaPreso, linhagem);
        this.familia = familia;
    }

    public void expandirNegocio(int negocioId) {
        System.out.println("negocioId: " + negocioId);

        System.out.println("familia" + familia);
        negocio = familia.getNegocio(negocioId);

        System.out.println("getEstratega() " + getEstratega());

        if (getEstratega() > 50) {
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 100;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        } else if (getEstratega() > 70) {
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 200;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        } else if (getEstratega() > 90) {
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 500;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        } else {
            System.out.println("negocio.getValorBaseTributavel()" + negocio.getValorBaseTributavel());
        }

        System.out.println(negocio.toString());
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
