package br.com.alura.observer;

import br.com.alura.builder.NotaFiscalBuilder;
import br.com.alura.domain.ItemDaNota;
import br.com.alura.domain.NotaFiscal;

public class Main {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDAO());
        builder.adicionaAcao(new EnviadorDeSMS());
        builder.adicionaAcao(new Impressora());

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("entregar notaFiscal pessoalmente")
                .naDataAtual()
                .constroi();

        System.out.println(notaFiscal.getValorBruto());
    }
}
