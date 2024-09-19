package ciclowhile;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Programa que solicite 10 numeros y clasifique
        //en positivos y negativos
        //Al final imprimir cuantos positivos y negativos
        //Se ingresaron
        int c = 0, cp = 0, numero = 0;
        Scanner teclado = new Scanner(System.in);
        while (c < 10) {
            System.out.println("["+(c+1)+"] Ingrese un numero");
            numero = teclado.nextInt();
            if (numero >= 0) {
                cp++;
            }
            c++;
        }
        System.out.println("Se ingresaron " + cp + " numeros positivos");
        System.out.println("Se ingresaron " + (c - cp) + " numeros negativos");
    }
}
