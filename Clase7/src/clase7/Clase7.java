/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package clase7;

import EjemploHerencia.Gato;
import EjemploHerencia.Perro;
import controlador.ControladorHilo;
import controlador.ControladorHiloClaseThread;
import controlador.ControladorHiloImplementsRunnable;
import controlador.ControladorHiloMetodos;
import modelo.ModeloHilo;
import vista.frmVistaHilo;

/**
 * @author Douglas Soch
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Perro perro = new Perro("Loki", "Snauzer");
//        perro.ladrar();
//        perro.comer();
//        
//        Gato gato = new Gato("Cookie", "Cafe");
//        System.out.println("");
//        gato.maullar();
//        gato.comer();
        
//        Animal perro_animal = new Perro("Loki", "Snauzer");
//        perro_animal.comer();

        frmVistaHilo vista = new frmVistaHilo();
        ModeloHilo modelo = new ModeloHilo();
        // ControladorHilo controlador = new ControladorHilo(vista, modelo);
        // ControladorHiloClaseThread controlador = new ControladorHiloClaseThread(modelo, vista);
        // ControladorHiloImplementsRunnable controlador = new ControladorHiloImplementsRunnable(vista, modelo);
        ControladorHiloMetodos controlador = new ControladorHiloMetodos(vista, modelo);
    }

}
