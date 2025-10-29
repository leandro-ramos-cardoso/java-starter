import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numeroUm = input.nextInt();

        System.out.println("Informe outro número: ");
        int numeroDois = input.nextInt();

        int soma = numeroUm + numeroDois;

        System.out.printf("A soma entre %d e %d vale %d.", numeroUm, numeroDois, soma);

        input.close();
    }
}
