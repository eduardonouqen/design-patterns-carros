package br.com.app.garagem.domain.venda;

import java.math.BigDecimal;

public class Cliente extends Pessoa implements Orcamento {

    private BigDecimal salario;

    public Cliente(String nome, BigDecimal salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public BigDecimal getOrcamento() {
        return salario.multiply(new BigDecimal("10"));
    }

}
