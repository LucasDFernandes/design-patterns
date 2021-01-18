package br.com.alura.chainofresponsibility;

import br.com.alura.domain.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximoDesconto);

}
