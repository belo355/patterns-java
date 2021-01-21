package orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadesItens;

    public Orcamento(BigDecimal valor, int quantidadesItens) {
        this.valor = valor;
        this.quantidadesItens = quantidadesItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadesItens() {
        return quantidadesItens;
    }
}
