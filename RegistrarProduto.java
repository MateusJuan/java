
import java.util.Locale;
import java.util.Scanner;


public class RegistrarProduto{
    public static void main(String[] args){
        Locale.setDefault(new Locale("en","US"));
        Scanner input = new Scanner(System.in);

        float preco;
        String nome;

        System.out.println("Digite o preço do produto:");
        preco = input.next();

        System.out.println("Digite o nome do procuto:");
        nome = input.next();

        System.out.printf("O preço do produto %s é .2f",nome,preco);
    }
}