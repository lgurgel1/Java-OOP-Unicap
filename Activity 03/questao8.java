import java.util.Scanner;

public class questao8 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String sequencia = "";
        int quantidadeNumeros = 0;
        String[] numeros_sequencia = {};
        System.out.print("Digite uma sequência de números separados por espaço: ");
        sequencia = scanner.nextLine();
        numeros_sequencia = sequencia.split(" ");
        quantidadeNumeros = numeros_sequencia.length;

        System.out.printf("Quantidade de números digitados: %d", quantidadeNumeros);

        scanner.close();



    }
}
