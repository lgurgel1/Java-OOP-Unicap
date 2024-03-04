import java.util.Scanner;

public class questao52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (por extenso): ");
        String diaSemana = scanner.nextLine().toLowerCase(); // Converte para minúsculas para facilitar a comparação

        // Verificando se é um dia útil ou fim de semana
        if (diaSemana.equals("sábado") || diaSemana.equals("domingo")) {
            System.out.println("É fim de semana!");
        } else {
            System.out.println("É um dia útil.");
        }

        scanner.close();
    }
}
