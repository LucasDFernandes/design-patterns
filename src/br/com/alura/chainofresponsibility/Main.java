package br.com.alura.chainofresponsibility;

import br.com.alura.domain.Item;
import br.com.alura.domain.Orcamento;

public class Main {

    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);
    }
}
