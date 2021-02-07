import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.ProxyOrcamento;

import java.math.BigDecimal;

public class TesteComposite {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionaItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionaItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionaItem(antigo);

        ProxyOrcamento proxyOrcamento = new ProxyOrcamento(novo);

        System.err.println(proxyOrcamento.getValor());
        System.err.println(proxyOrcamento.getValor());
    }
}
