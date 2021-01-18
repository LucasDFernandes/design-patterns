package br.com.alura.chainofresponsibility;

import br.com.alura.domain.Orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto {

    private Desconto proximoDesconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else {
            return proximoDesconto.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

}
