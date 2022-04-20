package controller;

import model.Funcionario;
import model.Tipo;

import javax.swing.*;

public class FuncionarioController {

    public Funcionario contratacao(Tipo tipo, String nomeFuncionario) {
       return tipo.fabricaFuncionario(nomeFuncionario);
    }

    public String abreMenu() {
        return JOptionPane.showInputDialog(null, "Escolha uma letra para começar o jogo sendo: " +
                "I(Cria funcionário integral), T(Cria funcionário temporárop), P(Criar funcionário parcial), " +
                "E(Criar funcionário estagiário)");
    }

    public String adicionaNomeDoUsuario() {
        return JOptionPane.showInputDialog("Digite o nome do usuário que você quer adicionar");
    }
}
