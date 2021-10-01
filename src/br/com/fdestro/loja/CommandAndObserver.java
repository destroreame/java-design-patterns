package br.com.fdestro.loja;

import br.com.fdestro.loja.pedido.Acao.EnviarEmailPedido;
import br.com.fdestro.loja.pedido.Acao.SalvarPedido;
import br.com.fdestro.loja.pedido.GeraPedido;
import br.com.fdestro.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.Arrays;

public class CommandAndObserver {

    public static void main(String[] args) {
        String cliente = "Fernando";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int qtdeItens = 6;

        //Command  - Técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command;
        //Observer
        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, qtdeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedido(), new EnviarEmailPedido()));
        handler.executar(geraPedido);
    }

}
