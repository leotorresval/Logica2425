
package unidad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturaArchivos {
    public static void main(String[] args) {
        lectura();
    }
 
    public static void lectura(){
        try {
            File archivo = new File("c:\\Message Group - Product.csv");
            File salida = new File("D:\\TotalProductos.csv");
            Scanner leer = new Scanner(archivo);
            PrintWriter escribir = new PrintWriter(salida);
            String cabecera = leer.nextLine();
            String m[] = cabecera.split(",");
            escribir.println(m[3]+","+m[m.length-3]+","+m[m.length-2]+",Total");
            System.out.println(String.join("**", cabecera.split(",")));
            while(leer.hasNextLine()){
                String cadena = leer.nextLine();
                //SEPARAR LA CADENA Y GENERAR UN VECTOR
                String v [] = cadena.split(",");
                ArrayList<String> lista = new ArrayList<>();
                lista.add(v[3]);
                lista.add(v[v.length-3]);
                lista.add(v[v.length-2]);
                double price=Double.parseDouble(v[v.length-3]);
                String vDiscount[] = v[v.length-2].split("%");
                double discount =Double.parseDouble(vDiscount[0]);
                double total = price -(price*discount)/100;
                lista.add(total+"");
                System.out.println(String.join("|", lista));
                //escribir.println(String.join(",", lista));
                escribir.println(lista.get(0)+","+lista.get(1)+","+lista.get(2)+","+lista.get(3));
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
