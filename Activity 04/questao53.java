import java.util.Scanner;
public class questao53 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int num = 0;
       System.out.print("Digite um numero inteiro de 1-5 de acordo com a sua nota: ");
       num = scanner.nextInt();
       switch (num) {
        case 5:
            System.out.println("Muito bom");
            break;
        case 4:
            System.out.println("Bom");
            break;
        case 3:
            System.out.println("Regular");
            break;
        case 2:
            System.out.println("Insuficiente");
            break;
        case 1:
            System.out.println("Muito Insuficiente");
            break;
        default:
            System.out.println("Valor invalido.");
            break;
       } 
       scanner.close();
    }
}
