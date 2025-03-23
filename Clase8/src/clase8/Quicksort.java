package clase8;

/**
 *
 * @author Douglas Soch
 */
public class Quicksort {

    public void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private void quickSortHelper(int[] arr, int inicio, int fin) {
        if (inicio >= fin) return; // Caso base: si la lista tiene 1 o 0 elementos, ya está ordenada.

        int pivote = arr[fin]; // Elegimos el último elemento como pivote.
        int indiceMenores = inicio; // Índice para los números menores al pivote.

        // Recorremos el array y movemos los menores al inicio
        for (int i = inicio; i < fin; i++) {
            if (arr[i] < pivote) {
                intercambiar(arr, i, indiceMenores);
                indiceMenores++;
            }
        }

        // Colocamos el pivote en su posición correcta
        intercambiar(arr, indiceMenores, fin);

        // Llamamos recursivamente para ordenar las dos mitades
        quickSortHelper(arr, inicio, indiceMenores - 1);
        quickSortHelper(arr, indiceMenores + 1, fin);
    }

    private void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
