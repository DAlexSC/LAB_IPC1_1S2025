package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import modelo.ConfiguracionGrafica;
import vista.frmGrafica;

/**
 *
 * @author Douglas Soch
 */
public class GraficaControlador {

    frmGrafica vista;
    ConfiguracionGrafica config;

    public GraficaControlador(frmGrafica vista, ConfiguracionGrafica config) {
        this.vista = vista;
        this.config = config;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        // this.vista.btnRefresco.addActionListener(this.refrescar());
        this.refrescarGrafica();
    }
    
    private void refrescarGrafica (){
        Thread hilo = new Thread(() -> {

            while (true) {
                
                refrescar();
                try {
                    // Duerme un segundo (1000 milisegundos)
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hilo.start();
    }
   
    
    private void refrescar(){
        // Se limpia el panel
        this.vista.panGrafica.removeAll();

        // Se agrega el grafico al panel
        this.vista.panGrafica.setLayout(new BorderLayout());
        this.vista.panGrafica.add(this.config.dibujar(this.config.generarDataset()));
        this.vista.panGrafica.revalidate();
        this.vista.panGrafica.repaint();
    }
    
    
}
