package br.com.alura.observer;

import br.com.alura.domain.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Envia email");
    }
}
