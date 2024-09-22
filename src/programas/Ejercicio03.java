
package programas;

/**
 * Hacer un programa que calcule la suma de los digitos
 * @author ALIEN
 */

import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = leer.nextInt();
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10; // Extrae el último dígito
            suma += digito; // Suma el dígito
            numero /= 10; // Elimina el último dígito
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
    
}
