package br.com.alura.domain;

public abstract class Imposto {

    protected Imposto imposto;

    public Imposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public Imposto() {
    }

    public abstract double calcula(Orcamento orcamento);

    public double calculaOutroImposto(Orcamento orcamento) {
        if (imposto == null) {
            return 0;
        }
        return imposto.calcula(orcamento);
    }

}
