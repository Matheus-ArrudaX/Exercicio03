import javax.swing.*;

public class ExercicioG {
    public static void main(String[] args) {

        int fatorial, num, cont;
        fatorial = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        for (cont = 2; cont <= num; cont++) {
            fatorial *= cont;

        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);

    }
}

