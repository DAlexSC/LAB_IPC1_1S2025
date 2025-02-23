/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sochd
 */
public class Ejemplo3 {

    /**
    ARREGLOS; LISTAS DINAMICAS:

    Escribe un programa en Java que permita al usuario gestionar una lista de nombres. 
    El programa debe permitir al usuario agregar nombres, visualizar todos los nombres almacenados 
    y buscar un nombre específico en la lista.
    */
    
    public Ejemplo3() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Ver nombres");
            System.out.println("3. Buscar nombre");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un nombre: ");
                    String nombre = scanner.nextLine();
                    names.add(nombre);
                    break;
                case 2:
                    System.out.println("Nombres almacenados:");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;
                case 3:
                    System.out.print("Introduce el nombre a buscar: ");
                    String buscarNombre = scanner.nextLine();
                    if (names.contains(buscarNombre)) {
                        System.out.println("Nombre encontrado: " + buscarNombre);
                    } else {
                        System.out.println("Nombre no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
    
}
