/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package clase6mvc;

import controlador.ControladorInicioSesion;
import modelo.ModeloInicioSesion;
import vistas.frmInicioSesion;

/**
 * @author Douglas Soch
 */
public class Clase6MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmInicioSesion vista = new frmInicioSesion();
        ModeloInicioSesion modelo = new ModeloInicioSesion();
        ControladorInicioSesion controlador = new ControladorInicioSesion(vista, modelo);
        controlador.init();
    }

}
