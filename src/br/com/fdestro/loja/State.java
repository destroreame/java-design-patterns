package br.com.fdestro.loja;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class State {

    // State
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 10);
        System.out.println("0 - " + orcamento.getValor());

        orcamento.aplicarDescontoExtra();
        System.out.println("1 - " + orcamento.getValor());

        orcamento.aprovar();
        orcamento.aplicarDescontoExtra();
        System.out.println("2 - " + orcamento.getValor());
    }
}
