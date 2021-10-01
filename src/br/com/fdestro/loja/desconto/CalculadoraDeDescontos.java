package br.com.fdestro.loja.desconto;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto =
                new DescontoOrcamentoPorItens(
                        new DescontoOrcamentoPorValor(
                                new SemDesconto(null)));

        return desconto.calcular(orcamento);
    }
}
