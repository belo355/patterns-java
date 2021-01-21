package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadesItens extends Desconto {

    public DescontoQuantidadesItens(Desconto next) {
        super(next);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadesItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return next.calcular(orcamento);
    }
}
