import java.util.Scanner;

public class RegistrarProduto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float preco;

        System.out.println("Digite o preço do produto:");
            preco = input.nextFloat();
        System.out.printf("O preço do produto é %.2f",preco);
    }
}
