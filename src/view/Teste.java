package view;

import controller.FuncionarioController;
import model.Funcionario;
import model.Tipo;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();
        String opcaoEscolhida = funcionarioController.abreMenu();
        String nomeFuncionario = funcionarioController.adicionaNome();
        BigDecimal salarioFuncionario = funcionarioController.adicionaSalario();
        Funcionario funcionario = funcionarioController.contratacao(Tipo.valueOf(opcaoEscolhida.toUpperCase()),
                nomeFuncionario, salarioFuncionario);

        System.out.printf("Funcionário criado : " + funcionario.toString() + " com a bonificação " + funcionario.getBonificacao());
    }
}
