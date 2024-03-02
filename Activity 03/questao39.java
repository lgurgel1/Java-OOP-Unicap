import java.util.Scanner;

public class questao39{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f%n", temperaturaFahrenheit);
        scanner.close();
    }
}
