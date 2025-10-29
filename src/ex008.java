import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroUm = input.nextInt();

        System.out.println("Digite outro número: ");
        int numeroDois = input.nextInt();

        int somaComNumeroDois = numeroUm + numeroDois;

        System.out.println("Total: " + somaComNumeroDois);

        input.close();
    }
}
