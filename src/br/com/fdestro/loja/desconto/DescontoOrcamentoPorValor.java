package br.com.fdestro.loja.desconto;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoPorValor extends Desconto {

    public DescontoOrcamentoPorValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(("0.5")));
    }
}
