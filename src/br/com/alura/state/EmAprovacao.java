package br.com.alura.state;

import br.com.alura.domain.Orcamento;

public class EmAprovacao implements EstadoOrcamento{

    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.05));
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException();
    }
}
