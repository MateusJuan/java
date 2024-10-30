import java.util.Scanner;

public class Aplicacao_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = input.nextInt();

        System.out.printf("A idade é %d", idade);
    }
}
