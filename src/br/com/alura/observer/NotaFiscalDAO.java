package br.com.alura.observer;

import br.com.alura.domain.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNotaFiscal {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Salva na Base de Dados");
    }
}
