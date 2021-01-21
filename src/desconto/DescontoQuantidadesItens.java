package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadesItens extends Desconto {

    public DescontoQuantidadesItens(Desconto next) {
        super(next);
    }

    @Override
    protected BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadesItens() > 5;
    }

}
