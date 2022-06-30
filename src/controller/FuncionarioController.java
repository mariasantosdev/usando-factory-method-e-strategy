package controller;

import model.Funcionario;
import model.Tipo;

import javax.swing.*;
import java.math.BigDecimal;

public class FuncionarioController {
    public Funcionario contratacao(Tipo tipo, String nomeFuncionario, BigDecimal salario) {
        return tipo.fabricaFuncionario(nomeFuncionario, salario);
    }

    public String abreMenu() {
        return JOptionPane.showInputDialog(null, "Escolha uma letra para começar o jogo sendo: " +
                "I(Cria funcionário integral), T(Cria funcionário temporário), P(Criar funcionário parcial), " +
                "E(Criar funcionário estagiário)");
    }

    public String adicionaNome() {
        return JOptionPane.showInputDialog("Digite o nome do funcionário que você quer adicionar");
    }

    public BigDecimal adicionaSalario() {
        return new BigDecimal(JOptionPane.showInputDialog("Digite o salário do funcionário"));
    }
}
