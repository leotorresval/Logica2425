package condicionales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el peso en kilos");
        double kilos = teclado.nextDouble();
        System.out.println("Ingrese la estatura");
        double estatura = teclado.nextDouble();
        double imc = (kilos / (estatura * estatura));
        if (imc < 18.5) {
            System.out.println("Bajo Peso");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Normal");
            } else {
                if (imc >= 25 && imc <= 29.9) {
                    System.out.println("Sobrepeso");
                } else {
                    if (imc >= 30 && imc <= 34.9) {
                        System.out.println("Obsesidad 1");
                    }
                }
            }
        }
    }
}
