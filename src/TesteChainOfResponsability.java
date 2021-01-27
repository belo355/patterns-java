import desconto.CalculadoraDeDescontos;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteChainOfResponsability {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"),6);
        CalculadoraDeDescontos calcDesconto = new CalculadoraDeDescontos();

        System.out.println(calcDesconto.calcular(orcamento));

    }
}
