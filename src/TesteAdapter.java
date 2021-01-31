import http.JavaHttpClient;
import orcamento.Orcamento;
import orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
        registroOrcamento.registrar(orcamento);
    }
}
