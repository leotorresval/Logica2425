package tutoria;

import java.util.Scanner;

public class Tutoria1 {

    public static void main(String[] args) {
        cicloFor();
    }

    public static void cicloWhile() {
        int a = 10;
        while (a < 10) {
            System.out.println("Hola mundo");
            a = a + 7;
        }
    }

    public static void cicloWhile1() {
        int a = 0;
        while (a < 10) {
            System.out.println("Hola mundo");
            a = a + 7;
        }
    }

    public static void cicloDoWhile() {
        String respuesta = "";
        do {
            System.out.println("Hola mundo");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Presione 'SI', si desea "
                    + "imprimir nuevamente el mensaje");
            respuesta = teclado.next();
        } while (respuesta.equalsIgnoreCase("si"));
    }

    public static void cicloFor() {
        System.out.println("Tabla del 5");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero para generar la tabla");
        int multiplicador = teclado.nextInt();
        int maximo = 10;
        for (int i = 1; i <= maximo; i++) {
            System.out.println(multiplicador + "x" + i + "=" + (multiplicador * i));
        }
    }

}
