package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FuncionarioDeTempoParcial extends Funcionario {

    public FuncionarioDeTempoParcial(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    public BigDecimal getBonificacao() {
        return super.getSalario().multiply(new BigDecimal("0.09"));
    }
}
