import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;

        String nome;

        System.out.print("Digite seu nome: ");
        nome = input.next();

        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.print(nome + " esta na fase de criança \n");
        } else if (idade >= 13 && idade <= 17) {
            System.out.print(nome + " está na fase de adolescente \n");
        } else if (idade >= 18 && idade <= 59) {
            System.out.print(nome + " está na fase adulta\n");
        } else if (idade > 60) {
            System.out.print(nome + " está na melhor fase: Idoso \n");
        } else {
            System.out.print("ERRO! \n");
        }
    }
}
