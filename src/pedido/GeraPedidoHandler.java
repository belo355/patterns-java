package pedido;

import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler  {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes){
        this.acoes = acoes;
    }
    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(acao -> acao.executar(pedido));
    }
}
