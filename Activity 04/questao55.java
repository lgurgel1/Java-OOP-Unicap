import java.util.Scanner;

public class questao55 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verificando a faixa etária
        if (idade >= 0 && idade <= 1) {
            System.out.println("Você é um bebê.");
        } else if (idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade <= 18) {
            System.out.println("Você é um adolescente.");
        } else {
            System.out.println("Você é um adulto.");
        }

        scanner.close();
    }
}
