package br.com.alura.chainofresponsibility;

import br.com.alura.domain.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximoDesconto) {

    }
}
