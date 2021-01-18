package br.com.alura.strategy;

import br.com.alura.domain.Imposto;
import br.com.alura.domain.Orcamento;

public class Main {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        // Calculando o ISS
        calculador.realizaCalculo(orcamento, iss);

        // Calculando o ICMS
        calculador.realizaCalculo(orcamento, icms);
    }

}
