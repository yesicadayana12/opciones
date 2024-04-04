import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class juego {
    public static  void main(String[] args){
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int numero =0;
        int aleatorio= 0;
        int i= 0;
        JOptionPane.showMessageDialog(null, "BIENVENIDO,===========================");
        System.out.println("Bienvenid@ querid@ usuari@ al programa juega y adivina");
        System.out.println("Señor usuario el numero que se le pedira sera aumentado del 1 al 100");
        System.out.println("Señor usuario el numero que ingreso se le dira si es mayor o menor");
        System.out.println("Señor usuario se le dira cuantas veces intento en el juego");

       JOptionPane.showMessageDialog(null,"=========================================");

        aleatorio = (int) (Math.random()*100);

        while (numero != aleatorio){

            System.out.println("Señor usuario por favor ingrese un numero: ");
            numero = entrada.nextInt();
            if
            (numero==aleatorio){
             System.out.println("Señor usuario el numero que escojio es correcto " +numero);

             if (numero>aleatorio){
                 System.out.println("Señor usuario su numero es mayor al que fue generado "+numero);
             }
             else {
                 System.out.println("Señor usuario Su numero es menor al que fue generado" + numero);
             }
             i++;
             System.out.println("Señor usuario el numero de veces que lo intento fueron" +i);
            }

        }

    }
}
