import java.util.Scanner;

public class ExercicioJ {
    public static void main(String[] args) {

        int maior, menor, num, cont = 2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Idade 1: ");
        num = scan.nextInt();

        maior = num;
        menor = num;

        while (cont <= 100) {
            System.out.print("Idade " +cont+ " : ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;

            } else if (num < menor) {
                menor = num;

            }
              cont ++;
        }
        System.out.println("O paciente com a maior idade é o de " +maior+ " anos, e o paciente com a menor idade é o de" +menor+ " anos ");
    }



}
