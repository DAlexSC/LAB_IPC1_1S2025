/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package claseextra1;

import java.util.Scanner;

/**
 * @author Douglas Soch
 */
public class ClaseExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] tablero = new char[10][10];
        
        // Algoritmo para llenar el tablero con caracteres aleatorios
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                tablero[fila][columna] = (char) (Math.random()*25 + 65);
            }
        }
        
        // Algoritmo para ingresar las palabras segun la cantidad que desea el usuario
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de palabras:");
        int cantidad = leer.nextInt();
        String[] palabras = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese su palabra (" + (i + 1) + "):");
            palabras[i] = leer.next();
        }
        
        // Se elige la primer palabra del arreglo de palabras
        String palabra = palabras[0];
        
        // Algoritmo para definir la palabra horizontalmente en la fila con indice 1
        for (int i = 0; i < palabra.length(); i++) {
            tablero[1][i] = palabra.charAt(i);
        }
        
        // Algoritmo para definir la palabra verticalmente en la columna con indice 9
        for (int i = 0; i < palabra.length(); i++) {
            tablero[i][9] = palabra.charAt(i);
        }
        
        // Algoritmo para mostrar el tablero en consola (NOTA: Se necesita un diseño distinto)
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                System.out.print(tablero[fila][columna] + "|");
            }
            System.out.println("");
            System.out.println("********************");
        }
    }

}
