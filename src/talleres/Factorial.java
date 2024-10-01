
package talleres;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = teclado.nextInt();
        int acu=1;
        if (num<1) {
            System.out.println("Numero incorrecto");
        }else{
            int i=1;
            while(i<=num){
                acu=acu*i;
                i++;
            }
            System.out.println("Factorial: "+acu);
        }
        
    }
}
