package br.com.alura.state;

import br.com.alura.domain.Orcamento;

public class Aprovado implements EstadoOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.02));
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
