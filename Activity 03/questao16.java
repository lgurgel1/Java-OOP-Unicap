
import java.util.Scanner;
 
public class questao16{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome ="";
        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        if(nome.length() == 5){
            System.out.printf("%s tem 5 caracteres.", nome);
        }
        else{
            System.out.printf("%s nao tem 5 caracteres", nome);
        }
        leitor.close();
 
       
 
 
 
 
 
    }
}