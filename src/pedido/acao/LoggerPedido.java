package pedido.acao;

import pedido.Pedido;

public class LoggerPedido implements AcaoAposGerarPedido {
    @Override
    public void executar(Pedido pedido) {
        System.err.println("logger apos receber pedido");
    }
}
