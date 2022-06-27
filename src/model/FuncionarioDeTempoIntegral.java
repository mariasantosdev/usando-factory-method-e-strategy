package model;

import java.math.BigDecimal;

public class FuncionarioDeTempoIntegral extends Funcionario {

    public FuncionarioDeTempoIntegral(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    public BigDecimal getBonificacao() {
        return super.getSalario().multiply(new BigDecimal("0.15"));
    }
}
