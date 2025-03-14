package controlador;

import java.awt.Color;
import java.util.Random;
import modelo.ModeloHilo;
import vista.frmVistaHilo;

/**
 *
 * @author Douglas Soch
 */
public class ControladorHilo {

    frmVistaHilo vista;
    ModeloHilo modelo;

    public ControladorHilo(frmVistaHilo vista, ModeloHilo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.setTitle("Pantalla principal");
        this.definirTiempo();
        this.definirRandom();
    }
    
    public void definirTiempo() {
        boolean finalizar = false;
        while (!finalizar) {
            if (modelo.seconds == 10) {
                finalizar = true;
            }
            this.vista.lblTiempo.setText(modelo.currentTime());
            // Incrementa el tiempo
            modelo.incrementSeconds();

            try {
                // Duerme un segundo (1000 milisegundos)
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void definirRandom() {
        Random random = new Random();
        while (true) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            this.vista.lblToken.setText(modelo.generateRandomString());
            this.vista.lblToken.setForeground(randomColor);
            try {
                // Duerme un segundo (1000 milisegundos)
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
