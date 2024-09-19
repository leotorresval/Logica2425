package logica24.pkg25;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String [] args){
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        int n2 = teclado.nextInt();
        int suma = n1+n2;
        System.out.println("Resultado: "+suma);
                
    }
}
