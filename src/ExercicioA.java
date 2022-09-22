import javax.swing.*;

public class ExercicioA {
    public static void main(String[] args) {


        int num, b, c, d, e,  cont = 0, result, media;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        b = num + 1;
        c = num + 2;
        d = num + 3;
        e = num + 4;


        for (cont = 0; cont <= 4; cont ++) {

            result = cont + num;

            System.out.println(result);

        } media = ( num + b + c + d + e) /5;
        System.out.println(media);








        }

    }

