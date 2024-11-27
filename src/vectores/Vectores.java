package vectores;

import controldatos.ControlDatos;
import java.util.Scanner;
import objetos.Persona;

public class Vectores {

    public static void main(String[] args) {
        definicionVector();
        vectorEdades();
    }

    public static void definicionVector() {
        //TIPO_DATO NOMBRE [] = new TIPO_DATO [DIMENSION]
        int edades[] = new int[39];
        String nombres[] = new String[39];
        char inicialN[] = new char[39];
        boolean generos[] = new boolean[1800];
        Persona personas[] = new Persona[20];
        //MANIPULACION
        //ASIGNACION
        edades[38] = edades[21] = edades[12] = 25;
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        inicialN[0] = 'M';
        generos[1799] = true;
        Persona p1 = new Persona("1801", "Rodrigo");
        Persona p2 = new Persona("1802", "Amelia");
        Persona p3 = new Persona("1803", "James");
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        System.out.println(personas[0].getCedula());
        System.out.println(personas[0].getNombre());
        System.out.println(personas[0].getApellido());
        //RECUPERACION
        int edad = edades[38];
        System.out.println(edad);
        String nombre = nombres[0];
        System.out.println(nombre);

    }

    public static void vectorEdades() {
        Scanner teclado = new Scanner(System.in);
        int edades[] = new int[12];
        double promedio=0;
        //ASINGACION
        for (int i = 0; i < edades.length; i++) {
            System.out.print("["+(i+1)+"/"+edades.length+"] Ingrese la edad: ");
            edades[i] = teclado.nextInt();
            promedio = promedio+edades[i];
        }
        promedio = promedio/edades.length;
        System.out.println("El promedio es: "+promedio);
        int j =0;
        for (int i = 0; i < edades.length; i++) {
            int valor= edades[i];
            if (valor>promedio) {
                j++;
            }
        }
        System.out.println("cantidad de personas con "
                + "edad superior al promedio es: "+j);
        int mayor=0;
        mayor=edades[0];
        for (int i = 0; i < edades.length; i++) {
            if (edades[i]>=mayor) {
                mayor=edades[i];
            }
        }
        System.out.println("La edad mayor es: "+mayor);
    }
    
    public static void vectorNombre(){
        //GENERE EL CODIGO PARA CREAR UN VECTOR
        //QUE CONTENGA NOMBRES DE PERSONAS
        //LA DIMENSION DEL VECTOR ES DE 10
    }
    
    public static void vectorPersonas(){
        //GENERE EL CODIGO PARA CREAR UN VECTOR
        //QUE CONTENGA NOMBRES DE PERSONAS
        //LA DIMENSION DEL VECTOR ES DE 10
        Persona lista[] = new Persona[10];
        for (int i = 0; i < lista.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese la cedula: ");
            String cedula= teclado.next();
            System.out.print("Ingrese el nombre: ");
            String nombre= teclado.next();
            lista[i] = new Persona(cedula, nombre);
        }
    }
    
    
    
    
}
