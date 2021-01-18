package br.com.alura.state;

import br.com.alura.domain.Orcamento;

public class Finalizado implements EstadoOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException();
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
        throw new RuntimeException();
    }
}
