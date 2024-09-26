package ciclofor;

import java.util.Scanner;

public class EjercicioIva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double total, subtotalConIva, subtotalSinIva, iva;
        total = subtotalConIva = subtotalSinIva = iva = 0;
        System.out.println("Ingrese la cantidad de articulos comprados");
        int num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el valor");
            double valor= teclado.nextDouble();
            System.out.println("Graba iva");
            boolean ivaR= teclado.nextBoolean();
            if (ivaR) {
                subtotalConIva+=(valor/1.15);
                iva+=(valor -valor/1.15);
            }else{
                subtotalSinIva+=valor;
            }
            total+=valor;
        }
        
        System.out.println("Subtotal con iva: "+ subtotalConIva);
        System.out.println("IVA 15%: "+ iva);
        System.out.println("Subtotal sin iva: "+ subtotalSinIva);
        System.out.println("Total: "+ total);
        
    }
}
