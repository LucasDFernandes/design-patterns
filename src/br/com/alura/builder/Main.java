package br.com.alura.builder;

import br.com.alura.domain.ItemDaNota;
import br.com.alura.domain.NotaFiscal;

public class Main {

    public static void main(String[] args) {
        NotaFiscalBuilder criador = new NotaFiscalBuilder();
        criador.paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("entregar nf pessoalmente")
                .naDataAtual();

        NotaFiscal nf = criador.constroi();
        System.out.println(nf.getValorBruto());
    }
}
