import javax.swing.*;

public class ExercicioE {
    public static void main(String[] args) {

        int cont, num, result;

        num = Integer.parseInt(JOptionPane.showInputDialog("Qual a tabuada? "));

        for (cont = 0; cont <= 10; cont ++) {
            result = cont * num;
            System.out.println(result);
        }
    }


}
