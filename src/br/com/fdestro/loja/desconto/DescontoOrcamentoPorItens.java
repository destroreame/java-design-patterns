package br.com.fdestro.loja.desconto;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoPorItens extends Desconto {

    public DescontoOrcamentoPorItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(("0.1")));
    }


}
