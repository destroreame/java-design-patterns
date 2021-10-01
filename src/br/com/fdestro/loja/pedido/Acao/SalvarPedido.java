package br.com.fdestro.loja.pedido.Acao;

import br.com.fdestro.loja.pedido.Pedido;

public class SalvarPedido implements AcoesAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido Salvo");
    }
}
