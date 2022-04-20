package model;

public enum Tipo {
    I("Integral") {
        @Override
        public Funcionario fabricaFuncionario(String nomeFuncionario) {
          return new FuncionarioDeTempoIntegral().create(nomeFuncionario);
        }
    },
    P("Parcial") {
        @Override
        public Funcionario fabricaFuncionario(String nomeFuncionario) {
            return new FuncionarioDeTempoParcial().create(nomeFuncionario);
        }
    },
    T("Temporário") {
        public Funcionario fabricaFuncionario(String nomeFuncionario) {
            return new FuncionarioTemporario().create(nomeFuncionario);
        }
    },
    E("Estagiário") {
        public Funcionario fabricaFuncionario(String nomeFuncionario) {
            return new FuncionarioEstagiario().create(nomeFuncionario);
        }
    };
    private String nome;

    Tipo(String nome) {
        this.nome = nome;
    }

    public abstract Funcionario fabricaFuncionario(String nomeFuncionario);

}
