import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string contendo um número inteiro: ");
        String inputString = scanner.nextLine();
            int numeroInteiro = Integer.parseInt(inputString);
            int resultadoSoma = numeroInteiro + 10;
            String resultadoString = Integer.toString(resultadoSoma);
            System.out.println("O número inteiro somado a 10, convertido para string, é: " + resultadoString);
            scanner.close();
        }
}