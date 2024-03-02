import java.util.Scanner;

public class questao32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        double raioCircunferencia = scanner.nextDouble();
        double perimetroCircunferencia = 2 * Math.PI * raioCircunferencia;
        System.out.printf("O perímetro da circunferência é: %.2f%n", perimetroCircunferencia);
        scanner.close();
    }
}
