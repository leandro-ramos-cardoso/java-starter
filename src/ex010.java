import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if(numero >= 0) {
            System.out.printf("%d é positivo.", numero);
        } else {
            System.out.printf("%d é negativo.", numero);
        }
    }
}
