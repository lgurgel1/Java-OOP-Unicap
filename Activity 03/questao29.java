import java.util.Scanner;

public class questao29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu endereço de e-mail: ");
        String email = scanner.nextLine();

        System.out.printf("Obrigado por fornecer o endereço de e-mail %s. Agradecemos pela sua participação.%n", email);

        scanner.close();
    }
}
