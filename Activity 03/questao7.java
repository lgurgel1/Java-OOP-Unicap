import java.util.Scanner;

public class questao7 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "",sobrenome = "";
        System.out.print("Insira seu primeiro nome: ");
        nome = leitor.nextLine();
        System.out.print("Insira agora os seus sobrenomes: ");
        sobrenome = leitor.nextLine();
        System.out.printf("Seu nome completo: %s %s", nome,sobrenome);
        leitor.close();














        
    }
}
