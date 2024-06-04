package br.com.app.garagem.domain.produto;

import java.math.BigDecimal;

public class Modelo {

    private String descricao;
    private BigDecimal valor;
    private Marca marca;

    public Modelo(String descricao, BigDecimal valor, Marca marca) {
        this.descricao = descricao;
        this.valor = valor;
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Marca getMarca() {
        return marca;
    }

}
