package refuerzo;

import java.util.Scanner;

public class Ejercicio1 {
    //Programa que pide un número entero 
    //y muestra si es par o impar.
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = teclado.nextInt();
        if(numero%2 == 0){
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");            
        }
    }

}
