package model;

import java.math.BigDecimal;

public abstract class Funcionario {
    private Long id;
    private String nome;
    private BigDecimal salario;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public abstract Funcionario create(String nome);

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
