import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float base = 0, altura = 0, area = 0;
        System.out.printf("Insira a base do retangulo: ");
        base = leitor.nextFloat();
        System.out.printf("Insira a altura do retangulo: ");
        altura = leitor.nextFloat();
        area = base * altura;
        System.out.printf("Area do retangulo: %.2f", area);
        leitor.close();
    }
}
