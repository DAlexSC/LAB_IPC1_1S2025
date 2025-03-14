package controlador;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import modelo.Bitacoras;
import modelo.Database;
import modelo.ModeloBitacoras;
import modelo.ModeloHilo;
import vista.frmBitacoras;
import vista.frmVistaHilo;

/**
 *
 * @author Douglas Soch
 */
public class ControladorHiloMetodos {

    frmVistaHilo vista;
    ModeloHilo modelo;

    public ControladorHiloMetodos(frmVistaHilo vista, ModeloHilo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.setTitle("Pantalla principal");
        this.vista.btnBitacora.addActionListener(generarBitacora());
        this.definirTiempo();
        this.definirRandom();
    }
    
    public ActionListener generarBitacora(){
        return e -> {
            frmBitacoras vistaBitacora = new frmBitacoras();
            ModeloBitacoras modeloBitacora = new ModeloBitacoras();
            ControladorBitacoras controladorBitacora = new ControladorBitacoras(vistaBitacora, modeloBitacora);
        };     
    }
    
    public void definirTiempo() {
        
        
        Thread hilo = new Thread(() -> {

            boolean finalizar = false;
            while (!finalizar) {
                if (modelo.seconds == 10) {
                    finalizar = true;
                }
                this.vista.lblTiempo.setText(modelo.currentTime());
                // Incrementa el tiempo
                modelo.incrementSeconds();
                LocalDateTime now = LocalDateTime.now();
                Database.bitacoras.add(new Bitacoras(now.toString(),"Aumento de segundos", "Error", "Se aumento el tiempo de mi reloj en un segundo :D"));
                System.out.println(now.toString() + " - " + "Aumento de segundos...");
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

    public void definirRandom() {
        Thread hilo = new Thread(() -> {
            Random random = new Random();
            while (true) {
                Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                this.vista.lblToken.setText(modelo.generateRandomString());
                this.vista.lblToken.setForeground(randomColor);
                LocalDateTime now = LocalDateTime.now();
                Database.bitacoras.add(new Bitacoras(now.toString(),"Generacion de token", "Exito", "Se genero un token nuevo para el usuario."));
                Database.bitacoras.add(new Bitacoras(now.toString(),"Cambio de color de token", "Exito", "Se cambio el color del token a: " + randomColor.toString()));
                try {
                    // Duerme un segundo (1000 milisegundos)
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hilo.start();
    }
    
}
