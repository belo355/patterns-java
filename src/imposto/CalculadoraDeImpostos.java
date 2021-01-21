package imposto;

import orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Imposto imposto, Orcamento orcamento) {
        return imposto.calcula(orcamento);
    }
}

