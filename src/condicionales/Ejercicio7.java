package condicionales;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = teclado.nextInt();
        System.out.println("Ingrese si tiene licencia [si/no]");
        String respuesta = teclado.next();
        boolean tieneLicencia;
        if (respuesta.equalsIgnoreCase("si")) {
            tieneLicencia = true;
        }else{
            tieneLicencia = false;
        }
        if (edad >= 18 && tieneLicencia == true) {
            System.out.println("Puede conducir");
        } else {
            System.out.println("No puede conducir");
        }

    }
}
