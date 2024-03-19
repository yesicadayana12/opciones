import javax.swing.*;
import java.util.Scanner;

public class operaciones {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0 ;
        int multiplicar;
        int n = scanner.nextInt();
        int i=1;
        int opcion ;
        JOptionPane.showMessageDialog(null, "BIENVENIDO,===========================");
        System.out.println("Bienvenid@ querid@ usuari@ al programa");
        System.out.println("Señor usuari@ ingrese un numero");
        JOptionPane.showMessageDialog(null,"===========================");



        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido selecione \n"
                + " ingrese 1 . si desesael ciclo while\n"
                + " ingrese 2. si desea el ciclo for\n"
                + " ingrese 3. si desea el ciclo do while\n"));
         JOptionPane.showMessageDialog(null,"=================================");

        switch (opcion) {

            case 1:
                while (i <= n) ;
                suma = i * i;
                System.out.println("La suma del resultado es: " + suma);


            case 2:
                suma = 0;
                for (;i <= n; i++){
                    suma= i * i ;
                }
               System.out.println("La suma de los resultados es: " + suma);
                break;

            default:
                System.out.println(" Ese numero que ingreso no esta en el programa");

            case 3:
                int suma_domientras = 0;
                int iDowhile = 1;
                do {
                    suma = i * i;
                    i++;
                }
                while (i <= n );
                System.out.println("la suma del resultado es: "+ suma_domientras);
                break;

            }

        }
    }



