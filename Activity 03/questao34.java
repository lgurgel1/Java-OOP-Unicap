import java.util.Scanner;

public class questao34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número decimal: ");
        float num1 = scanner.nextFloat();
        System.out.print("Digite o segundo número decimal: ");
        float num2 = scanner.nextFloat();
        System.out.print("Digite o terceiro número decimal: ");
        float num3 = scanner.nextFloat();
        float media = (num1 + num2 + num3) / 3;
        System.out.printf("A média aritmética dos três números é: %.2f%n", media);
        scanner.close();
    }
}
