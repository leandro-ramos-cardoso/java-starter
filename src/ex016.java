import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("       CADASTRO");
        System.out.println("=====================");

        System.out.println("Digite seu nome: ");
        String name = input.nextLine();

        System.out.println("Digite seu sexo: ");
        String sexo = input.nextLine();

        System.out.println("Digite sua idade: ");
        int age = input.nextInt();

        if((age >= 18) && (sexo.equals("M"))) {
            System.out.printf("Homem maior de idade.");
        } else if ((age >= 18) && (sexo.equals("F"))) {
            System.out.println("Mulher maior de idade");
        }
    }
}
