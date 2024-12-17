package unidad4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SpringLayout;

public class Archivo1 {

    public static void main(String[] args) {
        try {
            String ruta = "C:\\modificado.csv";
            File archivo = new File(ruta);
            Scanner leer = new Scanner(archivo);
            ArrayList<String> combustibles = new ArrayList<>();
            ArrayList<String> marcas = new ArrayList<>();
            while (leer.hasNextLine()) {
                //OBTENGO LA CADENA
                String cadena = leer.nextLine();
                //TRANSFORMO A VECTOR
                String[] v = cadena.split(";");
                //OBTENGO LA MARCA
                marcas.add(v[1000]);
            }

            System.out.println("Marcas almacenadas " + marcas.size());
            System.out.println("=====================");
            System.out.println("ELIMINAR MARCAS CORTAS");
            for (int i = 0; i < marcas.size(); i++) {
                if (marcas.get(i).length() <= 3) {
                    marcas.remove(i);
                }
            }
            System.out.println("Marcas almacenadas " + marcas.size());
            System.out.println("=====================");
            for (String marca : marcas) {
                System.out.println(marca);
            }
        } catch (Exception e) {
            System.out.println("Error:" );
            e.printStackTrace();
        }
    }
}
