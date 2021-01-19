package br.com.alura.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.domain.ItemDaNota;
import br.com.alura.domain.NotaFiscal;
import br.com.alura.observer.AcaoAposGerarNotaFiscal;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private double impostos;
    private final List<ItemDaNota> todosItens = new ArrayList<>();
    private Calendar data;
    private String observacoes;
    private final List<AcaoAposGerarNotaFiscal> posAcoes;

    public NotaFiscalBuilder() {
        this.posAcoes = new ArrayList<>();
    }

    public NotaFiscal constroi() {
        NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
        posAcoes.forEach(acaoAposGerarNotaFiscal -> acaoAposGerarNotaFiscal.executa(notaFiscal));
        return notaFiscal;
    }

    public void adicionaAcao(AcaoAposGerarNotaFiscal acaoAposGerarNotaFiscal) {
        this.posAcoes.add(acaoAposGerarNotaFiscal);
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();
        return this;
    }

}
