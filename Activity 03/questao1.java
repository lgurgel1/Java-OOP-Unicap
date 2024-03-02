import java.util.Scanner;
 
public class questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "";
        System.out.print("Digite seu Nome: ");
        nome = leitor.nextLine();
        System.out.printf("Bem-vindo, %s!", nome);
        leitor.close();
 
    }
}