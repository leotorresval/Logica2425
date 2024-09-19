package condicionales;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        //Leer cadena
        String cadena = teclado.nextLine();
        //Tomar un caracter\
        char letra = cadena.charAt(0);
        // Transformar el caracter a numero
        int valor = letra;
        String cadena1 = cadena.substring(0);
        //Comparar
        if (valor >= 65 && valor <= 90) {
            System.out.println("Es mayuscula");
        } else {
            if (valor >= 97 && valor <= 122) {
                System.out.println("Es minuscula");
            } else {
                System.out.println("No es una letra");
            }
        }
    }

}
