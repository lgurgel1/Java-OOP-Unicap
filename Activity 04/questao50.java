import java.util.Scanner;

public class questao50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        float salario = scanner.nextFloat();

        float aumento;

        // Verificando o salário e calculando o aumento
        if (salario > 1500.00) {
            aumento = salario * 0.10f; // Aumento de 10%
        } else {
            aumento = salario * 0.15f; // Aumento de 15%
        }

        // Calculando o novo salário
        float novoSalario = salario + aumento;

        // Exibindo os resultados
        System.out.printf("O aumento é de: R$%.2f\n", aumento);
        System.out.printf("O novo salário é: R$%.2f", novoSalario);

        scanner.close();
    }
}
