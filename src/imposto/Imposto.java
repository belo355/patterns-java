package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcula(Orcamento orcamento);
}
