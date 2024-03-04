import java.util.Scanner;
public class questao40{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();
        if(num > 0){

            System.out.printf("O numero %d eh maior que zero.", num);
        }
        else if(num < 0){

            System.out.printf("O numero %d eh menor que zero.", num);
        }
        else{
            System.out.printf("O numero %d eh igual a zero.", num);
        }

        scanner.close();
    }
}