import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1=0,n2=0,soma=0;
        System.out.print("Digite um numero inteiro: ");
        n1 = leitor.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = leitor.nextInt();
        soma = n1+n2;
        System.out.printf("Soma: %d", soma);
        leitor.close();

        




    }   
    
}
