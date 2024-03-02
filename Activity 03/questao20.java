import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float n1 = 0, n2 = 0, resto= 0;
        System.out.print("Digite um numero: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite outro numero: ");
        n2 = leitor.nextFloat();
        resto = n1 % n2;
        System.out.printf("Resto da divisao entre %.1f e %.1f: %.1f", n1, n2, resto);
        leitor.close();
    }
}
