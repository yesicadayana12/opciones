import javax.swing.*;
import java.util.Scanner;

public class dato {

     public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        int suma;
        int resta;
        int multiplicacion;
        int resultado=0;

        JOptionPane.showMessageDialog(null, "BIENVENIDO,===========================");
        System.out.println("Bienvenid@ querid@ usuari@ al programa");
        System.out.println("Por favor ingresar 4 valores");

        System.out.println(" Por favor ingresa el valor 1:");
        int num1 = entrada.nextInt();

        System.out.println("Por favor ingresa el valor 2:");
        int num2 = entrada.nextInt();

        System.out.println("Por favor ingresa el valor 3:");
        int num3 = entrada.nextInt();

        System.out.println("Por favor ingresa el valor 4:");
        int num4 = entrada.nextInt();
        JOptionPane.showMessageDialog(null, "======================================");

        while (resultado != 5 ) {
            resultado = Integer.parseInt(JOptionPane.showInputDialog("bienvenido selecione su opcion \n"
                    + "ingrese 1. si desea sumar todos los valores\n" +
                    "ingrese 2. si desea Restar los valores 1 y 2\n"
                    + "ingrese 3. si desea multiplicat todos los valores\n"
                    + "ingrese 4. si desea motrar todos los valores\n"
                    +" ingresar 5. agradecimiento"));

            switch (resultado) {
                case 1:
                    suma = num1 + num2 + num3 + num4;
                    JOptionPane.showMessageDialog(null, "Su resultado de la suma es:" + suma);
                    break;

                case 2:
                    resta = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Su resultado de la resta es:" + resta);
                    break;
                case 3:
                    multiplicacion = num1 * num2 * num3 * num4;
                    JOptionPane.showMessageDialog(null, "Su resultado de la mult es:" + multiplicacion);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "todos los valores son :"+num1+" "+num2+" "+num3+" "+num4);
                    break;
                case 5:
                   JOptionPane.showMessageDialog(null,"GRACIAS POR UTILIZAR EL PROGRAMA");
                default:
                    JOptionPane.showMessageDialog(null, "tenquiu");
                    break;

            }

        }
    }
}


