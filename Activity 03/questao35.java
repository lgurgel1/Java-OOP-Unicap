import java.util.Scanner;

public class questao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        int mesesVividos = idade * 12;
        int diasVividos = idade * 365;
        System.out.printf("Você já viveu %d meses e %d dias.%n", mesesVividos, diasVividos);
        scanner.close();
    }
}
