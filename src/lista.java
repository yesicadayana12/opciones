import com.sun.source.tree.SwitchTree;

import javax.swing.*;
import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma;
        int multiplicar;
        int opcion;
        String nombre;
        int edad;
        int base,altura,area;

        JOptionPane.showMessageDialog(null, "BIENVENIDO,===========================");
        System.out.println("Bienvenid@ querid@ usuari@ al programa");
        System.out.println("Por favor ingresar 2 valores");

        System.out.println(" Por favor ingresa el valor 1:");
        int num1 = entrada.nextInt();
        System.out.println("Por favor ingresa el valor 2:");
        int num2 = entrada.nextInt();

        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido selecione su opcion \n"
                + "ingrese 1. si desea sumar o multiplicar los 2 valores\n"
                + " ingresar 2. si desea validar \n"
                + " ingresar 3. si dese ver la area del triangulo"));

        switch (opcion) {
            case 1:
                suma = num1 + num2;
                multiplicar = num1 * num2;
                JOptionPane.showMessageDialog(null, "Su resultado de la suma es:" + suma);
                System.out.println("*******************************************************************************");
                JOptionPane.showMessageDialog(null, "Su resultado de la mult es:" + multiplicar);
                break;
            case 2:
                System.out.println("Por favor ingrese su nombre");
                nombre = entrada.next();
                System.out.println("Por favor ingrese su edad");
                edad = entrada.nextInt();
                if (edad >= 18) {

                    System.out.println("si eres mayor de edad");
                    multiplicar = edad * 10000;
                    System.out.println(" el valor a pagar es " +multiplicar );
                }
                else{
                        System.out.println(" señor@ usuario no tiene que pagar nada");

                    }
                break;
            case 3:

              System.out.println("Por favor ingrese la base del triangulo");
              base = entrada.nextInt();
              System.out.println("Por favor ingrese la altura del triangulo");
              altura = entrada.nextInt();
              area = base*altura/2;
              JOptionPane.showMessageDialog(null,"el area del triangulo es:"+area);

            default:
                JOptionPane.showMessageDialog(null,"señor/a usuari@ las las opciones son:1 , 2 y 3 no hay nada mas");
        }
    }
}
