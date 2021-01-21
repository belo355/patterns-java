package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoSomaValorProdutos extends Desconto {

    public DescontoSomaValorProdutos(Desconto next) {
        super(next);
    }

    @Override
    protected BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
