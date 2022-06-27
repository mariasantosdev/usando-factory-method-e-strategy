package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    public BigDecimal getBonificacao() {
        return super.getSalario().multiply(new BigDecimal("0.06"));
    }
}
