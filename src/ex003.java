import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numeroUm = input.nextInt();

        System.out.println("Informe outro número: ");
        int numeroDois = input.nextInt();

        int maior;

        if(numeroUm > numeroDois) {
            maior = numeroUm;
        } else {
            maior = numeroDois;
        }

        System.out.printf("O maior número é: %d", maior);

        input.close();
    }
}
