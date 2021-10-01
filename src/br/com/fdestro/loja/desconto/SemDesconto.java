package br.com.fdestro.loja.desconto;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto(Desconto proximo) {
        super(null);
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return true;
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
