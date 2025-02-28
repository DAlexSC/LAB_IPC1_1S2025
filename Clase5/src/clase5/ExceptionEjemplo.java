package clase5;

import java.util.Scanner;

/**
 *
 * @author Douglas Soch
 */
public class ExceptionEjemplo {

    public void example1(){
        Scanner leer = new Scanner(System.in);
        boolean ejecutar = true;
        int[] numbers = {1, 2, 3};

        while (ejecutar) {
            try {
                System.out.println("**********************");
                System.out.println("Eliga una opcion:");
                System.out.println("1. Cambiar valores");
                System.out.println("2. Salir");
                System.out.println("**********************");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Selecciona la posicion a modificar");
                        int posicion = leer.nextInt();
                        ImprimirMensaje mensaje = new ImprimirMensaje();
                        mensaje.imprimirMensaje();
                        int valor = leer.nextInt();
                        numbers[posicion] = valor;
                        break;
                    case 2:
                        ejecutar = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Has intentado acceder a un índice fuera del rango del array.");
            } catch (NullPointerException n){
                System.out.println("Error: Esta accediendo a un valor nulo");
            } catch (Throwable th) {
                System.out.println("Error: " + th + " - " + th.getMessage());
            } finally {
                System.out.println("El bloque finally siempre se ejecuta.");
            }
        }
        System.out.println("El programa continúa ejecutándose después del try-catch.");
    }
    
    public void example2() throws Exception {
        method1();
    }
    
    private void method1() throws Exception {
        method2();
    }
    
    private void method2() throws Exception {
        throw new Exception("Error en el method2");
    }
    
}
