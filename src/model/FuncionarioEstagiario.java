package model;

import java.math.BigDecimal;

public class FuncionarioEstagiario extends Funcionario {

    private String instituicaoParceira;

    public void setInstituicaoParceira(String instituicaoParceira) {
        this.instituicaoParceira = instituicaoParceira;
    }

    @Override
    public Funcionario create(String nome) {
        FuncionarioEstagiario funcionarioEstagiario = new FuncionarioEstagiario();
        double id = (Math.random() * 1001) + 1000;
        funcionarioEstagiario.setId((long) id);
        funcionarioEstagiario.setNome(nome);
        funcionarioEstagiario.setSalario(new BigDecimal("500.00"));
        funcionarioEstagiario.setInstituicaoParceira("Grupo alura");
        return funcionarioEstagiario;
    }
}
