import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome_animal = "";
        System.out.print("Insira o nome de um animal: ");
        nome_animal = leitor.nextLine();
        System.out.printf("Animal digitado: %s", nome_animal);
        leitor.close();

    }
}
