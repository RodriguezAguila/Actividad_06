/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 Crear un Progama que  solicita una contraseña al usuario 
 * hasta que ingrese la correcta.
 * Usa un bucle while para repetir el proceso hasta 
 * que se cumpla la condición.
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String contrasenaCorrecta = "1234";
        String contrasenaIngresada = "";

        while (!contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.print("Ingresa la contraseña: ");
            contrasenaIngresada = leer.nextLine();
        }

        System.out.println("¡Contraseña correcta!");
        
    }
    
    
}
