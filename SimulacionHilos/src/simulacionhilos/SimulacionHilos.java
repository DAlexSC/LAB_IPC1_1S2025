/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package simulacionhilos;

/**
 * @author Douglas Soch
 */
public class SimulacionHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmCarga vista = new frmCarga();
        Progreso progreso = new Progreso(vista);
        
        // Agregar vehículos de forma simulada
        for (int i = 1; i <= 5; i++) {
            progreso.agregarVehiculo(i);
            try {
                Thread.sleep(2000); // Simula llegada de vehículos en intervalos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }      
    }

}
