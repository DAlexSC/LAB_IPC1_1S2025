/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */
package ejemploventanas;

import controlador.InicioSesionControlador;
import modelo.InicioSesionModelo;
import vista.frmInicioSesion;

/**
 * @author Douglas Soch
 */
public class EjemploVentanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmInicioSesion vistaSesion = new frmInicioSesion();
        InicioSesionModelo modeloSesion = new InicioSesionModelo();
        InicioSesionControlador controladorSesion = new InicioSesionControlador(modeloSesion, vistaSesion);
        controladorSesion.iniInterfaz();
    }

}
