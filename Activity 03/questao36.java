import java.util.Scanner;

public class questao36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor em reais: ");
        double valorReais = scanner.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        double valorDolares = valorReais / cotacaoDolar;
        System.out.printf("O valor em dólares é: %.2f%n", valorDolares);
        scanner.close();
    }
}
