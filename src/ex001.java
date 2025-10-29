import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = input.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.printf("Dobro de %d\n", dobro);
        System.out.printf("Triplo de %d\n", triplo);

        input.close();
    }
}
