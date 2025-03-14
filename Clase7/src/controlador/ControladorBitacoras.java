package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Bitacoras;
import modelo.Database;
import modelo.ModeloBitacoras;
import vista.frmBitacoras;

/**
 *
 * @author Douglas Soch
 */
public class ControladorBitacoras {

    frmBitacoras vista;
    ModeloBitacoras modelo;

    public ControladorBitacoras(frmBitacoras vista, ModeloBitacoras modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.setTitle("Bitacoras");
        this.mostrarInformacion();
    }
    
    public void mostrarInformacion(){
        ArrayList<Bitacoras> bitacoras = Database.bitacoras;
        DefaultTableModel model = (DefaultTableModel) this.vista.tblBitacoras.getModel();
        for (Bitacoras bitacora : bitacoras) {
            Object[] row = { bitacora.tiempo, bitacora.accion, bitacora.resultado, bitacora.detalles };
            model.addRow(row);
        }
    }
    
}
