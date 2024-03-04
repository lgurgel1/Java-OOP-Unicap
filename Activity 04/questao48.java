import java.util.Scanner;

public class questao48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        // Calculando o IMC
        double imc = peso / (altura * altura);

        // Exibindo o IMC
        System.out.println("O IMC calculado é: " + imc);

        // Classificando a condição com base no IMC
        if (imc < 18.5) {
            System.out.println("A pessoa está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("A pessoa está com peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("A pessoa está com sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("A pessoa está obesa.");
        } else {
            System.out.println("A pessoa está muito obesa.");
        }

        scanner.close();
    }
}
