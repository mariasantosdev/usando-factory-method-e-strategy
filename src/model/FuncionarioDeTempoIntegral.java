package model;

import java.math.BigDecimal;

public class FuncionarioDeTempoIntegral extends Funcionario {

    @Override
    public Funcionario create(String nome) {
            FuncionarioDeTempoIntegral funcionarioTempoIntegral = new FuncionarioDeTempoIntegral();
            double id = (Math.random() * 1001) + 1000;
            funcionarioTempoIntegral.setId((long) id);
            funcionarioTempoIntegral.setNome(nome);
            funcionarioTempoIntegral.setSalario(new BigDecimal("5.000"));
            return funcionarioTempoIntegral;
    }
}
