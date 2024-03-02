import java.util.Scanner;

public class questao28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int dobro = numero * 2;

        System.out.printf("Você digitou o número %d e o dobro é %d.%n", numero, dobro);

        scanner.close();
    }
}
