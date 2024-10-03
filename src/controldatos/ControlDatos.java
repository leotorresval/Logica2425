package controldatos;

import java.util.Scanner;

public class ControlDatos {

    public static void main(String[] args) {
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
    
    //CONTROL DE DOUBLE
    //CONTROL DE FLOAT
    //CONTROL DE BOOLEAN
    //CONTROL DE CHAR

 }













