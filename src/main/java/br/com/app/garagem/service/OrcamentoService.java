package br.com.app.garagem.service;

import br.com.app.garagem.domain.produto.Veiculo;
import br.com.app.garagem.domain.venda.Orcamento;
import java.util.List;
import java.util.function.Predicate;

public class OrcamentoService {

    private Orcamento orcamento;

    public OrcamentoService(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public <T extends Veiculo> T selecionarVeiculoPorOrcamento(List<T> veiculos) {

        return veiculos.stream().filter(menorIgual).findFirst().orElse(null);

    }

    private Predicate<? super Veiculo> menorIgual = v -> v.getValorFipe().compareTo(orcamento.getOrcamento()) <= 0;

}
