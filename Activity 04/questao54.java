import java.util.Scanner;
public class questao54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String dia_semana="";
        System.out.print("Digite um numero de 1 a 7 para ver o dia da semana: ");
        num = scanner.nextInt();
        switch (num) {
            case 1:
                dia_semana = "Domingo";
                break;
            case 2:
                dia_semana = "Segunda";
                break;
            case 3:
                dia_semana = "Terça";
                break;
            case 4:
                dia_semana = "Quarta";
                break;
            case 5:
                dia_semana = "Quinta";
                break;
            case 6:
                dia_semana = "Sexta";
                break;
            case 7:
                dia_semana = "Sabado";
                break;
            default:
                System.out.println("Valor digitado incorreto.");

            
        }

        System.out.printf("Dia %d da semana: %s", num,dia_semana);
        scanner.close();
    }
}
