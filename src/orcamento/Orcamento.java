package orcamento;

import orcamento.situacao.EmAnalise;
import orcamento.situacao.Finalizado;
import orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        }catch (IllegalArgumentException | InterruptedException e){
            throw new RuntimeException(e);
        }
        return this.valor;
    }

    public int getQuantidadesItens() {
        return itens.size();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calculaDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void adicionaItem(Orcavel item){
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
    public void setSituacao(SituacaoOrcamento situacao){
        this.situacao = situacao;
    }

    public boolean isFinalizado(){
        return situacao instanceof Finalizado;
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
