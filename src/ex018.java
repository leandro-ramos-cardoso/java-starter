import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("    * AUTO ATENDIMENTO *");
        System.out.println("============================");
        System.out.println("[1] - Agendar Consulta");
        System.out.println("[2] - Listar Consultas");
        System.out.println("[3] - Resultado de exames");
        System.out.println("[4] - Suporte Técnico");
        System.out.println("[5] - Falar com atendente");
        System.out.println("============================");

        System.out.println("Selecione uma opção: ");
        int opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Você escolheu Agendar Consulta");
                break;
            case 2:
                System.out.println("Você escolheu Listar Consultas");
                break;
            case 3:
                System.out.println("Você escolheu Resultado de exames");
                break;
            case 4:
                System.out.println("Você escolheu Suporte Técnico");
                break;
            case 5:
                System.out.println("Você escolheu Falar com atendente");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }

        input.close();
    }
}
