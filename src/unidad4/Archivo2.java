package unidad4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo2 {
    public static void main(String[] args) {
        //CARGAR EL ARCHIVO E IMPRIMIR TODOS LOS POKEMON
        //GUARDAR EN UNA LISTA DE CADENAS LOS POKEMON LEGENDARIOS
        //TRANSFORMAR LA CADENA EN BOOLEAN
        try {
            File a = new File("C:\\pokemon.csv");
            Scanner leer= new Scanner(a);
            ArrayList<String> lista = new ArrayList<>();
            int c=0;
            while (leer.hasNextLine()) {                
                String cadena = leer.nextLine();
                String v[] = cadena.split(",");
                System.out.println(cadena);
                boolean b = Boolean.parseBoolean(v[12]);
                if(b==true){
                    lista.add(cadena);
                }
            }
            System.out.println("Legendarios= "+lista.size());
            for (String string : lista) {
                System.out.println(string);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
