package ciclowhile;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Contar los números enteros positivos ingresados por teclado
        //detenerse cuando se ingrese un número negativo, 
        //considere al número cero como positivo
        int c = 0, numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
        while (numero >= 0) {
            c++;
            System.out.println("Ingrese un numero");
            numero = teclado.nextInt();
        }
        System.out.println("Se ingresaron "+c+ " numeros positivos");

    }
}
