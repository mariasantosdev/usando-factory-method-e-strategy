package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    public BigDecimal getBonificacao() {
        return new BigDecimal("220.00");
    }
}
