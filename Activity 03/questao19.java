import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da sua cidade: ");
        String cidade = scanner.nextLine();
        char letraDeVerificacao = 'S';
        if (cidade.toUpperCase().startsWith(String.valueOf(letraDeVerificacao))) {
            System.out.printf("A cidade começa com a letra %s", letraDeVerificacao);
        } else {
            System.out.printf("A cidade não começa com a letra %s", letraDeVerificacao);
        }
        scanner.close();
    }
}