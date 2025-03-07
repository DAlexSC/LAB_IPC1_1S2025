package controlador;

import java.awt.event.ActionListener;
import modelo.ModeloIngresoCliente;
import modelo.ModeloIngresoCompra;
import vistas.frmIngresoCliente;
import vistas.frmIngresoCompra;
import vistas.frmMenuPrincipal;

/**
 *
 * @author Douglas Soch
 */
public class ControladorMenuPrincipal {

    frmMenuPrincipal vista;

    public ControladorMenuPrincipal(frmMenuPrincipal vista) {
        this.vista = vista;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.btnCliente.addActionListener(ingresoCliente());
        this.vista.btnCompra.addActionListener(ingresoCompra());
    }
    
    public ActionListener ingresoCliente(){
        return e -> {
            frmIngresoCliente vistaIngresoCliente = new frmIngresoCliente();
            ModeloIngresoCliente modeloIngresoCliente = new ModeloIngresoCliente();
            ControladorIngresoCliente controladorIngresoCliente = new ControladorIngresoCliente(vistaIngresoCliente, modeloIngresoCliente);
            controladorIngresoCliente.init();
        };
    }
    
    public ActionListener ingresoCompra(){
        return e -> {
            frmIngresoCompra vistaIngresoCompra = new frmIngresoCompra();
            ModeloIngresoCompra modeloIngresoCompra = new ModeloIngresoCompra();
            ControladorIngresoCompra controladorIngresoCompra = new ControladorIngresoCompra(vistaIngresoCompra, modeloIngresoCompra);
            controladorIngresoCompra.init();
        };
    }
    
}
