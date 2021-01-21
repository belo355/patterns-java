package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoQuantidadesItens(
                            new DescontoSomaValorProdutos(
                            new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
