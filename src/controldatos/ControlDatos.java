package controldatos;

import java.util.Scanner;

public class ControlDatos {

    public static void main(String[] args) {
        int valor = lecturaEnteros("Ingrese una edad");
        System.out.println("La edad ingresada es " +valor);
    }

    public static int lecturaEnteros() {
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
        return valor;
    }
    
    
    public static int lecturaEnteros(String texto) {
        boolean correcto = true;
        int valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.print(texto+": ");
                valor = teclado.nextInt();
                correcto = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo enteros");
            }
        } while (correcto == true);
        return valor;
    }

    //CONTROL DE DOUBLE
    public static double lecturaDecimalL() {
        boolean correcto = true;
        double valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Ingrese un decimal largo");
                valor = teclado.nextDouble();
                correcto = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo decimales");
            }
        } while (correcto == true);
        return valor;
    }

    //CONTROL DE FLOAT
    public static float lecturaDecimalC() {
        boolean correcto = true;
        float valor = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Ingrese un decimal corto");
                valor = teclado.nextFloat();
                correcto = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo decimales");
            }
        } while (correcto == true);
        return valor;
    }

    //CONTROL DE BOOLEAN
    public static boolean lecturaBooleano() {
        boolean correcto = true;
        boolean valor = true;
        do {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Ingrese un booleano [true/false]");
                valor = teclado.nextBoolean();
                correcto = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo booleanos");
            }
        } while (correcto == true);
        return valor;
    }
    //CONTROL DE CHAR

}
