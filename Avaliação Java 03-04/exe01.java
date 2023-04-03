import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {

            System.out.print("O número " + n1 + " é o maior");

        } else if (n2 > n1 && n2 > n3) {
            System.out.print("O número " + n2 + " é o maior");

        } else if (n3 > n1 && n3 > n2) {
            System.out.print("O número " + n3 + " é o maior");

        } else {
            System.out.print("Tem dois ou três valores iguais");
        }

    }
}
