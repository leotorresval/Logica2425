package unidad4;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Archivo2 {

    public static void main(String[] args) {
        generacionNoLegendarios();
    }

    public static void ejercicio1() {
        //CARGAR EL ARCHIVO E IMPRIMIR TODOS LOS POKEMON
        //GUARDAR EN UNA LISTA DE CADENAS LOS POKEMON LEGENDARIOS
        //TRANSFORMAR LA CADENA EN BOOLEAN
        try {
            File a = new File("C:\\pokemon.csv");
            Scanner leer = new Scanner(a);
            ArrayList<String> lista = new ArrayList<>();
            int c = 0;
            //MUEVE EL PUNTERO A LA SIGUIENTE POSICION
            //EVITANDO LA CABECERA
            leer.nextLine();
            while (leer.hasNextLine()) {
                String cadena = leer.nextLine();
                String v[] = cadena.split(",");
                //System.out.println(cadena);
                c += Integer.parseInt(v[4]);
                boolean b = Boolean.parseBoolean(v[12]);
                if (b == true) {
                    lista.add(cadena);
                }
            }
            System.out.println("Legendarios= " + lista.size());
            for (String string : lista) {
                System.out.println(string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //AñADIR EN UNA LISTA LOS POKEMON CON 
    //NOMBRE TERMINADO EN VOCAL
    //AÑADIR EN UNA LISTA LOS POKEMON CON TOTAL >300
    //AñADIR EN UNA LISTA LOS POKEMON DE TIPO FUEGO
    //AÑADIR EN UNA LISTA LOS POKEMON NO LEGENDARIOS DE 
    //GENERACION 3 Y GUARDELO EN UN NUEVO ARCHIVO
    public static void generacionNoLegendarios() {
        try {
            //enlace de lectura
            File archivo = new File("C:\\pokemon.csv");
            File salida = new File("C:\\generacionNoLegendaria.csv");
            
            Scanner teclado = new Scanner(archivo);
            PrintWriter escribir = new PrintWriter(salida);
            ArrayList<String> lista = new ArrayList<>();
            teclado.nextLine();
            while (teclado.hasNextLine()) {
                String cadena= teclado.nextLine();
                String[] v = cadena.split(",");
                int gen = Integer.parseInt(v[v.length - 2]);
                boolean legendary = Boolean.parseBoolean(v[v.length - 1]);
                if (!legendary && gen == 3) {
                    lista.add(cadena);
                    System.out.println(v[1]+"<>"+gen +"<>"+legendary);
                    escribir.println(v[1]+"<>"+gen +"<>"+legendary);
                }
            }
            escribir.close();
            //enlace de escritura
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
