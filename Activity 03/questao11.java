import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String caracteres = "";
        int qtdcaracteres = 0;
        System.out.print("Digite uma frase qualquer: ");
        caracteres = leitor.nextLine();
        qtdcaracteres = caracteres.length();
        System.out.printf("Quantidade de caracteres: %d", qtdcaracteres);
        leitor.close();









    }   
}
