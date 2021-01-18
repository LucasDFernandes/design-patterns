package br.com.alura.templatemethod;

import br.com.alura.domain.Orcamento;

public class ICPP extends TemplateImposto {

    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

}
