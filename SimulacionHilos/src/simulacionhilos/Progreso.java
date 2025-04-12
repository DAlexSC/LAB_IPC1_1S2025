package simulacionhilos;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import javax.swing.SwingUtilities;

/**
 *
 * @author Douglas Soch
 */
public class Progreso {

    frmCarga vista;
    
    // Colas de trabajo
    private final BlockingQueue<Integer> colaEspera = new LinkedBlockingDeque<>();
    private final BlockingQueue<Integer> enServicio = new LinkedBlockingDeque<>();
    private final BlockingQueue<Integer> entregaVehiculo = new LinkedBlockingDeque<>();

    public Progreso(frmCarga vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        
        // Iniciar los procesos en hilos separados
        new Thread(this::cargarColaEspera).start();
        new Thread(this::cargarEnServicio).start();
        new Thread(this::cargarEntregaVehiculo).start();
    }
    
    public void agregarVehiculo(int idVehiculo) {
        try {
            colaEspera.put(idVehiculo);
            System.out.println("Vehículo " + idVehiculo + " agregado a la cola de espera.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void cargarColaEspera() {
        while (true) {
            try {
                int vehiculo = colaEspera.take(); // Espera hasta que haya un vehículo en la cola
                // System.out.println("Procesando vehículo " + vehiculo + " en Cola de Espera...");
                
                for (int i = 0; i <= 100; i++) {
                    final int progreso = i;
                    SwingUtilities.invokeLater(() -> vista.pbColaEspera.setValue(progreso));
                    Thread.sleep(100);
                }
                
                SwingUtilities.invokeLater(() -> vista.lblColaEspera.setText(vehiculo + "/5"));
                enServicio.put(vehiculo); // Mueve a "En Servicio"
                // System.out.println("Vehículo " + vehiculo + " pasó a En Servicio.");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void cargarEnServicio() {
        while (true) {
            try {
                int vehiculo = enServicio.take(); // Espera hasta que haya un vehículo en servicio
                System.out.println("Procesando vehículo " + vehiculo + " en En Servicio...");

                for (int i = 0; i <= 100; i++) {
                    final int progreso = i;
                    SwingUtilities.invokeLater(() -> vista.pbEnServicio.setValue(progreso));
                    Thread.sleep(50);
                }

                SwingUtilities.invokeLater(() -> vista.lblEnServicio.setText(vehiculo + "/5"));
                entregaVehiculo.put(vehiculo); // Mueve a "Entrega de Vehículo"
                System.out.println("Vehículo " + vehiculo + " pasó a Entrega de Vehículo.");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void cargarEntregaVehiculo() {
        while (true) {
            try {
                int vehiculo = entregaVehiculo.take(); // Espera hasta que haya un vehículo para entrega
                System.out.println("Procesando vehículo " + vehiculo + " en Entrega de Vehículo...");

                for (int i = 0; i <= 100; i++) {
                    final int progreso = i;
                    SwingUtilities.invokeLater(() -> vista.pbEntregaVehiculo.setValue(progreso));
                    Thread.sleep(150);
                }

                SwingUtilities.invokeLater(() -> vista.lblEntregaVehiculo.setText(vehiculo + "/5"));
                System.out.println("Vehículo " + vehiculo + " ha sido entregado.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}
