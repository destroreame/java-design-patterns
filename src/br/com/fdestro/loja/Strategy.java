package br.com.fdestro.loja;

import br.com.fdestro.loja.imposto.CalculadoraDeImpostos;
import br.com.fdestro.loja.imposto.ICMS;
import br.com.fdestro.loja.imposto.ISS;
import br.com.fdestro.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Strategy {

    //Strategy
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"),2);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }
}
