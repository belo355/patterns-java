package orcamento;

import orcamento.situacao.EmAnalise;
import orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadesItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadesItens) {
        this.valor = valor;
        this.quantidadesItens = quantidadesItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadesItens() {
        return quantidadesItens;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calculaDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void setSituacao(SituacaoOrcamento situacao){
        this.situacao = situacao;
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }
}
