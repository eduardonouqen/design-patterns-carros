package br.com.app.garagem.service;

import br.com.app.garagem.domain.produto.*;
import br.com.app.garagem.domain.venda.Cliente;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class NegociacaoTest {


    @Test
    public void clienteDeveSerCapazDeEscolherQualVeiculoComprar(){

        Modelo onix = new Modelo("Onix", BigDecimal.valueOf(89000.0),Marca.CHEVROLET);

        Carro carroOnix = new Carro("321ASD", "123456A", 2023L, Cor.PRETO, onix, 5L);

        Cliente joao = new Cliente("João", BigDecimal.valueOf(25000.0));

        OrcamentoService service = new OrcamentoService(joao);

        Carro carro = service.selecionarVeiculoPorOrcamento(Arrays.asList(carroOnix));

        assertNotNull(carro);
    }
}