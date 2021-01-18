package br.com.alura.state;

import br.com.alura.domain.Orcamento;

public class Main {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500);
        reforma.aplicaDescontoExtra();

        System.out.println(reforma.getValor());

        reforma.aprova();
        reforma.aplicaDescontoExtra();

        System.out.println(reforma.getValor());

        reforma.finaliza();
    }
}
