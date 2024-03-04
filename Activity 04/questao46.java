import java.util.Scanner;

public class questao46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        // Converte o caractere para minúsculo para simplificar a verificação
        char lowercaseCaractere = Character.toLowerCase(caractere);

        if ((lowercaseCaractere >= 'a' && lowercaseCaractere <= 'z') || 
            (lowercaseCaractere >= 'A' && lowercaseCaractere <= 'Z')) {

            if (lowercaseCaractere == 'a' || lowercaseCaractere == 'e' || 
                lowercaseCaractere == 'i' || lowercaseCaractere == 'o' || 
                lowercaseCaractere == 'u') {
                System.out.println("É uma vogal.");
            } else {
                System.out.println("É uma consoante.");
            }
        } else {
            System.out.println("Não é uma letra do alfabeto.");
        }

        scanner.close();
    }
}
