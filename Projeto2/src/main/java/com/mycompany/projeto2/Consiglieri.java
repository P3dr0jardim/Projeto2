package com.mycompany.projeto2;

public class Consiglieri extends Mafioso {

    private double aumentoValorBaseTributabel = 0;
    private Familia familia;
    private Negocio negocio;

    public Consiglieri(Familia familia, String nome, int ccId, int lealdade, int musculo, int inteligencia, int estratega, int carisma, int probabilidadeSerPreso, boolean estaPreso, boolean linhagem, boolean informador) {
        super(familia, nome, ccId, lealdade, musculo, inteligencia, estratega, carisma, probabilidadeSerPreso, estaPreso, linhagem, false);
        this.familia = familia;
    }

    public void expandirNegocio(String nomeNegocio) {

        negocio = familia.getNegocio(nomeNegocio, 0, true);
        System.out.println("Negocio: " + negocio);
        System.out.println("getEstratega() " + getEstratega());

        if (getEstratega() > 50 && getEstratega() < 70) {
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 100;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        } else if (getEstratega() >= 70 && getEstratega() <90) {
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 200;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        } else if (getEstratega() >= 90) {
            aumentoValorBaseTributabel = negocio.getValorBaseTributavel() + 500;
            negocio.setValorBaseTributavel(aumentoValorBaseTributabel);
        } else {
            System.out.println("negocio.getValorBaseTributavel()" + negocio.getValorBaseTributavel());
        }

        System.out.println(negocio.toString());
    }

    public void mafiaSitdown() {
        if (getEstratega() >= 80) {
            familia.setCustoFixo(familia.getCustoFixo() / 2);
        } else if (getEstratega() >= 50 && getEstratega() < 80) {
            familia.setCustoFixo(familia.getCustoFixo() / 4);
        } else if (getEstratega() < 50) {
            familia.setCustoFixo(familia.getCustoFixo() * 2);
        }
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
