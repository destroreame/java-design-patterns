package br.com.fdestro.loja;

import br.com.fdestro.loja.desconto.CalculadoraDeDescontos;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ChainOfResponsability {

    //Chain of Responsability
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("1000"), 10);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento1));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
    }
}
