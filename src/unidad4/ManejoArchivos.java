package unidad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {

    public static void main(String[] args) {
        try {
            String ruta = "C:\\modificado.csv";
            File archivo = new File(ruta);
            Scanner teclado = new Scanner(archivo);
            while (teclado.hasNextLine()) {
                String v[] = teclado.nextLine().split(";");
                if (v.length>5) {
                    System.out.println(v[3] + "-" + v[5]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
