import java.util.Scanner;

public class questao56 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu estado civil (solteiro, casado, divorciado ou viúvo): ");
        String estadoCivil = scanner.nextLine().toLowerCase();

        // Verificando o estado civil usando switch/case
        switch (estadoCivil) {
            case "solteiro":
                System.out.println("Você é solteiro.");
                break;
            case "casado":
                System.out.println("Você é casado.");
                break;
            case "divorciado":
                System.out.println("Você é divorciado.");
                break;
            case "viúvo":
                System.out.println("Você é viúvo.");
                break;
            default:
                System.out.println("Estado civil inválido.");
        }

        scanner.close();
    }
}
