package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoSomaValorProdutos extends Desconto {

    public DescontoSomaValorProdutos(Desconto next) {
        super(next);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.2"));
        }
        return next.calcular(orcamento);
    }
}
