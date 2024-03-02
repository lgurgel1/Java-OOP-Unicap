import java.util.Scanner;

public class questao38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = scanner.nextInt();
        int resultadoOperacao = (n1 + n2) * n3;
        System.out.printf("O resultado da operação é: %d%n", resultadoOperacao);
        scanner.close();
    }
}
