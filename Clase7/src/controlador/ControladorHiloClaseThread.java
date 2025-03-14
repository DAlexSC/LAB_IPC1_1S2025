package controlador;

import java.awt.Color;
import java.util.Random;
import modelo.ModeloHilo;
import vista.frmVistaHilo;

class Tiempo extends Thread {

    ModeloHilo modelo;
    frmVistaHilo vista;

    public Tiempo(ModeloHilo modelo, frmVistaHilo vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    @Override
    public void run() {
        boolean finalizar = false;
        while (!finalizar) {
//            if (modelo.seconds == 10) {
//                finalizar = true;
//            }
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
}

class Token extends Thread {
    
    ModeloHilo modelo;
    frmVistaHilo vista;

    public Token(ModeloHilo modelo, frmVistaHilo vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void run() {
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

/**
 *
 * @author Douglas Soch
 */
public class ControladorHiloClaseThread {

    ModeloHilo modelo;
    frmVistaHilo vista;

    public ControladorHiloClaseThread(ModeloHilo modelo, frmVistaHilo vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.setTitle("Pantalla principal");
        this.generarTiempo();
        this.generarToken();
    }
    
    public void generarTiempo(){
        Tiempo tiempo = new Tiempo(modelo, vista);
        tiempo.start();
    }
    
    public void generarToken(){
        Token token = new Token(modelo, vista);
        token.start();
    }
    
}
