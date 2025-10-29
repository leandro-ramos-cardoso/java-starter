import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        int meses = idade * 12;

        System.out.printf("Tenho %d anos que é equivalente a %d meses.", idade, meses);

        input.close();
    }
}
