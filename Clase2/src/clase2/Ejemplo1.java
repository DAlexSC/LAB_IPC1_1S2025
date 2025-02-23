/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;
import java.util.Scanner;

/**
 *
 * @author sochd
 */
public class Ejemplo1 {

    /*
    INPUT & OUTPUT:

    Escribe un programa en Java que solicite al usuario su nombre y luego le dé la bienvenida. 
    Además, pide al usuario que ingrese un número entero y muestra ese número multiplicado por 2.
    */
    public Ejemplo1() {
        Scanner scanner = new Scanner(System.in);
        
        // Leer nombre del usuario
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");

        // Leer un número entero del usuario
        System.out.println("Introduce un numero entero:");
        int numero = scanner.nextInt();
        int resultado = numero * 2;
        System.out.println("El numero multiplicado por 2 es: " + resultado);
    }
    
}
