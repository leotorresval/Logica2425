package refuerzo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RefuerzoArchivos {
    //REALICE LA LECTURA DEL ARCHIVO DE PRODUCTOS
    //-GENERE UN NUEVO ARCHIVO QUE CONTENGA PRODUCTOS
    //CON UN PRECIO INFERIOR A 500
    //-GENERE UN NUEVO ARCHIVO QUE CONTENGA PRODUCTOS
    //CON UN DESCUENTO ENTRE 20% Y 30%
    //-GENERE UN ARCHIVO QUE CONTENGA PRODUCTOS 
    //CON MAS DE UNA TALLA
    //-GENERE UNA LISTA CON PRODUCTOS
    //QUE SU NOMBRE COMIENCE CON W IGNORANDO EL CODIGO
    //-GENERE UNA LISTA CON PRODUCTOS
    //EN DONDE EL PRECIO ES MENOR AL 50% DEL MRP
    //-GENERE UN LISTADO CON PRODUCTOS 
    //DE COLOR VERDE Y PRECIO SUPERIOR A 1000
    //-GENERE UN LISTADO CON PRODUCTOS 
    //QUE SEAN DE TALLA XX-LARGE
    public static void main(String[] args) {
        ejercicio3();
    }

    public static Scanner lecturaArchivo() {
        Scanner lectura;
        File archivo = new File("F:/ALP/Message Group - Product.csv");
        try {
            lectura = new Scanner(archivo);
            return lectura;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RefuerzoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void ejercicio1() {
        Scanner leer = lecturaArchivo();
        File archivo = new File("F:/ALP/ejercicio1.csv");
        try {
            PrintWriter escribir = new PrintWriter(archivo);
            leer.nextLine();
            while (leer.hasNextLine()) {
                String cadena = leer.nextLine();
                String v[] = cadena.split(",");
                int precio = Integer.parseInt(v[v.length - 3]);
                if (precio < 500) {
                    escribir.println(cadena);
                }
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RefuerzoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ejercicio3() {
        Scanner leer = lecturaArchivo();
        File archivo = new File("F:/ALP/ejercicio3.csv");
        try {
            PrintWriter escribir = new PrintWriter(archivo);
            leer.nextLine();
            while (leer.hasNextLine()) {
                String cadena = leer.nextLine();
                String b[] = cadena.split(",\"Size");
                String c[] = cadena.split(",Size:");
                if (b.length > 1) {
                    String b1[]=b[1].split("\",");
                    String b2[]=b1[0].split(",");
                    if(b2.length>1){
                        escribir.println(cadena);
                    }
                }
                if (c.length > 1) {
                     String b1[]=c[1].split(",Rs");
                    String b2[]=b1[0].split(",");
                    if(b2.length>1){
                        escribir.println(cadena);
                    }
                }
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RefuerzoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
