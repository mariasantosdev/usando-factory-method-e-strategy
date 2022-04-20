package model;

import java.math.BigDecimal;

public class FuncionarioDeTempoIntegral extends Funcionario {

    private BigDecimal bancoDeHoras;

    public void setBancoDeHoras(BigDecimal bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }

    @Override
    public Funcionario create(String nome) {
        FuncionarioDeTempoIntegral funcionarioTempoIntegral = new FuncionarioDeTempoIntegral();
        double id = (Math.random() * 1001) + 1000;
        funcionarioTempoIntegral.setId((long) id);
        funcionarioTempoIntegral.setNome(nome);
        funcionarioTempoIntegral.setSalario(new BigDecimal("5.000"));
        funcionarioTempoIntegral.setBancoDeHoras(new BigDecimal("100.00"));
        return funcionarioTempoIntegral;
    }

    @Override
    public String toString() {
        return "FuncionarioDeTempoIntegral{" +
                "bancoDeHoras=" + bancoDeHoras +
                "} " + super.toString();
    }
}
