package ciclowhile;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Contar los números enteros positivos ingresados por teclado
        //detenerse cuando se ingrese un número negativo, 
        //considere al número cero como positivo
        int c = 0, numero = 0;
        boolean semaforo = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
        while (semaforo) {
            if (numero >= 0) {
                c++;
                System.out.println("Ingrese un numero");
                numero = teclado.nextInt();
            }else{
                semaforo=false;
            }
        }
        System.out.println("Se ingresaron "+c+ " numeros positivos");
    }
}
