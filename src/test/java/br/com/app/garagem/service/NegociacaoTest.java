package br.com.app.garagem.service;

import br.com.app.garagem.domain.produto.Carro;
import br.com.app.garagem.domain.produto.Marca;
import br.com.app.garagem.domain.produto.Modelo;
import br.com.app.garagem.domain.produto.Cor;
import br.com.app.garagem.domain.venda.Cliente;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class NegociacaoTest {

    @Test
    public void clienteDeveSerCapazDeEscolherQualVeiculoComprar() {

        Modelo onix = new Modelo ("Onix", BigDecimal.valueOf(89000.0), Marca.CHEVROLET);

        Carro carroOnix = new Carro("321ASD", "123456A", 2023L, Cor.PRETO, onix, 5L);

        Cliente joao = new Cliente("João");



    }

}
