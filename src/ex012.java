import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float notaUm = input.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float notaDois = input.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float notaTres = input.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float notaQuatro = input.nextFloat();

        float media = (notaUm + notaDois + notaTres + notaQuatro) / 4;

        if (media >= 7) {
            System.out.printf("O aluno passou por média com nota total de: %.2f", media);
        } else {
            System.out.printf("O aluno reprovou com nota total de: %.2f", media);
        }

        input.close();
    }
}
