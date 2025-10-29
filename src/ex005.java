import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float numeroUm = input.nextFloat();

        System.out.println("Digite outro número: ");
        float numeroDois = input.nextFloat();

        float media = (numeroUm + numeroDois) / 2;

        System.out.println("A média vale " + media);

        input.close();
    }
}
