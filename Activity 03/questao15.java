import java.util.Scanner;
 
public class questao15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float peso = 0, altura = 0;
        double IMC = 0;
        System.out.print("Digite seu peso: ");
        peso = leitor.nextFloat();
        System.out.print("Digite sua altura: ");
        altura = leitor.nextFloat();
        IMC = peso / (altura * altura);
        System.out.printf("IMC: %.2f", IMC);
        leitor.close();
 
    }
}
 