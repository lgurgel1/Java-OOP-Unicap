import java.util.Scanner;
import java.time.LocalDate;

public class questao6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        LocalDate data_atual = LocalDate.now();
        int ano_nascimento = 0, idade=0, ano_atual = data_atual.getYear();

        System.out.print("Insira seu ano de nascimento para ver a sua idade: ");
        ano_nascimento = leitor.nextInt();
        idade = ano_atual - ano_nascimento;
        System.out.printf("Idade baseada no seu ano de nascimento: %d", idade);
        leitor.close();
    }
}
