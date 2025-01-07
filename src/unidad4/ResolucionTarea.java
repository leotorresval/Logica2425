package unidad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResolucionTarea {

    public static void main(String[] args) {
        escritura2();
    }

    public static void escritura2() {
        PrintWriter escribir = null;
        try {
            File archivo = new File("D:\\escritura2.txt");
            File archivo2 = new File("D:\\escritura2-2.txt");
            escribir = new PrintWriter(archivo);
            PrintWriter escribir2 = new PrintWriter(archivo2);
            while (true) {
                String unir="";
                Scanner teclado = new Scanner(System.in);
                System.out.print("Ingrese su cedula: ");//1801
                unir+=teclado.nextLine();
                System.out.print("Ingrese un nombre: ");//Andres
                unir+=","+teclado.nextLine();
                System.out.print("Ingrese un apellido: ");//Ramirez
                unir+=","+teclado.nextLine();
                System.out.print("Ingrese su telefono: ");//1801
                unir+=","+teclado.nextLine();
                System.out.print("Ingrese su pais: ");//Andres
                unir+=","+teclado.nextLine();
                System.out.print("Ingrese su ciudad: ");//Ramirez
                unir+=","+teclado.nextLine();
                escribir.println(unir.toLowerCase());//MINUSCULAS
                escribir2.println(unir.toUpperCase());//MAYUSCULAS
                System.out.println("Desea ingresar otro nombre si/no");
                String respuesta= teclado.nextLine();
                if(!respuesta.equalsIgnoreCase("si"))//
                    break;
            }
            //Cerrar el archivo
            escribir.close();
            escribir2.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static void test(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Perez");
        lista.add("QUIto");
        lista.add("ecuador");
        String nuevo = String.join("-", lista);
        System.out.println(nuevo);
    }
    
}
