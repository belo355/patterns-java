import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import imposto.TipoImposto;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class Teste {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("11551"));
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();

        BigDecimal testeCalc = calc.calcular(new ICMS(), orcamento);
        System.out.println(testeCalc);
    }
}
