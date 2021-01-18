package br.com.alura.chainofresponsibility;

import br.com.alura.domain.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximoDesconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        } else {
            return proximoDesconto.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

}

