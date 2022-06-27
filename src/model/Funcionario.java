package model;

import java.math.BigDecimal;

public abstract class Funcionario {
    private Long id;
    private String nome;
    private BigDecimal salario;
    private BigDecimal bonificacao;

    public BigDecimal getSalario() {
        return salario;
    }

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
