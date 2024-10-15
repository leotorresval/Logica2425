package tutoria;

import controldatos.ControlDatos;

public class TutoriaMetodos {

    public static void main(String[] args) {
        int longitud = metodo2("algoritmos y logica de programacion");
        System.out.println("La longitud de la palabra es: " + longitud);
    }

    public static double metodo(int valor) {
        double calculo = valor / 2;
        return calculo;

    }

    public static int metodo2(String cadena) {
        int longitud = cadena.length();
        return longitud;
    }

}
