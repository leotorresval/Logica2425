package metodos;

import controldatos.ControlDatos;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Metodos {

    public static void main(String[] args) {
        saludo();
        //A traves de variable
        String name = "Juan Perez";
        saludo(name);
        //Dato directo
        saludo("Juan Perez Directo");
        //Recibir a traves de una variable y usarla
        String cadena = retornaSaludo();
        System.out.println(cadena);
        //Usarla directamente
        System.out.println(retornaSaludo() + " llamado directo");
        System.out.println(retornaFecha());
        cadena = retornaSaludo("Leonardo");
        System.out.println(cadena);
        int numero = ControlDatos.lecturaEnteros();
        int valor = calculoFactorial(numero);
        System.out.println(valor);
    }

    //METODOS SIN RETORNO Y SIN PARAMETROS
    public static void saludo() {
        System.out.println("Hola mundo");

    }

    //METODOS SIN RETORNO Y CON PARAMETROS
    public static void saludo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    //METODOS CON RETORNO Y SIN PARAMETROS
    public static String retornaSaludo() {
        return "Hola mundo";
    }

    //METODOS CON RETORNO Y SIN PARAMETROS
    public static String retornaFecha() {
        return LocalDate.now().toString();
    }

    //METODOS CON RETORNO Y CON PARAMETROS
    public static String retornaSaludo(String nombre) {
        return "Saludos, " + nombre;
    }

    public static int calculoFactorial(int num) {
        int acu = 1;
        int i = 1;
        while (i <= num) {
            acu = acu * i;
            i++;
        }
        return acu;
    }

}
