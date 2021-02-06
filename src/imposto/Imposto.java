package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro){
        this.outro = outro;
    }

    protected abstract BigDecimal realizaCalculo(Orcamento orcamento);

    public BigDecimal calcula(Orcamento orcamento){
        BigDecimal valorImposto = realizaCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outro != null){
            valorOutroImposto = outro.realizaCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    };
}
