package metodos;

import controldatos.ControlDatos;
import java.util.Random;

public class DatosAleatorios {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        System.out.println("Letra "+letraAleatoria());
    }
    
    //NUMERO ALEATORIO ALTO
    public static int aleatorioAlto(){
        int valor = aleatorio.nextInt();
        return valor;
    }
    //NUMERO ALEATORIO ENTRE 0 Y UN VALOR
    public static int aleatorio(int rango){
        int valor = aleatorio.nextInt(rango);
        return valor;
    }
    //NUMERO ALEATORIO ENTRE UN RANGO DE VALORES
    public static int aleatorio(int min, int max){
        return aleatorio.nextInt(min,max);
    }
    
    //NUMERO ALEATORIO ENTRE UN RANGO DE VALORES
    public static int aleatorio2(int min, int max){
        return aleatorio.nextInt(max-min)+min;
    }
    
    //CARACTER ALEATORIO
    public static char letraAleatoria(){
        int valor = aleatorio.nextInt(65,91);
        char letra = (char) valor;
        return letra;
    }
    
}
