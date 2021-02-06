import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteStrategy {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("11551"),1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        BigDecimal testeCalc = calculadora.calcular(orcamento, new ICMS(null));
        System.out.println(testeCalc);
    }
}
