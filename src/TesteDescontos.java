import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"),6);
        CalculadoraDeDescontos calcDesconto = new CalculadoraDeDescontos();

        BigDecimal valor_desconto = calcDesconto.calcular(orcamento);
        System.out.println(valor_desconto);
    }
}
