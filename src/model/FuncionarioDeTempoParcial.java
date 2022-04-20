package model;

import java.math.BigDecimal;

public class FuncionarioDeTempoParcial extends Funcionario {

        @Override
        public Funcionario create(String nome) {
                FuncionarioDeTempoIntegral funcionarioTempoIntegral = new FuncionarioDeTempoIntegral();
                double id = (Math.random() * 1001) + 1000;
                funcionarioTempoIntegral.setId((long) id);
                funcionarioTempoIntegral.setNome(nome);
                funcionarioTempoIntegral.setSalario(new BigDecimal("2.000"));
                return funcionarioTempoIntegral;
        }
}
