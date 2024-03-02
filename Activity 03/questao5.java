import java.util.Scanner;
import java.lang.Math;
public class questao5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float numero = 0;
        double quadrado_numero = 0;
        System.out.print("Digite um numero para ver seu quadrado: ");
        numero = leitor.nextFloat();
        quadrado_numero = Math.pow(numero,2);
        System.out.printf("O quadrado de %.2f eh %.2f aproximadamente.", numero, quadrado_numero);
        leitor.close();

    }
}
