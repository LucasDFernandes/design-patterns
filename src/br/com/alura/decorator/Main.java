package br.com.alura.decorator;

import br.com.alura.domain.Imposto;
import br.com.alura.domain.Orcamento;
import br.com.alura.strategy.ICMS;
import br.com.alura.strategy.ISS;

public class Main {

    public static void main(String[] args) {
        Imposto impostoComplexo = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        double valor = impostoComplexo.calcula(orcamento);

        System.out.println(valor);
    }
}
