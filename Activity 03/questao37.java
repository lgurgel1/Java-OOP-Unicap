import java.util.Scanner;

public class questao37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        int numeroInteiroArredondado = (int) Math.round(numeroDecimal);
        System.out.printf("O número arredondado é: %d%n", numeroInteiroArredondado);
        scanner.close();
    }
}
