package br.com.fdestro.loja.pedido;

import br.com.fdestro.loja.orcamento.Orcamento;
import br.com.fdestro.loja.pedido.Acao.AcoesAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    //construtor com injeção de dependencia

    private List<AcoesAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcoesAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        // Observer
        acoes.forEach(a -> a.executarAcao(pedido));
    }
}