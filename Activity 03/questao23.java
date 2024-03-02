import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data no formato 'dd/mm/aaaa': ");
        String inputData = scanner.nextLine();
        String[] partesData = inputData.split("/");

        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);
        System.out.printf("Dia: %d\n", dia);
        System.out.printf("Mês: %d\n" , mes);
        System.out.printf("Ano: %d\n", ano);
        scanner.close();
        }
    
    }