package controldatos;

import java.util.Scanner;

public class ControlDatos {

    public static void main(String[] args) {
        boolean correcto = true;
        int valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Ingrese un entero");
                valor = teclado.nextInt();
                correcto=false;
            } catch (Exception e) {
                System.out.println("Ingrese solo enteros");
            }
        } while (correcto == true);
        System.out.println("El numero ingresado es: " + valor);
    }
}
