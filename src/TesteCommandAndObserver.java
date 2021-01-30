import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoBd;

import java.math.BigDecimal;
import java.util.Arrays;

public class TesteCommandAndObserver {

    //goal: gerar pedido
    public static void main(String[] args) {
        String cliente = "Ana";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = Integer.parseInt("4");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens); //TODO: simula a chamada de um cliente
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBd(), new EnviarEmailPedido()));
        handler.execute(gerador);
    }
}
