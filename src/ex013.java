import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia da semana desejado: ");
        String diaSemana = input.nextLine();

        switch (diaSemana) {
            case "domingo":
                System.out.println("Primeiro dia da semana");
                break;
            case "segunda":
                System.out.println("Segundo dia da semana");
                break;
            case "terca":
                System.out.println("Terceiro dia da semana");
                break;
            case "quarta":
                System.out.println("Quarto dia da semana");
                break;
            case "quinta":
                System.out.println("Quinto dia da semana");
                break;
            case "sexta":
                System.out.println("Sexto dia da semana");
                break;
            case "sabado":
                System.out.println("Setimo dia da semana");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        input.close();
    }

}
