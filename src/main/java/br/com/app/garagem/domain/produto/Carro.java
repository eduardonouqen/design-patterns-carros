package br.com.app.garagem.domain.produto;

import java.math.BigDecimal;

public class Carro extends Veiculo {

    private Long quantidadePassageiros;

    public Carro(String chassi, String placa, Long ano, Cor cor, Modelo modelo, Long quantidadePassageiros) {
        super(chassi, placa, ano, cor, modelo);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public Long getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    @Override
    public BigDecimal getValorFipe() {
        // regra para carros
        return this.getModelo().getValor();
    }
}
