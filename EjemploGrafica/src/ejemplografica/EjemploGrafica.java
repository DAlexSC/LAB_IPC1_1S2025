/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package ejemplografica;

import controlador.GraficaControlador;
import modelo.ConfiguracionGrafica;
import vista.frmGrafica;

/**
 * @author Douglas Soch
 */
public class EjemploGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmGrafica vista = new frmGrafica();
        ConfiguracionGrafica configuracion = new ConfiguracionGrafica();
        GraficaControlador controlador = new GraficaControlador(vista, configuracion);
    }

}
