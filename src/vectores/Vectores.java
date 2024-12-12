package vectores;

import controldatos.ControlDatos;
import java.util.Scanner;
import objetos.Persona;

public class Vectores {

    public static void main(String[] args) {
        //definicionVector();
        //vectorEdades();
        //vectorNombre();
        int l[]={70,13,5,7,23,5,7,9};
        repaso(l);
        repetidos();
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
        double promedio = 0;
        //ASIGNACION
        for (int i = 0; i < edades.length; i++) {
            System.out.print("[" + (i + 1) + "/" + edades.length + "] Ingrese la edad: ");
            edades[i] = teclado.nextInt();
            promedio = promedio + edades[i];
        }
        promedio = promedio / edades.length;
        System.out.println("El promedio es: " + promedio);
        int j = 0;
        for (int i = 0; i < edades.length; i++) {
            int valor = edades[i];
            if (valor > promedio) {
                j++;
            }
        }
        System.out.println("cantidad de personas con "
                + "edad superior al promedio es: " + j);
        int mayor = 0;
        mayor = edades[0];
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= mayor) {
                mayor = edades[i];
            }
        }
        System.out.println("La edad mayor es: " + mayor);
    }

    public static void vectorNombre() {
        //GENERE EL CODIGO PARA CREAR UN VECTOR
        //QUE CONTENGA NOMBRES DE PERSONAS
        //LA DIMENSION DEL VECTOR ES DE 10
        String lista[] = new String[4];
        for (int i = 0; i < lista.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese un nombre: ");
            lista[i] = teclado.next().toUpperCase();
        }
        //IMPRIMIR LA CANTIDAD DE LETRAS
        for (int i = 0; i < lista.length; i++) {
            String nombre = lista[i];
            int cantidad = nombre.length();
            System.out.println(nombre + "=" + cantidad);
        }

        //CONTAR NOMBRES TERMINADOS EN VOCAL
        int c = 0;
        for (int i = 0; i < lista.length; i++) {
            int ultima = lista[i].length() - 1;
            String nombre = lista[i];
            char letra = nombre.charAt(ultima);
            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {
                c++;
            }
        }
        System.out.println("# Nombres con vocal: " + c);
        char letra = 'a';
        int numero = letra;

        //INDICAR QUE NOMBRE VA PRIMERO ALFABETICAMENTE
        String primero = lista[0];
        String ultimo = lista[0];

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].charAt(0) < primero.charAt(0)) {
                primero = lista[i];
            }
            if (lista[i].charAt(0) > ultimo.charAt(0)) {
                ultimo = lista[i];
            }
        }

        System.out.println("El primer nombre alfabeticamente es: " + primero);
        System.out.println("El ultimo nombre alfabeticamente es: " + ultimo);

        //ORDENAR EL VECTOR ALFABETICAMENTE
        ordenarVector(lista);
    }

    public static void ordenarVector(String[] cadenas) {
        //ORDENAR EL VECTOR
        for (int i = 0; i < cadenas.length; i++) {
            String primera = cadenas[i];
            char letraPalabra = primera.charAt(0);
            for (int j = i + 1; j < cadenas.length; j++) {
                char letraVector = cadenas[j].charAt(0);
                if (letraVector < letraPalabra) {
                    cadenas[i] = cadenas[j];
                    cadenas[j] = primera;
                    primera = cadenas[i];
                    letraPalabra = cadenas[i].charAt(0);
                }

            }
        }
        System.out.println("--------------------------");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }
        System.out.println("--------------------------");

    }

    public static void vectorPersonas() {
        //GENERE EL CODIGO PARA CREAR UN VECTOR
        //QUE CONTENGA NOMBRES DE PERSONAS
        //LA DIMENSION DEL VECTOR ES DE 10
        Persona lista[] = new Persona[10];
        for (int i = 0; i < lista.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese la cedula: ");
            String cedula = teclado.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = teclado.next();
            lista[i] = new Persona(cedula, nombre);
        }
    }

    //int l[]={1,3,5,7,23,5,7,9};
    public static void repaso(int[] lista) {
        imprimir(lista);
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length ; j++) {
                if (lista[i] > lista[j]) {
                    int a = lista[i];
                    lista[i] = lista[j];
                    lista[j] = a;
                }
            }
        }
        System.out.println("");
        imprimir(lista);
    }
    
    public static void imprimir(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+i+"]: "+vector[i]);
        }
    }
            
            
    public static void repetidos(){
        int cUnicos=0;
        int c=0;
        int [] v ={1,2,3,11,2,5};
        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if(v[i]==v[j]){
                    cUnicos++;
                }
            }
            if(cUnicos>0){
                c++;
            }
            cUnicos=0;
        }
        c=v.length-(v.length-c);
        System.out.println("Valores unicos "+(c));
    }       
            
    

}
