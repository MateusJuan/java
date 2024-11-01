import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[2];
        int[] idades = new int[2];
        
        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = input.next();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idades[i] = input.nextInt();
        }

        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("%s tem %d anos %n", nomes[i], idades[i]);
        }
        
        input.close();
    }
}
