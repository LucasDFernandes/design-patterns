package br.com.alura.strategy;

import br.com.alura.domain.Imposto;
import br.com.alura.domain.Orcamento;

public class ISS extends Imposto {

    public ISS(Imposto imposto) {
        super(imposto);
    }

    public ISS() {
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
    }

}
