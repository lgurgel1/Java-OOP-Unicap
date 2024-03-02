import java.util.Scanner;

public class questao27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o nome do produto
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        // Recebe o preço do produto
        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        // Limpa o buffer do Scanner
        scanner.nextLine();

        // Recebe o símbolo da moeda de sua escolha
        System.out.print("Digite o símbolo da moeda: ");
        String simboloMoeda = scanner.nextLine();

        // Utiliza printf para formatar a saída
        System.out.printf("%s: %s %.2f%n", nomeProduto, simboloMoeda, precoProduto);

        // Fecha o Scanner
        scanner.close();
    }
}
