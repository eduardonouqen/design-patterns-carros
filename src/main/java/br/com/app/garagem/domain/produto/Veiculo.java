package br.com.app.garagem.domain.produto;

import java.math.BigDecimal;

public abstract class Veiculo {

    private String chassi;
    private String placa;
    private Long ano;
    private Cor cor;
    private Modelo modelo;

    public Veiculo(String chassi, String placa, Long ano, Cor cor, Modelo modelo) {
        this.chassi = chassi;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public Long getAno() {
        return ano;
    }

    public Cor getCor() {
        return cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public abstract BigDecimal getValorFipe();
}
