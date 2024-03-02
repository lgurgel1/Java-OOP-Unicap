import java.util.Scanner;

public class questao3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero_int = 0;
        float numero_float = 0;
        System.out.print("Digite um numero inteiro: ");
        numero_int = leitor.nextInt();
        System.out.printf("Numero em inteiro: %d\n", numero_int);
        numero_float = (float)numero_int;
        System.out.printf("Numero em decimal: %.2f", numero_float);
        leitor.close();
    }
}
