import javax.swing.*;
import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(
                null,
                "Digite seu nome:",
                "Formulário de Cadastro",
                JOptionPane.QUESTION_MESSAGE
        );

        int idade = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite sua idade:",
                "Formulário de Cadastro",
                JOptionPane.QUESTION_MESSAGE
        ));

        JOptionPane.showMessageDialog(
                null,
                "Nome: " + nome + "\nIdade: " + idade,
                "Resumo do Cadastro",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
