package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto next;

    public Desconto(Desconto next) {
        this.next = next;
    }

    protected BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuaCalculo(orcamento);
        }
        return next.calcular(orcamento);
    }

    protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);
}
