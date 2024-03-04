import java.util.Scanner;

public class questao45{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        int tamanhoNome1 = nome1.length();
        int tamanhoNome2 = nome2.length();

        if (tamanhoNome1 > tamanhoNome2) {
            System.out.println(nome1 + " possui mais caracteres no nome.");
        } else if (tamanhoNome2 > tamanhoNome1) {
            System.out.println(nome2 + " possui mais caracteres no nome.");
        } else {
            System.out.println("Os nomes têm o mesmo número de caracteres.");
        }
        scanner.close();
    }
}
