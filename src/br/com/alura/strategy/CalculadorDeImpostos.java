package br.com.alura.strategy;

import br.com.alura.domain.Imposto;
import br.com.alura.domain.Orcamento;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double icms = imposto.calcula(orcamento);
        System.out.println(icms); // imprimirá 50.0
    }
}
