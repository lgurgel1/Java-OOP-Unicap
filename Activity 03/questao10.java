import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class questao10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        String[] palavras = nome.split("\\s+");
        ArrayList<String> listaPalavras = new ArrayList<>();
        Collections.addAll(listaPalavras, palavras);
        Collections.reverse(listaPalavras);
        System.out.println("O nome invertido é: " + listaPalavras);
        scanner.close();
    }
}