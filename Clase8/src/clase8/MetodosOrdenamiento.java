package clase8;

/**
 *
 * @author Douglas Soch
 */
public class MetodosOrdenamiento {

    public int[] ordenamientoBurbuja(int[] arreglo){
        
        boolean ocurrioCambio;
        
        do {
            ocurrioCambio = false;
            for (int i = 0; i < arreglo.length - 1; i++){
                
                int actual = arreglo[i];
                int adyacente = arreglo[i+1];
                
                if (actual < adyacente){
                    arreglo[i] = adyacente;
                    arreglo[i+1] = actual;
                    ocurrioCambio = true;
                }
            }
            
        } while (ocurrioCambio);
        
        return arreglo;
    }
    
    public int[] ordenamientoSelecion(int[] arreglo){
        
        int n = arreglo.length;
        
        for (int i = 0; i < n - 1; i++) {
            
            int indiceMinimo = i;            
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]){
                    indiceMinimo = j;
                }
            }
            
            int temporal = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temporal;
        }

        return arreglo;
    }
    
    public int[] ordenamientoInsercion(int[] arreglo){
        
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int valor = arreglo[i];
            int j = i - 1;
            
            while (j >= 0 && arreglo[j] > valor){
                arreglo[j+1] = arreglo[j];
                j = j - 1;
            }
            
            arreglo[j+1] = valor;
        }
        
        return arreglo;
    }
    
    public void ordenamientoRapido(int[] arreglo){
        Quicksort quick = new Quicksort();
        quick.quickSort(arreglo);
    }
    
}
