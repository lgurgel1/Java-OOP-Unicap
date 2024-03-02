import java.util.Scanner;

public class questao33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        float baseRetangulo = scanner.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        float alturaRetangulo = scanner.nextFloat();
        float perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
        System.out.printf("O perímetro do retângulo é: %.2f%n", perimetroRetangulo);
        scanner.close();
    }
}
