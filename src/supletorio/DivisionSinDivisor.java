package supletorio;

import java.util.Scanner;

public class DivisionSinDivisor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dividendo, divisor, resto, cociente;
        resto = cociente = 0;
        System.out.println("Dividendo");
        dividendo = teclado.nextInt();
        System.out.println("Divisor");
        divisor = teclado.nextInt();
        if (dividendo < divisor) {
            System.out.println("Solo se dividir enteros :'v ");
        } else {
            for (int i = 0; i < 10000; i++) {
                dividendo = dividendo - divisor;
                cociente++;
                if (dividendo < divisor) {
                    resto = dividendo;
                    break;
                }
            }
        }
        System.out.println("Resto: " + resto);
        System.out.println("Cociente: " + cociente);
    }
}
