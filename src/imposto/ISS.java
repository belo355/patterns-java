package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto{

    public ISS(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
