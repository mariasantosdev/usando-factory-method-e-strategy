package model;

import java.math.BigDecimal;

public enum Tipo {
    I("Integral") {
        @Override
        public Funcionario fabricaFuncionario(String nomeFuncionario, BigDecimal salario) {
          return new FuncionarioDeTempoIntegral(nomeFuncionario, salario);
        }
    },
    P("Parcial") {
        @Override
        public Funcionario fabricaFuncionario(String nomeFuncionario, BigDecimal salario) {
            return new FuncionarioDeTempoParcial(nomeFuncionario, salario);
        }
    },
    T("Temporário") {
        public Funcionario fabricaFuncionario(String nomeFuncionario, BigDecimal salario) {
            return new FuncionarioTemporario(nomeFuncionario, salario);
        }
    },
    E("Estagiário") {
        public Funcionario fabricaFuncionario(String nomeFuncionario, BigDecimal salario) {
            return new FuncionarioEstagiario(nomeFuncionario, salario);
        }
    };
    private String nome;

    Tipo(String nome) {
        this.nome = nome;
    }

    public abstract Funcionario fabricaFuncionario(String nomeFuncionario, BigDecimal salario);

}
