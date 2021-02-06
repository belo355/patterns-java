import imposto.CalculadoraDeImpostos;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDecorator {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS(null)));
    }
}
