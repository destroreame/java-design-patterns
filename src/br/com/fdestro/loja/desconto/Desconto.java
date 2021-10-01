package br.com.fdestro.loja.desconto;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    // Template Method
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    protected abstract boolean deveAplicar(Orcamento orcamento);
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}
