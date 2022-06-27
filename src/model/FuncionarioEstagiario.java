package model;

import java.math.BigDecimal;

public class FuncionarioEstagiario extends Funcionario {

    public FuncionarioEstagiario(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    public BigDecimal getBonificacao() {
        return super.getSalario().multiply(new BigDecimal("0.03"));
    }

}
