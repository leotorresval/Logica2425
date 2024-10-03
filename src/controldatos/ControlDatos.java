package controldatos;

import java.util.Scanner;

public class ControlDatos {

    public static void main(String[] args) {
        metodoParametrizado(6);
    }

    public static void miMetodo() {
        System.out.println("Mi primer metodo");
    }

    public static void lecturaEnteros() {
        boolean correcto = true;
        int valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Ingrese un entero");
                valor = teclado.nextInt();
                correcto = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo enteros");
            }
        } while (correcto == true);
        System.out.println("El numero ingresado es: " + valor);
    }

    public static void metodoParametrizado(int valor){
        System.out.println("El valor recibido es: "+valor);
    }
}
