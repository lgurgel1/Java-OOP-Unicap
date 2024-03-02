import java.util.Scanner;

public class questao21 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero_int = 0;
        float numero_float = 0;
        System.out.print("Digite um numero decimal: ");
        numero_float = leitor.nextFloat();
        System.out.printf("Numero em decimal: %.2f\n", numero_float);
        numero_int = (int)numero_float;
        System.out.printf("Numero em inteiro: %d\n", numero_int);
        leitor.close();
    }
}
