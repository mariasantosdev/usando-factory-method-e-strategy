package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioTemporario extends Funcionario {

    private LocalDate dataDeFimDoContrato;

    public void setDataDeFimDoContrato(LocalDate dataDeFimDoContrato) {
        this.dataDeFimDoContrato = dataDeFimDoContrato;
    }

    @Override
    public Funcionario create(String nome) {
        FuncionarioTemporario funcionarioTemporario = new FuncionarioTemporario();
        double id = (Math.random() * 1001) + 1000;
        funcionarioTemporario.setId((long) id);
        funcionarioTemporario.setNome(nome);
        funcionarioTemporario.setSalario(new BigDecimal("1000.00"));
        funcionarioTemporario.setDataDeFimDoContrato(LocalDate.of(2023,11,9));
        return funcionarioTemporario;
    }

    @Override
    public String toString() {
        return "FuncionarioTemporario{" +
                "dataDeFimDoContrato=" + dataDeFimDoContrato +
                "} " + super.toString();
    }
}
