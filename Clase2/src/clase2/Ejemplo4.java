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
public class Ejemplo4 {

    /**
    PROCEDIMIENTOS; FUNCIONES:

    Escribe un programa en Java que gestione una calculadora basica mediante el uso de procedimientos y funciones. 

    El programa debe permitir al usuario realizar las siguientes operaciones:

    * Suma
    * Resta
    * Multiplicacion
    * Division

    Debes implementar las operaciones aritmeticas como funciones que devuelven el resultado y 
    mostrar el resultado de la operacion mediante un procedimiento.

    Ademas, incluye un procedimiento para mostrar un menu y otro para leer la opcion del usuario.
    */
    public Ejemplo4() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = leerOpcion(scanner);

            if (opcion == 5) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.println("Introduce el primer numero:");
            int num1 = scanner.nextInt();
            System.out.println("Introduce el segundo numero:");
            int num2 = scanner.nextInt();

            int resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                    } else {
                        System.out.println("Error: Division por cero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    continue;
            }

            mostrarResultado(resultado);
        }
    }
    
    
    // Procedimiento para mostrar el menu
    public void mostrarMenu() {
        System.out.println("Seleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
    }

    // Procedimiento para leer la opcion del usuario
    public int leerOpcion(Scanner scanner) {
        System.out.print("Introduce tu opcion: ");
        return scanner.nextInt();
    }

    // Funcion para sumar dos numeros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Funcion para restar dos numeros
    public int restar(int a, int b) {
        return a - b;
    }

    // Funcion para multiplicar dos numeros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Funcion para dividir dos numeros
    public int dividir(int a, int b) {
        return a / b;
    }

    // Procedimiento para mostrar el resultado
    public void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }
    
}
