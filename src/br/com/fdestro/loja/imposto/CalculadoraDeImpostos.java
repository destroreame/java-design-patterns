package br.com.fdestro.loja.imposto;
import br.com.fdestro.loja.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
