/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package clase8;

/**
 * @author Douglas Soch
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // Manejo de archivo
//        ManejoArchivo archivo = new ManejoArchivo();
//        String contenido = archivo.leerArchivo("C:\\Users\\sochd\\Desktop\\test.20ipc");
//        System.out.println(contenido);

        // Metodos de ordenamiento
        int[] arreglo = {7, 6, 5, 17, 3, 18, 11};
        MetodosOrdenamiento ordenamiento = new MetodosOrdenamiento();
        // int[] respuesta = ordenamiento.ordenamientoBurbuja(arreglo);
        // int[] respuesta = ordenamiento.ordenamientoSelecion(arreglo);
        // int[] respuesta = ordenamiento.ordenamientoInsercion(arreglo);
        ordenamiento.ordenamientoRapido(arreglo);
        for (int i : arreglo) {
            System.out.println(i);
        }
        
    }

}
