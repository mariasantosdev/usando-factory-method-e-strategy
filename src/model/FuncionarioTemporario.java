package model;

import java.math.BigDecimal;

public class FuncionarioTemporario extends Funcionario {

    @Override
    public Funcionario create(String nome) {
        FuncionarioTemporario funcionarioTemporario = new FuncionarioTemporario();
        double id = (Math.random() * 1001) + 1000;
        funcionarioTemporario.setId((long) id);
        funcionarioTemporario.setNome(nome);
        funcionarioTemporario.setSalario(new BigDecimal("1000.00"));
        return funcionarioTemporario;
    }
}
