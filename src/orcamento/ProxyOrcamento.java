package orcamento;

import java.math.BigDecimal;

public class ProxyOrcamento extends Orcamento {

    private Orcamento orcamento;
    private BigDecimal valor;

    public ProxyOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
        this.valor = orcamento.getValor();
    }

    public BigDecimal getValor(){
        if(this.valor == null){
            return orcamento.getValor();
        }
        return this.valor;
    }
}
