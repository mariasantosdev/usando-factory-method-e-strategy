package model;

import java.math.BigDecimal;

public abstract class Funcionario {
    private String nome;
    private BigDecimal salario;
    private BigDecimal bonificacao;

    public BigDecimal getSalario() {
        return salario;
    }

    public BigDecimal getBonificacao() {
        return bonificacao;
    }

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", bonificacao=" + bonificacao +
                '}';
    }
}
