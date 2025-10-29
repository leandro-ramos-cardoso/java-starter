import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroUm = input.nextInt();

        input.nextLine();

        System.out.println("Digite o operador que deseja: ");
        String operadorCalculo = input.nextLine();

        System.out.println("Digite outro número: ");
        int numeroDois = input.nextInt();

        int soma = numeroUm + numeroDois;
        int subtracao = numeroUm - numeroDois;
        int multiplicacao = numeroUm * numeroDois;
        int divisao = numeroUm / numeroDois;

        switch (operadorCalculo) {
            case "+":
                System.out.printf("A soma entre %d e %d vale %d.", numeroUm, numeroDois, soma);
                break;
            case "-":
                System.out.printf("A soma entre %d e %d vale %d.", numeroUm, numeroDois, subtracao);
                break;
            case "*":
                System.out.printf("A soma entre %d e %d vale %d.", numeroUm, numeroDois, multiplicacao);
                break;
            case "/":
                System.out.printf("A soma entre %d e %d vale %d.", numeroUm, numeroDois, divisao);
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
        input.close();
    }
}
