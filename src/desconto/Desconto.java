package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto next;

    public Desconto(Desconto next){
        this.next = next;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
