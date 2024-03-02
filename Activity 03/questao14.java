import java.util.Scanner;
 
public class questao14{
 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        System.out.print("Digite um numero: ");
        n1 = leitor.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = leitor.nextInt();
        if(n1>n2){
            System.out.printf("Maior: %d", n1);
 
        }
        else if(n2>n1){
            System.out.printf("Maior: %d", n2);
 
        }
        else{
            System.out.printf("Os numeros %d e %d sao iguais", n1,n2);
        }
        leitor.close();
    }
}