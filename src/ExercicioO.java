import java.util.Scanner;

public class ExercicioO {
    public static void main(String[] args) {


        float maior, num;
        int cont = 2;

        Scanner scan = new Scanner(System.in);

        System.out.print("[Digite 0 para finalizar] \nNúmero 1: ");
        num = scan.nextFloat();

        maior = num;

        while (num != 0) {

            System.out.println("Número" +cont+ " :");
            num = scan.nextFloat();

            if(num > maior) {
                maior = num;
            }
        cont ++;
        }
        System.out.println("O maior número digitado foi: " +maior+ ".");
    }
}











