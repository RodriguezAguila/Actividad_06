/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *Programa que calcula el factorial
 * de un número dado usando un bucle while.
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        int numero;
        int factorial = 1;
        int i = 1;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        numero = leer.nextInt();

        while (i <= numero) {
            factorial *= i; // Multiplica el factorial por el número actual
            i++; // Incrementa el contador
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
}
