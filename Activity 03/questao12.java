import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 0;
        System.out.print("Digite um numero inteiro para ver se eh par ou impar: ");
        num = leitor.nextInt();
        if(num % 2 == 0){
            System.out.printf("O numero %d eh par!", num);


        }

        else{
            System.out.printf("O numero %d eh impar!", num);
        }
        leitor.close();
    }
}
