import javax.swing.*;

public class ExercicioX {
    public static void main(String[] args) {

        int A, B, FortunaA, FortunaB, cont, diferença;

        A = 10000;
        B = 5000;
        FortunaA = 100;
        FortunaB = 300;
        cont = 0;

        while (A >= B) {
            if(A >= B) {

                diferença = A - B;
                System.out.println("A diferença entre as fortunas é: " +diferença+ " no mes " +cont+ " . ");
                A = A + FortunaA;
                B = B + FortunaB;

            }
             cont ++;

        }
        JOptionPane.showMessageDialog(null, "O tempo para a pessoa B ter mais dinheiro que a pessoa A é 26 meses, após esse tempo, a pessoa A estará com " +A+ " já a pessoa B estará com " +B+ " .");

    }
}

