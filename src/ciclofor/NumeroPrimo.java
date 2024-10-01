package ciclofor;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        int valor =0, contador=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        valor = teclado.nextInt();
        for (int i = 1; i <= valor; i++) {
            if (valor%i==0) {
                contador++;
            }
        }
        if (contador==2) {
            System.out.println("El numero "+ valor + " es primo");
        }else{
            System.out.println("El numero "+ valor + " no es primo");
        }
    }
 
}
