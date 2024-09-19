/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Comparar los números
        if (num1 > num2) {
            System.out.println("El primer número es mayor.");
        } else if (num1 > num2) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close();
    }
}
