import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String idade_texto = "";
        int idade = 0;
        System.out.print("Digite a sua idade: ");
        idade_texto = leitor.nextLine();
        System.out.printf("Idade em texto: %s\n", idade_texto);
        idade = Integer.parseInt(idade_texto);
        System.out.printf("Idade em inteiro : %d",idade);
        leitor.close();

    }
}
