import java.util.Scanner;

public class questao30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int diferenca = numero1 - numero2;
        int produto = numero1 * numero2;
        int quociente = (numero2 != 0) ? numero1 / numero2 : 0;

        System.out.printf("Soma: %d%n", soma);
        System.out.printf("Diferença: %d%n", diferenca);
        System.out.printf("Produto: %d%n", produto);
        System.out.printf("Quociente (divisão inteira): %d%n", quociente);

        scanner.close();
    }
}
