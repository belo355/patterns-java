package orcamento;

import http.HttpAdapter;

import java.util.Map;


public class RegistroOrcamento {

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if(!orcamento.isFinalizado()){
            throw new DomainException("orcamento nao finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = null;
//        dados = new Map.of(
//                "valor", orcamento.getValor(),
//                "quantidadeItens", orcamento.getQuantidadesItens());

        http.post(url, dados);
    }
}
