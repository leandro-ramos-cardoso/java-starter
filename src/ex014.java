import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número equivalente ao mês: ");
        int numeroMensal = input.nextInt();

        switch (numeroMensal) {
            case 1:
                System.out.println("Referente ao mês de JANEIRO");
                break;
            case 2:
                System.out.println("Referente ao mês de FEVEREIRO");
                break;
            case 3:
                System.out.println("Referente ao mês de MARCO");
                break;
            case 4:
                System.out.println("Referente ao mês de ABRIL");
                break;
            case 5:
                System.out.println("Referente ao mês de MAIO");
                break;
            case 6:
                System.out.println("Referente ao mês de JUNHO");
                break;
            case 7:
                System.out.println("Referente ao mês de JULHO");
                break;
            case 8:
                System.out.println("Referente ao mês de AGOSTO");
                break;
            case 9:
                System.out.println("Referente ao mês de SETEMBRO");
                break;
            case 10:
                System.out.println("Referente ao mês de OUTUBRO");
                break;
            case 11:
                System.out.println("Referente ao mês de NOVEMBRO");
                break;
            case 12:
                System.out.println("Referente ao mês de DEZEMBRO");
                break;
            default:
                System.out.println("Mês invalido");
                break;
        }

        input.close();
    }

}
