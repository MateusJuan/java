import java.util.Locale;
import java.util.Scanner;

public class ResultadoMedia {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner input = new Scanner(System.in);
        float media;

        System.out.println("Digite a média:");
        media = input.nextFloat();

        if (media >= 6) {
            System.out.printf("Média %.2f. Aprovado por média!%n", media);
        } else if (media >= 4) {
            System.out.printf("Média %.2f. Fazer Final%n", media);
        } else {
            System.out.printf("Média %.2f. Reprovado!%n", media);
        }
    }
}
