import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 0;
        System.err.print("Digite um numero inteiro para ver se ele eh positivo ou negativo: ");
        num = leitor.nextInt();
        if (num > 0){
            System.out.printf("O numero %d eh positivo!", num);
        }
        else{
            System.out.printf("O numero %d eh negativo!", num);
        }
        leitor.close();
    }
}
