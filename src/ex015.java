import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("        MENU");
        System.out.println("=====================");
        System.out.println("[1] Hot Dog");
        System.out.println("[2] Pizza");
        System.out.println("[3] Sorvete");
        System.out.println("[4] Hamburguer");
        System.out.println("[5] Misto");
        System.out.println("[6] Pastel");
        System.out.println("[7] Açaí");
        System.out.println("[8] Empada");
        System.out.println("[9] Trufa");
        System.out.println("[10] Coxinha");
        System.out.println("=====================");
        System.out.print("Escolha uma opção (1 a 10): ");

        int opcao = input.nextInt();

        System.out.println("=====================");

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Hot Dog 🌭");
                break;
            case 2:
                System.out.println("Você escolheu Pizza 🍕");
                break;
            case 3:
                System.out.println("Você escolheu Sorvete 🍨");
                break;
            case 4:
                System.out.println("Você escolheu Hamburguer 🍔");
                break;
            case 5:
                System.out.println("Você escolheu Misto 🥪");
                break;
            case 6:
                System.out.println("Você escolheu Pastel 🥟");
                break;
            case 7:
                System.out.println("Você escolheu Açaí 🍧");
                break;
            case 8:
                System.out.println("Você escolheu Empada 🥧");
                break;
            case 9:
                System.out.println("Você escolheu Trufa 🍫");
                break;
            case 10:
                System.out.println("Você escolheu Coxinha 🐔");
                break;
            default:
                System.out.println("Opção inválida! Escolha entre 1 e 10.");
        }

        System.out.println("=====================");
        System.out.println("Obrigado pela preferência!");
    }
}