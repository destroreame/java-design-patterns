package br.com.fdestro.loja.imposto;

import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
