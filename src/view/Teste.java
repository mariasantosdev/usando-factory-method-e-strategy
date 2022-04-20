package view;

import controller.FuncionarioController;
import model.Funcionario;
import model.Tipo;

public class Teste {
    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();
        String opcaoEscolhida = funcionarioController.abreMenu();
        String nomeFuncionario = funcionarioController.adicionaNomeDoUsuario();
        Funcionario funcionario = funcionarioController.contratacao(Tipo.valueOf(opcaoEscolhida.toUpperCase()), nomeFuncionario);

        System.out.printf("Funcionário criado: " + funcionario.toString());
    }
}
