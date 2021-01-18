package br.com.alura.strategy;

import br.com.alura.domain.Imposto;
import br.com.alura.domain.Orcamento;

public class ICMS extends Imposto {

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    public ICMS() {
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
    }
}
