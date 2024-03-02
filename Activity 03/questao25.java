import java.util.Scanner;
public class questao25
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int ano_de_nascimento = 0;
		System.out.print("Digite o seu ano de nascimento: ");
		ano_de_nascimento = leitor.nextInt();
		System.out.printf("Bem-vindo ao nosso programa,nascido em %d!", ano_de_nascimento);
		leitor.close();
	}
}