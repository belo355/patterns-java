import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"),6);
        CalculadoraDeDescontos calcDesconto = new CalculadoraDeDescontos();

        System.out.println(calcDesconto.calcular(orcamento));

    }
}
