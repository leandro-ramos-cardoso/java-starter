import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        int decrementoValor = numero - 1;

        System.out.printf("%d decrementando em - 1 equivale a %d.", numero, decrementoValor);

        input.close();
    }
}