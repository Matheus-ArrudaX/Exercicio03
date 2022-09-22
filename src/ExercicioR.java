import javax.swing.*;

public class ExercicioR {
    public static void main(String[] args) {

        int Fulano, Ciclano, CF, CC, cont, diferença;

        Fulano = 160;
        Ciclano = 110;
        CF = 2;
        CC = 3;
        cont = 0;

        while (Fulano >= Ciclano) {
            if (Fulano >= Ciclano) {

                diferença = Fulano - Ciclano;
                System.out.println("A diferença entre as alturas é " +diferença+ " no ano " +cont+ " . ");
                Fulano = Fulano + CF;
                Ciclano = Ciclano + CC;
            }
                cont ++;

        }
        JOptionPane.showMessageDialog(null, "O tempo para Ciclano ser maior que Fulano é 50 anos, após esse tempo, Ciclano estará com " +Ciclano+ " cm . Já Fulano estará com " +Fulano+ " cm ");
    }


}
