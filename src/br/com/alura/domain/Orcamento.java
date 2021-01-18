package br.com.alura.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.state.EmAprovacao;
import br.com.alura.state.EstadoOrcamento;

public class Orcamento {

    private double valor;
    private final List<Item> itens;

    private EstadoOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<Item>();
        estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public EstadoOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }
    public void finaliza() {
        estadoAtual.finaliza(this);
    }

}
