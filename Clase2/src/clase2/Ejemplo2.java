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
public class Ejemplo2 {

    /**
    OPERADORES ARITMETICOS, RELACIONALES Y LOGICOS; PRIORIDAD ENTRE OPERADORES; ESTRUCTURA DE CONTROL; CICLOS:

    Escribe un programa en Java que permita al usuario realizar operaciones aritméticas básicas (suma, resta, multiplicación, división). 
    El programa debe solicitar al usuario dos números y la operación que desea realizar. 
    Luego, muestra el resultado de la operación. Usa estructuras de control para manejar las opciones del usuario y ciclos para permitir múltiples operaciones.
     */
    public Ejemplo2() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

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
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: Division por cero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opcion inválida.");
                    continue;
            }

            System.out.println("El resultado es: " + resultado);
        }
    }
}
