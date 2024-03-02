import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String string = "";
        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite uma frase qualquer: ");
        string = scanner.nextLine();
        System.out.printf("%d %s", num,string);
        scanner.close();
    }
}
