package br.com.alura.observer;

import br.com.alura.domain.NotaFiscal;

public class Impressora implements AcaoAposGerarNotaFiscal {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Imprime nota fiscal");
    }
}
